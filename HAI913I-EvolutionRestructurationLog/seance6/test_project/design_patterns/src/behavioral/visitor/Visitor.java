package behavioral.visitor;

/**
 * A Visitor interface that plays the role of Visitor
 * in the Visitor Design pattern.<br/>
 * It provides the visiting operations that
 * are to be implemented by all concrete visitors
 * for every concrete product in the visitable Products hierarchy.
 * @author anonbnr
 * @see Product
 */
public interface Visitor {
	/* METHODS */
	/**
	 * Visits a Liquor.
	 * @param liquor The Liquor to visit.
	 */
	void visit(Liquor liquor);
	
	/**
	 * Visits a Tobacco.
	 * @param tobacco The Tobacco to visit.
	 */
	void visit(Tobacco tobacco);
	
	/**
	 * Visits a Necessity.
	 * @param necessity The Necessity to visit.
	 */
	void visit(Necessity necessity);
}