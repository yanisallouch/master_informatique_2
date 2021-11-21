package behavioral.interpreter;

/**
 * a TerminalExpression concrete class that plays the role of 
 * TerminalExpression in the Interpreter design pattern.<br/>
 * It designates "terminal" in the associated language grammar.
 * @author anonbnr
 */
public class TerminalExpression implements Expression {
	
	/* ATTRIBUTES */
	/**
	 * This terminal expression's data value.
	 */
	private String data;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a terminal expression having data as its value.
	 * @param data The value to set this terminal expression's data.
	 */
	public TerminalExpression(String data) {
		this.data = data;
	}

	/* METHODS */
	/**
	 * Returns true if context contains this terminal expression's
	 * data, false otherwise.
	 */
	@Override
	public boolean interpret(String context) {
		return context.contains(data);
	}
}