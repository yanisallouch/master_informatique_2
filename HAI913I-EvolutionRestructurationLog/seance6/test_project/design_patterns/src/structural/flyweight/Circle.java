package structural.flyweight;

/**
 * a Circle concrete class that plays the role of ConcreteFlyweight
 * in the Flyweight Design pattern.<br/>
 * It provides an interface for all shareable circles, and specifies
 * an intrinsic state consisting of a Circle's color.
 * It implements the Shape interface to allow a Circle to be drawn
 * at a given Position.
 * @author anonbnr
 */
public class Circle implements Shape {
	
	/* ATTRIBUTES */
	/**
	 * This circle's color.
	 */
	private String color;
	
	/**
	 * This circle's radius
	 */
	private int radius;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a Circle colored in color.
	 * @param color The color to color the Circle to create.
	 */
	public Circle(String color) {
		this.color = color;
	}
	
	/* METHODS */
	/**
	 * Gets this circle's radius.
	 * @return this circle's radius.
	 */
	public int getRadius() {
		return this.radius;
	}
	
	/**
	 * Sets this circle's radius.
	 * @param radius The value to set this circle's radius.
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(Position position) {
		StringBuffer buf = new StringBuffer();
		buf.append("Circle=[");
		buf.append("color=" + color);
		buf.append(", radius=" + radius);
		buf.append(", position=" + position + "]");
		
		System.out.println(buf.toString());
	}
}