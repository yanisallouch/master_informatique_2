package creational.prototype;

/**
 * a Circle concrete class that plays the role of ConcretePrototype
 * in the Prototype design pattern.
 * It defines a circle shape that can serve as a prototype.
 * @author anonbnr
 */
public class Circle extends Shape {

	/* CONSTRUCTOR */
	/**
	 * Creates a Circle shape, and sets its type to "Circle"
	 */
	public Circle() {
		this.type = "Circle";
	}
	
	@Override
	/**
	 * Draws a Circle shape
	 */
	void draw() {
		System.out.println("Drawing a Circle");
	}
}
