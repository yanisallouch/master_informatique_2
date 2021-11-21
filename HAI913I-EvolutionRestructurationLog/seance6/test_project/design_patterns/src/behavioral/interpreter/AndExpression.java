package behavioral.interpreter;

/**
 * an AndExpression concrete class that plays the role of 
 * NonterminalExpression in the Interpreter design pattern.<br/>
 * It designates the non-terminal symbol "and" in the associated 
 * language grammar. 
 * @author anonbnr
 */
public class AndExpression extends BinaryExpression {
	
	/* CONSTRUCTORS */
	/**
	 * Creates an AndExpression having leftExpression as its left-hand
	 * expression, and rightExpression as its right-side expression.
	 * @param leftExpression The left-hand expression of the AndExpression
	 * to create.
	 * @param rightExpression The right-hand expression of the AndExpression
	 * to create.
	 */
	public AndExpression(Expression leftExpression, 
			Expression rightExpression) {
		super(leftExpression, rightExpression);
	}
	
	/* METHODS */
	/**
	 * Returns the logical and result of interpreting
	 * this AndExpression's left-side and right-side
	 * expressions, given context.
	 */
	@Override
	public boolean interpret(String context) {
		return leftExpression.interpret(context) 
				&& rightExpression.interpret(context);
	}
}