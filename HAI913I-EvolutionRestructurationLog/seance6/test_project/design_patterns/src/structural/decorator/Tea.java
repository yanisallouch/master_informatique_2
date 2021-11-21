package structural.decorator;

/**
* a Tea concrete class that plays the role of
* ConcreteComponent in the Decorator Design pattern.<br/>
* It extends Beverage and provides a definition of 
* the Tea beverage.
* @author anonbnr
*/
public class Tea extends Beverage {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a Tea named "Tea" and costing 1.5.
	 */
	public Tea() {
		description = "Tea";
		price = 1.5;
	}
	
	/**
	 * Creates an Tea named name and costing price.
	 * @param description The description of the Tea to create.
	 * @param price The price of the Tea to create.
	 */
	public Tea(String description, double price) {
		super(description, price);
	}
}