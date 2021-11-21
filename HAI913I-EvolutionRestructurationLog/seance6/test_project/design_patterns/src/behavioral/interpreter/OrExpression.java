package behavioral.interpreter;

/**
 * an OrExpression concrete class that plays the role of 
 * NonterminalExpression in the Interpreter design pattern.<br/>
 * It designates the non-terminal symbol "or" in the associated 
 * language grammar. 
 * @author anonbnr
 */
public class OrExpression extends BinaryExpression {
	
	/* CONSTRUCTORS */
	/**
	 * Creates an OrExpression having leftExpression as its left-hand
	 * expression, and rightExpression as its right-side expression.
	 * @param leftExpression The left-hand expression of the OrExpression
	 * to create.
	 * @param rightExpression The right-hand expression of the OrExpression
	 * to create.
	 */
	public OrExpression(Expression leftExpression, 
			Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	/* METHODS */
	/**
	 * Returns the logical or result of interpreting
	 * this OrExpression's left-side and right-side
	 * expressions, given context.
	 */
	@Override
	public boolean interpret(String context) {
		return leftExpression.interpret(context) 
				|| rightExpression.interpret(context);
	}
}