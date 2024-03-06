/**
 * 
 * The 'Pizza' class is a pizza order that can has customizable toppings and size
 */
public class Pizza {

	private String m_size;
	private int m_cheese;
	private int m_pepperoni;
	private int m_veggie;

    /**
    * Default constructor
    * Initializes a medium sized cheese pizza
    */
	public Pizza() {
		m_size = "medium";
		m_cheese = 1;

	}

    /**
    * This method allows to add a pizza to the pizza order
    * If you can add the pizza, it returns a 1
    * If you cannot, it returns a -1
    * @param  size small, medium or large
    * @param  cheese amount of cheese
    * @param  pepperoni amount of pepperoni
    * @param  veggie amount of veggie
    */
	public Pizza(String size, int cheese, int pepperoni, int veggie) {
		this.m_size = size;
		this.m_cheese = cheese;
		this.m_pepperoni = pepperoni;
		this.m_veggie = veggie;
	}

    /**
    * Copy constructor
	* Creates another pizza 
    * @param  Pizza the pizza to be copied
    */
	public Pizza(Pizza other) {
		this.m_size = other.m_size;
		this.m_cheese = other.m_cheese;
		this.m_pepperoni = other.m_pepperoni;
		this.m_veggie = other.m_veggie;
	}

	public String getSize() {
		return this.m_size;

	}

	/**
     * Getting the pizza size
     *
     * @return The size of the pizza 
     */
	public void setSize(String newValue) {
		this.m_size = newValue;
	}

	 /**
     * Getting the amount of cheese toppings
     *
     * @return amount of cheese toppings
     */
	public int getCheese() {
		return this.m_cheese;
	}

	/**
     * Setting the amount of cheese on the pizza
     *
     * @param newValue new amount of cheese toppings
     */
	public void setCheese(int newValue) {
		this.m_cheese = newValue;

	}

	/**
     * Getting the amount of pepperoni toppings
     *
     * @return amount of pepperoni toppings
     */
	public int getPepperoni() {
		return this.m_pepperoni;

	}

	/**
    * Setting the amount of pepperoni on the pizza
     *
     * @param newValue new amount of pepperoni toppings
     */
	public void setPepperoni(int newValue) {
		this.m_pepperoni = newValue;
	}

	/**
     * Getting the amount of veggie toppings
     *
     * @return amount of veggie toppings
     */
	public int getVeggie() {
		return this.m_veggie;

	}

	/**
    * Setting the amount of veggie on the pizza
     *
     * @param newValue new amount of veggie toppings
     */
	public void setVeggie(int newValue) {
		this.m_veggie = newValue;

	}

    /**
    * This method allows to add a pizza to the pizza order
    * If you can add the pizza, it returns a 1
    * If you cannot, it returns a -1
    * @return      cost of the pizza
    */
	public double calcCost() {
		double cost = 0;
		double toppingCost = this.m_cheese * 2 + this.m_pepperoni * 2 + this.m_veggie * 2;
		if (this.m_size.equals("small")) {
			cost = 10;
		} else if (this.m_size.equals("medium")) {
			cost = 12;

		} else if (this.m_size.equals("large")) {
			cost = 14;

		}
		return cost + toppingCost;
	}

	public String toString() {
		String formatted = String.format("%.2f", this.calcCost());
		
		return "Size: " + 
				this.m_size + " Cheese: " + 
				this.m_cheese + " Veggie: " + 
				this.m_veggie + " Pepperoni: " + 
				this.m_pepperoni + " Cost: " + 
				formatted;
	}
	
	/**
     * Another pizza is being compared
     *
     * @param o object to compare with the pizza
     * @return if objects are equal it returns true, if not it returns false
     */
	public boolean equals(Object o) {
        if (!(o instanceof Pizza)) {
            return false;
        } else {
            Pizza otherPizza = (Pizza) o;
            return this.m_size.equals(otherPizza.m_size) && 
            		this.m_cheese == (otherPizza.m_cheese) && 
            		this.m_pepperoni == (otherPizza.m_pepperoni) && 
            		this.m_veggie == (otherPizza.m_veggie); 
        }
    }
}
