package creational.prototype;

/**
 * a Triangle concrete class that plays the role of ConcretePrototype
 * in the Prototype design pattern.
 * It defines a triangle shape that can serve as a prototype.
 * @author anonbnr
 */
public class Triangle extends Shape {
	
	/* CONSTRUCTOR */
	/**
	 * Creates a Triangle shape, and sets its type to "Triangle"
	 */
	public Triangle() {
		this.type = "Triangle";
	}

	/* METHOD */
	@Override
	/**
	 * Draws a Triangle shape
	 */
	void draw() {
		System.out.println("Drawing a Triangle");
	}
}
