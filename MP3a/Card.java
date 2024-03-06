public class Card {
    private int suit;
    private int value;
    
    // Representing Card Suits
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;
    
    // Representing Card Values
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 1;

    // Default Constructor
    public Card() {
        this.suit = Card.SPADES;
        this.value = Card.ACE;
    }

    public Card(int value, int suit) {
    	
    	/* 
        
        if (suit < 0 || suit >3) {
    		throw new Exception("Suit must be betwee 0 and 3");
    	}
    	
    	if (value < 1 || value > 13) {
    		throw new Exception("Value must be between 1 and 13");
    	}
        */
    	
        this.suit = suit;
        this.value = value;
    }

    // Copy Constructor
    public Card(Card other) {
        this.suit = other.suit;
        this.value = other.value;
    }

    // Setters and Getters
    public void setValue (int v) {
    	this.value = v;
    }
    
    public int getValue() {
    	return this.value;
    }
    
    public void setSuit(int s) {
    	this.suit = s;
    }
    
    public int getSuit() {
    	return this.suit;
    }
    
    public String toString() {
        StringBuffer sb= new StringBuffer();

        //Queen of Hearts”, “3 of Diamonds”, “Ace of Spades”

        if (this.value == Card.JACK){
        	sb.append("Jack");
         }else if (this.value == Card.QUEEN){
            sb.append("Queen");
        }else if (this.value == Card.KING){
            sb.append("King");
        }else if (this.value == Card.ACE){
            sb.append("Ace");
        }else {
            sb.append(this.value);
        }
        sb.append(" of ");

        if (this.suit == Card.HEARTS){
        	sb.append("HEARTS");
        }else if (this.suit==Card.SPADES){
        	sb.append("SPADES");
        }else if (this.suit==Card.CLUBS){
        	sb.append("CLUBS");
        }else if (this.suit == Card.DIAMONDS){
        	sb.append("DIAMONDS");
        }
        sb.append("\n");
        return sb.toString();
    }

    public boolean equals(Object o) {
        if(!(o instanceof Card)) {
            return false;
        } else {
            Card otherCard = (Card) o;
            return this.value == otherCard.value;
        }
    }
}