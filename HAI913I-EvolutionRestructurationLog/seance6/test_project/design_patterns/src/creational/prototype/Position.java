package creational.prototype;

/**
 * A concrete class defining the geometric 2D position of a Shape.
 * @author anonbnr
 * @see Shape
 *
 */
public class Position implements Cloneable {
	
	/**
	 * The x component of this position.
	 */
	private double x;
	
	/**
	 * The y component of this position.
	 */
	private double y;

	/* CONSTRUCTORS */
	/**
	 * Creates and (x, y) Position.
	 * @param x Value to set the x component of this position.
	 * @param y Value to set the y component of this position.
	 */
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/* METHODS */
	/**
	 * Get this position's x component.
	 * @return this position's x component.
	 */
	public double getX() {
		return x;
	}

	/**
	 * Sets this shape's x component to x.
	 * @param x The value to set this shape's x component.
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Get this position's y component.
	 * @return this position's y component.
	 */
	public double getY() {
		return y;
	}

	/**
	 * Sets this position's y component to y.
	 * @param y The value to set this position's y component.
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * Does a shallow copy of this position.
	 */
	@Override public Position clone() 
			throws CloneNotSupportedException {
		return (Position) super.clone();
	}

	@Override
	public String toString() {
		return "[x = " + this.x + 
				", y = " + this.y + 
				", hash = " + this.hashCode() + 
				"]";
	}
}
