package creational.prototype;

import java.util.HashMap;

/**
 * a ShapeCache that plays the role of a Prototype registry in the
 * Prototype design pattern.
 * It provides methods for loading methods into a cache
 * and getting a shape from it. 
 * @author anonbnr
 */
public class ShapeCache {
	/* ATTRIBUTES */
	/**
	 * The map storing this cache's shape prototypes
	 */
	private static HashMap<String, Shape> map = new HashMap<>();
	
	/* METHODS */
	/**
	 * Returns a deep clone of the shape prototype identified by id
	 * @param id The id of the shape prototype to clone
	 * @return a deep clone of the shape prototype identified by id
	 */
	public static Shape getShape(String id) {
		Shape cachedShape = map.get(id);
		return (Shape) cachedShape.clone();
	}
	
	/**
	 * Loads some shape prototypes into the cache's map,
	 * from which deep clones of these prototypes can be obtained
	 */
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		circle.setPosition(new Position(1, 1));
		map.put(circle.getId(), circle);
		
		Triangle triangle = new Triangle();
		triangle.setId("2");
		triangle.setPosition(new Position(2, 2));
		map.put(triangle.getId(), triangle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		rectangle.setPosition(new Position(3, 3));
		map.put(rectangle.getId(), rectangle);
	}

	/**
	 * Displays the shape prototypes loaded into this cache
	 */
	public static void displayCacheContent() {
		for (Shape shape: map.values())
			System.out.println(shape);
	}
}