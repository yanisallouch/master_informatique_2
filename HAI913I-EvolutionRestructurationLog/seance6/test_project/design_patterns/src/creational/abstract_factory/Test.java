package creational.abstract_factory;

/**
 * a test class
 * @author anonbnr
 *
 */
public class Test {

	public static void main(String[] args) {
		// getting a rounded shapes creational.factory
		AbstractShapeFactory factory = ShapeProducer.createFactory(ShapeFactoryType.ROUNDED);
		
		// getting a rounded rectangle
		Shape shape = factory.createShape(RoundedShapeType.ROUNDED_RECTANGLE);
		shape.draw(); // Drawing a rounded rectangle
		
		// getting a rounded triangle
		shape = factory.createShape(RoundedShapeType.ROUNDED_TRIANGLE);
		shape.draw(); // Drawing a rounded triangle
		
		// getting a standard shapes creational.factory
		factory = ShapeProducer.createFactory(ShapeFactoryType.STANDARD);
		
		// getting a standard rectangle
		shape = factory.createShape(StandardShapeType.RECTANGLE);
		shape.draw(); // Drawing a rectangle
		
		// getting a standard triangle
		shape = factory.createShape(StandardShapeType.TRIANGLE);
		shape.draw(); // Drawing a triangle
	}
}
