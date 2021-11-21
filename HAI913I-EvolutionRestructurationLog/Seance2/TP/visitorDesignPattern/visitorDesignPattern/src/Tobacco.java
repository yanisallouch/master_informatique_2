package behavioral.visitor;

/**
 * a Tobacco concrete class that plays the role of a ConcreteElement
 * in the Visitor Design pattern.<br/>
 * Tobacco is a Visitable product that can be visited
 * by a ConcreteVisitor to implement a specific operation
 * on it without changing its structure.
 * @author anonbnr
 *
 */
public class Tobacco extends Product {
	/* CONSTRUCTORS */
	/**
	 * Creates a Tobacco having price.
	 * @param name The name of the Tobacco to create.
	 * @param price The price of the Tobacco to create.
	 */
	public Tobacco(String name, double price) {
		super(name, price);
	}
	
	/* METHODS */
	/**
	 * Allows visitor to visit this Tobacco
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}