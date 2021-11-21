package behavioral.strategy;

/**
 * an ArithmeticOperation interface playing the role of Strategy in the behavioral.strategy design pattern.
 * it provides a common interface for different arithmetic operations.
 * @author anonbnr
 *
 */
public interface ArithmeticOperation {
	/**
	 * a binary arithmetic operation
	 * @param x an integer operand
	 * @param y an integer operand
	 * @return implemented by the corresponding arithmetic operation
	 */
	int execute(int x, int y);
}
