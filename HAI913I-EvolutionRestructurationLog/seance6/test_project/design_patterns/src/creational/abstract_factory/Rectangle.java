package creational.abstract_factory;

/**
 * a Rectangle concrete class that plays the role of a specific 
 * ConcreteProduct in the Abstract Factory design pattern.
 * It defines the class of rectangle shapes.
 * @author anonbnr
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}
