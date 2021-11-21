package behavioral.visitor;

/**
 * a Liquor concrete class that plays the role of a ConcreteElement
 * in the Visitor Design pattern.<br/>
 * Liquor is a Visitable product that can be visited
 * by a ConcreteVisitor to implement a specific operation
 * on it without changing its structure.
 * @author anonbnr
 *
 */
public class Liquor extends Product {
	/* CONSTRUCTORS */
	/**
	 * Creates a Liquor named name having price.
	 * @param name The name of the Liquor to create.
	 * @param price The price of the Liquor to create.
	 */
	public Liquor(String name, double price) {
		super(name, price);
	}
	
	/* METHODS */
	/**
	 * Allows visitor to visit this Liquor
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}