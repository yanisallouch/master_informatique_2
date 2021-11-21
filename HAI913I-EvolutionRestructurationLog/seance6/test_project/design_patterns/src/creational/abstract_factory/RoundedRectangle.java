package creational.abstract_factory;

/**
 * a RoundedRectangle concrete class that plays the role of a specific 
 * ConcreteProduct in the Abstract Factory design pattern.
 * It defines the class of rounded rectangle shapes.
 * @author anonbnr
 */
public class RoundedRectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a rounded rectangle");
	}
}
