import java.util.LinkedList;

public class Dealer {
	Deck m_deck;

	public Dealer() {
		m_deck = new Deck();

	}

	public LinkedList<Card> deals(int n) {
		LinkedList<Card> dealtCards = new LinkedList<>();

		if (this.m_deck.size() != 0) {

			for (int i = 0; i < n; i++) {
				Card card = this.m_deck.deal();
				if (card == null) {
					break; // Stops dealing when the original deck runs out of cards
				}
				dealtCards.add(card);
			}
		}
		return dealtCards;
	}

	public int size() {
		if (m_deck != null) {
			return m_deck.size();
		}else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return "The cards in the dealer deck are: \n " + this.m_deck.toString() + "]";
	}
	
}
