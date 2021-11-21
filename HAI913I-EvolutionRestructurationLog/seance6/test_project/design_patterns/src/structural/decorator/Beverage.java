package structural.decorator;

/**
 * a Beverage abstract class that plays the state role of Component 
 * in the Decorator design pattern.<br/>
 * It provides a common factoring for the state 
 * of any IBeverage and default implementations of its behavior.
 * @author anonbnr
 */
public abstract class Beverage implements IBeverage {
	
	/* ATTRIBUTES */
	/**
	 * The Beverage's description.
	 */
	protected String description;
	
	/**
	 * The Beverage's price.
	 */
	protected double price;
	
	/* CONSTRUCTORS */
	/**
	 * Creates an empty Beverage
	 */
	public Beverage() {}
	
	/**
	 * Creates a Beverage described by description and costing price.
	 * @param description The description of the Beverage to create.
	 * @param price The price of the Beverage to create.
	 */
	public Beverage(String description, double price) {
		this.description = description;
		this.price = price;
	}

	/* METHODS */
	@Override
	public String description() {
		return this.description;
	}

	@Override
	public double price() {
		return this.price;
	}
}