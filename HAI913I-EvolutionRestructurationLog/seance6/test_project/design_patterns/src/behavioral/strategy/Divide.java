package behavioral.strategy;

/**
 * a Divide class that plays the role of ConcreteStrategy in the Strategy design pattern.
 * it implements the arithmetic operation of binary euclidean division.
 * @author anonbnr
 */
public class Divide implements ArithmeticOperation {

	/**
	 * Returns x / y.
	 */
	@Override
	public int execute(int x, int y) {
		return x / y;
	}
}
