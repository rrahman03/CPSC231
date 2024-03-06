import java.util.Arrays;

/**
 * 
 * The "PizzaOrder" class encapsulates the pizza order as member variables 
 * It has an array of pizzas and the number of pizzas
 */
public class PizzaOrder {
	
	Pizza[] pizzas;
	int m_numPizzas = 0;
	
    /**
    * Default constructor
    * Adding a single pizza to the order
    */
	public PizzaOrder() {
		Pizza pizza1 = new Pizza("medium", 1, 0, 0);
		this.pizzas = new Pizza[1];
		pizzas[0]= pizza1;
		//m_numPizzas = 1;
		
	}
	
    /**
    * Non default constructor
    * Allowing to set the order size
    * @param  pizzaNum the size of the order
    */
	public PizzaOrder(int pizzaNum) {
		this.pizzas = new Pizza[pizzaNum];
		
	}
	
	/**
    * This method allows to add a pizza to the pizza order
    * If you can add the pizza, it returns a 1
    * If you cannot, it returns a -1
    * @param  Pizza Pizza to be added to the order
    * @return      1 if pizza was added, -1 if no pizza was added
    */
	public int addPizza(Pizza pizza) {
		int pizzaAdded = 0;
		
		//if space left in the pizzas array
		if ((this.m_numPizzas) < pizzas.length) {
			this.pizzas[this.m_numPizzas] = pizza;
			this.m_numPizzas++;
			pizzaAdded = 1;
			
			
		}else {
			//no space left
			pizzaAdded = -1;
		}
		
		return pizzaAdded;
		
	}
	
    /**
    * This method calculates the total price of the entire order
    * @param  none
    * @return      a double showing the total cost of the entire order
    */
	public double calcTotal() {
		double totalCost = 0;
		double individualCost = 0;
		for (int i = 0; i < this.pizzas.length; i++) {
		    Pizza pizza = this.pizzas[i];
            if (pizza != null){
		        individualCost = pizza.calcCost();
		        totalCost += individualCost;
            }
		}
		
		return totalCost;
	}

	@Override
	public String toString() {
		String formatted = String.format("%.2f", this.calcTotal());
		return "PizzaOrder [pizzas=" + Arrays.toString(pizzas) + ", m_numPizzas=" + m_numPizzas + ", calcTotal()="
				+ formatted + "]";
	}

}
