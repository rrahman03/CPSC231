import java.util.LinkedList;

public class Player {
    private int playerNum;
    private LinkedList<Card> hand;
    private String pattern;

    // constructor 
    public Player(int playerNum, LinkedList<Card> hand, String pattern) {
        this.playerNum = playerNum;
        this.hand = hand;
        this.pattern = pattern;
    }

    // getters

    public int getPlayerNum() {
        return playerNum;
    }

    public LinkedList<Card> getHand() {
        return hand;
    }

    public String getPattern() {
        return pattern;
    }

    public String toString() {
        return "Player " + playerNum + " | Pattern: " + pattern + " | Hand: " + hand;
    }

    // player can play a card
    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.removeFirst();
        } else { 
            return null; // returns null if hand is empty
        } 
    }

    // see if player should slap the pile or not
    public boolean slaps(LinkedList<Card> pile) {
        if (!hand.isEmpty()) {
            switch (pattern) {
                case "doubles":
                    return Game.doubles(pile);
                case "topBottom":
                    return Game.topBottom(pile);
                case "sandwich":
                    return Game.sandwich(pile);
                default:
                    return false;
            }
        }
        return false; // false if hand is empty
    }
    
}
