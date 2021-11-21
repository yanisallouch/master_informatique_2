package structural.decorator;

/**
 * A IBeverage interface that plays the behavior role of Component
 * in the Decorator Design pattern.<br/>
 * It provides an interface for any beverage, including its
 * description and its cost.
 * @author anonbnr
 */
public interface IBeverage {
	/* METHODS */
	/**
	 * Gets this IBeverage's description.
	 * @return this IBeverage's description.
	 */
	String description();
	
	/**
	 * Gets this IBeverage's price.
	 * @return this IBeverage's price.
	 */
	double price();
}