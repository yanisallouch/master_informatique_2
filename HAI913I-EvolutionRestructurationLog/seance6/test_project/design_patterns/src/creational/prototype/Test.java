package creational.prototype;

/**
 * a test class
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		System.out.println("The contents of the prototypes cache");
		ShapeCache.displayCacheContent();
		System.out.println();
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
		clonedShape1.getPosition().setX(-1);
		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		clonedShape2.getPosition().setY(0);
		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		clonedShape3.getPosition().setX(100);
		
		System.out.println("The cloned and modified shapes");
		System.out.println(clonedShape1);
		System.out.println(clonedShape2);
		System.out.println(clonedShape3);
	}
}
