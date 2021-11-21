package behavioral.strategy;

/**
 * a Test class for the Strategy design pattern.
 * @author anonbnr
 *
 */
public class Test {

	public static void main(String[] args) {
		
		int x = 10, y = 3;
		
		computeAndDisplay(new Add(), "+", x, y); // 10 + 3 = 13
		computeAndDisplay(new Subtract(), "-", x, y); // 10 - 3 = 7
		computeAndDisplay(new Multiply(), "*", x, y); // 10 * 3 = 30
		computeAndDisplay(new Divide(), "/", x, y); // 10 / 3 = 3
		computeAndDisplay(new Modulo(), "%", x, y); // 10 % 3 = 1
	}
	
	/**
	 * Computes anOperation, symbolized by operationSymbol, over x and y
	 * and displays the result.
	 * @param anOperation The ArithmeticOperation to compute.
	 * @param operationSymbol The ArithmeticOperation's associated symbol.
	 * @param x The x input integer.
	 * @param y The y input integer.
	 */
	public static void computeAndDisplay(ArithmeticOperation anOperation, String operationSymbol,
			int x, int y) {
		Calculator.setOperation(anOperation);
		Calculator.computeOperation(x, y);
		System.out.println(x + " " + operationSymbol + 
				" " + y + " = " + Calculator.getResult());
	}
}