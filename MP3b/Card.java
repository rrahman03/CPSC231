public class Card {
    // four suits
    public static final int HEARTS = 0;
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    // special card suits
    public static final int TWO = 2;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;

    private int value;
    private int suit;

    // default constructor
    public Card() {
        this(ACE, SPADES);
    }

    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    // copy constructor
    public Card(Card otherCard) {
        this.value = otherCard.getValue();
        this.suit = otherCard.getSuit();
    }

    // getters
    public int getValue() {
        return value;
    }

    public int getSuit() {
        return suit;
    }

    // setters
    public void setValue(int value) {
        this.value = value;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String toString() {
        // Implementation for the toString method
        // Customize as needed
        return value + " of " + suit;
    }

    // checks if two cards are equal
    public boolean equals(Card otherCard) {
        return this.value == otherCard.getValue();
    }
}
