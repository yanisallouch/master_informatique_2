package creational.abstract_factory;

/**
 * a Triangle concrete class that plays the role of a specific 
 * ConcreteProduct in the Abstract Factory design pattern.
 * It defines the class of triangle shapes.
 * @author anonbnr
 */
public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}
}
