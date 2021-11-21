package structural.flyweight;

import java.util.Random;

/**
 * a Test class for the Flyweight Design pattern.
 * @author anonbnr
 */
public class Test {
	
	/**
	 * The array of possible colors.
	 */
	private static final String[] colors = {
			"Red", "Green", "Blue", "White", "Black"
	};
	
	/**
	 * The random number generator.
	 */
	private static Random random = new Random();

	public static void main(String[] args) {
		for (int i=0; i<20; i++) {
			Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
			circle.setRadius(getRandomRadius());
			circle.draw(new Position(getRandomX(), getRandomY()));
		}
	}
	
	/**
	 * Gets a random color from the array of possible colors.
	 * @return a random color from the array of possible colors.
	 */
	private static String getRandomColor() {
		return colors[random.nextInt(colors.length)];
	}
	
	/**
	 * Gets a random radius value between 0 and 99.
	 * @return a random radius value between 0 and 99.
	 */
	private static int getRandomRadius() {
		return random.nextInt(100);
	}
	
	/**
	 * Gets a random x value between 0 and 99.
	 * @return a random x value between 0 and 99.
	 */
	private static double getRandomX() {
		return random.nextInt(100);
	}
	
	/**
	 * Gets a random y value between 0 and 99.
	 * @return a random y value between 0 and 99.
	 */
	private static double getRandomY() {
		return random.nextInt(100);
	}
}