package structural.decorator;

/**
 * an Espresso concrete class that plays the role of
 * ConcreteComponent in the Decorator Design pattern.<br/>
 * It extends Beverage and provides a definition of 
 * the Espresso beverage.
 * @author anonbnr
 *
 */
public class Espresso extends Beverage {
	
	/* CONSTRUCTORS */
	/**
	 * Creates an Espresso named "Espresso" and costing 1.
	 */
	public Espresso() {
		description = "Espresso";
		price = 1;
	}
	
	/**
	 * Creates an Espresso named name and costing price.
	 * @param description The description of the Espresso to create.
	 * @param price The price of the Espresso to create.
	 */
	public Espresso(String description, double price) {
		super(description, price);
	}
}