package structural.decorator;

/**
 * a BeverageDecorator abstract class that plays the role of
 * Decorator in the Decorator Design pattern.<br/>
 * It provides a common factoring for the state of any
 * Beverage Decorator.
 * @author anonbnr
 */
public abstract class BeverageDecorator extends Beverage {
	
	/* ATTRIBUTES */
	/**
	 * The Beverage decorated by this BeverageDecorator.
	 */
	protected Beverage beverage;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BeverageDecorator decorating beverage.
	 * @param beverage The Beverage decorated by the BeverageDecorator
	 * to create.
	 */
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
}