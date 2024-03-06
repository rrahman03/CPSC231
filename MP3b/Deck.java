import java.util.LinkedList;

public class Deck {
	// represents the cards in the deck
    private LinkedList<Card> m_cards;

	// constructor
    public Deck() {
        m_cards = new LinkedList<>();
        initializeDeck();
    }

	// copy constructor
    public Deck(Deck otherDeck) {
        m_cards = new LinkedList<>();
        for (Card card : otherDeck.m_cards) {
			// new copy of each card thats added
            m_cards.add(new Card(card));
        }
    }

    private void initializeDeck() {
        for (int suit = Card.HEARTS; suit <= Card.DIAMONDS; suit++) {
            for (int value = Card.TWO; value <= Card.ACE; value++) {
                m_cards.add(new Card(value, suit));
            }
        }
    }

    public String toString() {
        return m_cards.toString();
    }

	// getting # of cards in deck
    public int size() {
        return m_cards.size();
    }

	// deal random card
    public Card deal() {
		// checking if deck is empty
        if (m_cards.isEmpty()) {
            return null;
        }

		// select random card from deck
        int randomIndex = (int) (Math.random() * m_cards.size());
        return m_cards.remove(randomIndex);
    }

}
