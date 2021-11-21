package behavioral.interpreter;

/**
 * an Expression interface playing the role of AbstractExpression 
 * in the Interpreter design pattern.<br/>
 * The grammar of the language exemplified here is defined 
 * as follows:<br/><br/>
 * <ol>
 * 	<li>expression ::= and | or | terminal</li>
 * 	<li>and ::= expression 'and' expression</li>
 * 	<li>or ::= expression 'or' expression</li>
 * 	<li>terminal ::= &lt;data&gt;</li>
 * </ol>
 * 
 * It designates "expression" in the associated language grammar.
 * @author anonbnr
 */
public interface Expression {
	/* METHODS */
	/**
	 * Interprets this expression given a context. It defines
	 * the Interpret operation the Interpreter design pattern.
	 * @param context the Context designating the input and 
	 * the state of interpretation
	 * @return the interpretation of this expression.
	 */
	boolean interpret(String context);
}