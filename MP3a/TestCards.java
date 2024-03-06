import java.util.LinkedList;

public class TestCards {

	public static void main(String[] args) {
		try {
			// Creating a Dealer object
			Dealer dealerDeck = new Dealer();

			// Size of deck
			System.out.println("The size of the deck is: " + dealerDeck.size());
			System.out.println(dealerDeck.toString());
			
			// Deal 5 cards
			LinkedList<Card> dealtCard = dealerDeck.deals(10);
			
			System.out.println("Size of deck after dealing ten cards: " + dealerDeck.size());
			System.out.println("The size of deck of dealtcards  " + dealtCard.size());
			System.out.println("The dealt cards are: " + dealtCard.toString());
			System.out.println("The dealers deck after the cards dealt is: " + dealerDeck.toString());
			
			// Test the equals and the copy
			Dealer dealerDeck2 = new Dealer();
			
			
			System.out.println(dealerDeck.equals(dealtCard));
			System.out.println(dealerDeck.equals(dealerDeck2));
			
			// Test equals method
			Deck deck1 = new Deck();
			Deck deck2 = new Deck();
			Deck deck3 = new Deck(deck2);
			System.out.println(deck1.equals(deck2));//false
			System.out.println(deck2.equals(deck3));//false
			
			// Creates card objects - value, suit
			Card card1 = new Card(Card.JACK, Card.HEARTS);
			Card card2 = new Card(Card.JACK, Card.HEARTS);
			Card card3 = new Card(Card.JACK, Card.DIAMONDS);
			Card card4 = new Card(Card.KING, Card.DIAMONDS);
			
			System.out.println(card1.equals(card2)); //true
			System.out.println(card1.equals(card3)); //true
			System.out.println(card1.equals(card4)); //false
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
