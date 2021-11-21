package behavioral.visitor;
/**
 * a Visitable interface declaring the accept() method
 * in the Visitor Design pattern.<br/>
 * The interface could be used to specify different ways
 * of accepting visitors and should be implemented by
 * visitable objects.
 * @author anonbnr
 */
public interface Visitable {
	/* METHODS */
	/**
	 * Allows a visitable object to accept visitor.
	 * @param visitor A Visitor visiting this visitable object.
	 */
	public void accept(Visitor visitor);
}