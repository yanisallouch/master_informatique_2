package behavioral.interpreter;

/**
 * A Test class that plays the role of Client in the Interpreter 
 * design pattern.<br/>
 * It defines two expressions using the and/or combinatoric 
 * expression language. It then interprets those expressions 
 * on two input sentences from the language.
 * @author anonbnr
 *
 */
public class Test {
		
	/**
	 * female ::= "Jessie" or "Julie" <br><br>
	 * 
	 * (Jessie or Julie alone is sufficient to declare a female name).
	 * @return true if any of the two is provided.
	 */
	public static Expression getIsFemaleExpression() {
		Expression jessie = new TerminalExpression("Jessie");
		Expression julie = new TerminalExpression("Julie");
		
		return new OrExpression(jessie, julie);
	}
	
	/**
	 * IsMarriedWoman: female and "Married" <br><br>
	 * 
	 * (Female or married alone aren't enough to declare that we have a married woman).
	 * @return true if both are provided.
	 */
	public static Expression getIsMarriedWomanExpression() {
		Expression isFemale = getIsFemaleExpression();
		Expression married = new TerminalExpression("Married");
		
		return new AndExpression(isFemale, married);
	}
	
	public static void main(String[] args) {
		Expression isFemale = getIsFemaleExpression();
		Expression isMarriedWoman = getIsMarriedWomanExpression();
		
		String input = "is Jessie Married?";
		System.out.println(input + " " + isMarriedWoman.interpret(input));
		
		input = "is Julie a female?";
		System.out.println(input + " " + isFemale.interpret(input));	
	}
}
