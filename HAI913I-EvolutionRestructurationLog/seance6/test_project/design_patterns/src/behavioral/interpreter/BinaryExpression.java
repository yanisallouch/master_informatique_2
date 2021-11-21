package behavioral.interpreter;

/**
 * a BinaryExpression abstract class that factors the common state
 * and behavior of all non-terminal expressions consisting of two
 * expressions.
 * @author anonbnr
 *
 */
public abstract class BinaryExpression implements Expression {
	
	/* ATTRIBUTES */
	/**
	 * This BinaryExpression's left-side expression
	 */
	protected Expression leftExpression;
	
	/**
	 * This BinaryExpression's right-side expression
	 */
	protected Expression rightExpression;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BinaryExpression having leftExpression as its left-hand
	 * expression, and rightExpression as its right-side expression.
	 * @param leftExpression The left-hand expression of the
	 * BinaryExpression to create.
	 * @param rightExpression The right-hand expression of the
	 * BinaryExpression to create.
	 */
	public BinaryExpression(Expression leftExpression, 
			Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
}