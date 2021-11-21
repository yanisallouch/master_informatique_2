package behavioral.visitor;

/**
 * a Necessity concrete class that plays the role of a ConcreteElement
 * in the Visitor Design pattern.<br/>
 * Necessity is a Visitable Product that can be visited
 * by a ConcreteVisitor to implement a specific operation
 * on it without changing its structure.
 * @author anonbnr
 *
 */
public class Necessity extends Product {
	/* CONSTRUCTORS */
	/**
	 * Creates a Necessity having price.
	 * @param name The name of the Necessity to create.
	 * @param price The price of the Necessity to create.
	 */
	public Necessity(String name, double price) {
		super(name, price);
	}
	
	/* METHODS */
	/**
	 * Allows visitor to visit this Necessity
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}