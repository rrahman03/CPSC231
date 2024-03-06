package game;
import java.util.LinkedList;

public class Game {
    private LinkedList<Player> players;
    private LinkedList<Card> pile;
    private Dealer dealer;
    private String[] patterns;
    private Player currentPlayer;

    // default constructor 
    public Game() {
        this(2);
    }

    // constructor 
    public Game(int numPlayers) {
        players = new LinkedList<>();
        pile = new LinkedList<>();
        dealer = new Dealer();
        patterns = new String[]{"doubles", "topBottom", "sandwich"};
        currentPlayer = null;

        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player(i, dealer.deal(5), patterns[(int) (Math.random() * patterns.length)]));
        }
    }

    // getter methods

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public LinkedList<Card> getPile() {
        return pile;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public int play() {
        while (players.size() > 1) {
            currentPlayer = players.getFirst();
            Card playedCard = currentPlayer.playCard();
            pile.addLast(playedCard);

            if (playedCard.getValue() >= Card.JACK && playedCard.getValue() <= Card.ACE) {
                handleFaceCard(playedCard);
            }

            for (String pattern : patterns) {
                if (checkPattern(pattern, pile)) {
                    Player slappingPlayer = getRandomPlayer();
                    if (slappingPlayer.slaps(pile)) {
                        slappingPlayer.getHand().addAll(pile);
                        pile.clear();
                        break;
                    }
                }
            }

            players.addLast(players.removeFirst()); // move to next player
        }

        return players.getFirst().getPlayerNum(); // return winner's number
    }

    // get the next player
    public Player nextPlayer() {
        int nextIndex = (players.indexOf(currentPlayer) + 1) % players.size();
        return players.get(nextIndex);
    }

    public static boolean topBottom(LinkedList<Card> pile) {
       // return pile.size() >= 2 && pile.getLast().getValue() == pile.getFirst().getValue();
    	if (pile.size() >= 2) {
    		Card topCard = pile.peek();
    		Card bottomCard = pile.get(0);
    		return topCard.getValue() == bottomCard.getValue();
    	}
    	
    	return false;
    	
    	
    }

    public static boolean doubles(LinkedList<Card> pile) {
    	if (pile.size() >= 2) {
            Card topCard = pile.peek();
            Card secondTopCard = pile.get(pile.size() - 2);

            return topCard.getValue() == (secondTopCard.getValue());
        }
        return false;
        //return pile.size() >= 2 && pile.getLast().getValue() == pile.get(pile.size() - 2).getValue();
    }

    public static boolean sandwich(LinkedList<Card> pile) {
    	if (pile.size() >= 2) {
            Card topCard = pile.peek();
            Card bottomCard = pile.get(0);

            return topCard.getValue()==(bottomCard.getValue());
        }
        return false;
        
        //return pile.size() >= 3 && pile.getLast().getValue() == pile.getFirst().getValue()
                //&& pile.getLast().getValue() != pile.get(pile.size() - 2).getValue();
    }

    private void handleFaceCard(Card playedCard) {
        int chances = getChancesForFaceCard(playedCard);
        boolean faceCardPlayed = false;

        for (int i = 0; i < chances; i++) {
            Player nextPlayer = nextPlayer();
            Card nextPlayerCard = nextPlayer.playCard();
            pile.addLast(nextPlayerCard);

            if (nextPlayerCard.getValue() >= Card.JACK && nextPlayerCard.getValue() <= Card.ACE) {
                faceCardPlayed = true;
                break;
            }
        }

        if (!faceCardPlayed) {
            currentPlayer.getHand().addAll(pile);
            pile.clear();
        }
    }

    // # of chances
    private int getChancesForFaceCard(Card faceCard) {
        switch (faceCard.getValue()) {
            case Card.JACK:
                return 1;
            case Card.QUEEN:
                return 2;
            case Card.KING:
                return 3;
            case Card.ACE:
                return 4;
            default:
                return 0;
        }
    }

    // check is specific pattern is matched
    private boolean checkPattern(String pattern, LinkedList<Card> pile) {
        return "doubles".equals(pattern) && doubles(pile) ||
                "topBottom".equals(pattern) && topBottom(pile) ||
                "sandwich".equals(pattern) && sandwich(pile);
    }

    // get random player
    private Player getRandomPlayer() {
        int randomIndex = (int) (Math.random() * players.size());
        return players.get(randomIndex);
    }
}
