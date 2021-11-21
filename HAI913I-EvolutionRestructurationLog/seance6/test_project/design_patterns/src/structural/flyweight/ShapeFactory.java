package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * a ShapeFactory class that plays the role of FlyweightFactory
 * in the Flyweight Design pattern.<br/>
 * It provides methods to create and manage shapes to ensure that
 * they are shared properly.
 * @author anonbnr
 * @see Shape
 *
 */
public class ShapeFactory {
	
	/* ATTRIBUTES */
	/**
	 * The factory's registry of shapes.
	 */
	private static Map<String, Shape> map = new HashMap<>();
	
	/* METHODS */
	/**
	 * Returns a Circle colored in color. If a Circle having color
	 * already exists in the registry, it directly returns it. 
	 * Otherwise, it creates it and adds it to the registry prior
	 * to returning it
	 * @param color The color of the Circle to return.
	 * @return A Circle colored in color.
	 */
	public static Shape getCircle(String color) {
		Circle circle = (Circle) map.get(color);
		
		if (circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Creating Circle of color " + color);
		}
		
		return circle;
	}
}