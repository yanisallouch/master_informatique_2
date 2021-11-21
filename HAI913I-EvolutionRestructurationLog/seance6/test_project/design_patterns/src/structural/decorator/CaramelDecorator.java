package structural.decorator;

/**
 * a CaramelDecorator concrete class that plays the role of
 * ConcreteDecorator in the Decorator Design pattern.<br/>
 * It extends BeverageDecorator and provides a definition of
 * the Caramel Decorator behavior.
 * @author anonbnr
 *
 */
public class CaramelDecorator extends BeverageDecorator {

	/* CONSTRUCTORS */
	/**
	 * Creates a CaramelDecorator named "Caramel" and costing 2.
	 * @param beverage The Beverage decorated 
	 * by the CaramelDecorator to create.
	 */
	public CaramelDecorator(Beverage beverage) {
		super(beverage);
		this.description = "Caramel";
		this.price = 2;
	}
	
	/* METHODS */
	/**
	 * Returns the description of the Beverage decorated by this
	 * CaramelDecorator, followed by the description of this
	 * CaramelDecorator.
	 */
	@Override
	public String description() {
		return this.beverage.description() + 
				", with " + this.description;
	}
	
	/**
	 * Sums the price of the Beverage decorated
	 * by this CaramelDecorator with that of the CaramelDecorator
	 * and returns it.
	 */
	@Override
	public double price() {
		return this.beverage.price() + this.price;
	}
}