import java.util.LinkedList;

public class Dealer {
	// representing the deck used by the dealer
    private Deck m_deck;

	// Constructor 
    public Dealer() {
        m_deck = new Deck();
    }

    public LinkedList<Card> deal(int n) {
        LinkedList<Card> dealtCards = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Card dealtCard = m_deck.deal();
            if (dealtCard != null) {
				// Add the dealt card 
                dealtCards.add(dealtCard);
            } else {
				// empty deck, break out of the loop
                break;
            }
        }

        return dealtCards;
    }

    public int size() {
		// call the size() method
		// result return
        return m_deck.size();
    }

    public String toString() {
		// result return
        return m_deck.toString();
    }
}
