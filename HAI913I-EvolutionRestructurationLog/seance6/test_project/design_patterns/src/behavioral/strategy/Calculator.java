package behavioral.strategy;

/**
 * A Calculator class that plays the role of Context in the Strategy design pattern.
 * a calculator executes arithmetic operations and stores the result
 * @author anonbnr
 *
 */
public class Calculator {
	/* ATTRIBUTES */
	/**
	 * The Calculator's result.
	 */
	private static int result = 0;
	
	/**
	 * The Calculator's arithmetic operation.
	 */
	private static ArithmeticOperation operation;
	
	/* METHODS */
	/**
	 * Computes the Calculator's operation on x and y.
	 * @param x The x input integer.
	 * @param y The y input integer.
	 */
	public static void computeOperation(int x, int y) {
		result = operation.execute(x, y);
	}
	
	/**
	 * Returns the Calculator's result.
	 * @return the Calculator's result.
	 */
	public static int getResult() {return Calculator.result;}
	
	/**
	 * Sets anOperation as the Calculator's operation.
	 * @param anOperation The value to set the Calculator's operation.
	 */
	public static void setOperation(ArithmeticOperation anOperation) {
		operation = anOperation;
	}
	
	/**
	 * Resets the Calculator's result to 0.
	 */
	public static void reset() {
		result = 0;
	}
}