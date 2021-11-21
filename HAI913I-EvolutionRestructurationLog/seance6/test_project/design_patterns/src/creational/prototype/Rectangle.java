package creational.prototype;

/**
 * a Rectangle concrete class that plays the role of ConcretePrototype
 * in the Prototype design pattern.
 * It defines a rectangle shape that can serve as a prototype.
 * @author anonbnr
 */
public class Rectangle extends Shape {
	
	/* CONSTRUCTOR */
	/**
	 * Creates a Rectangle shape, and sets its type to "Rectangle"
	 */
	public Rectangle() {
		this.type = "Rectangle";
	}
	
	/* METHODS */
	/**
	 * Draws a Rectangle shape
	 */
	@Override
	void draw() {
		System.out.println("Drawing a Rectangle.");
	}
}
