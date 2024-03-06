import java.util.LinkedList;
import java.util.Random;

public class Deck {

	// Linked List to store the cards in the deck
	private LinkedList<Card> m_cards; //= new LinkedList<Card>();
	
	// Constructor 
	public Deck () {
		m_cards = new LinkedList<Card>();
		for (int i=0; i<4; i++) { //Outer loop for the suit
			for (int j=1; j <=13; j++) { //Inner loop for the values
				this.m_cards.add(new Card(j,i));
			}
		}
		
		
	}
	
	// Copy Constructor
	public Deck (Deck d) {
        LinkedList<Card> copy = new LinkedList<>();
        for (Card card : d.getM_cards()) {
            copy.add(new Card(card));  
        }
        d.setM_cards(copy);
    }

	// Getter
	public LinkedList<Card> getM_cards() {
		return m_cards;
	}

	// Setter
	public void setM_cards(LinkedList<Card> m_cards) {
		this.m_cards = m_cards;
	}
	
	public int size() {
		return this.m_cards.size();
	}
	
	public Card deal() {
		Card card = null;
		if (this.m_cards != null && !this.m_cards.isEmpty()) {
			Random random = new Random ();
			int index = random.nextInt(this.m_cards.size());
			card = this.m_cards.remove(index);
		}
		return card;
		
		
	}
	
	@Override
	public String toString() {
		return m_cards.toString();
	}
	
	

}
