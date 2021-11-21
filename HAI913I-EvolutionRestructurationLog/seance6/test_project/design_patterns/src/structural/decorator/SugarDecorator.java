package structural.decorator;

/**
 * a SugarDecorator concrete class that plays the role of
 * ConcreteDecorator in the Decorator Design pattern.<br/>
 * It extends BeverageDecorator and provides a definition of
 * the Sugar Decorator behavior.
 * @author anonbnr
 *
 */
public class SugarDecorator extends BeverageDecorator {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a SugarDecorator named "Sugar" and costing 0.5.
	 * @param beverage The Beverage decorated 
	 * by the SugarDecorator to create.
	 */
	public SugarDecorator(Beverage beverage) {
		super(beverage);
		this.description = "Sugar";
		this.price = 0.5;
	}
	
	/* METHODS */
	/**
	 * Returns the description of the Beverage decorated by this
	 * SugarDecorator, followed by the description of this
	 * SugarDecorator.
	 */
	@Override
	public String description() {
		return this.beverage.description() + 
				", containing " + this.description;
	}
	
	/**
	 * Sums the price of the Beverage decorated
	 * by this SugarDecorator with that of the SugarDecorator
	 * and returns it.
	 */
	@Override
	public double price() {
		return this.beverage.price() + this.price;
	}
}