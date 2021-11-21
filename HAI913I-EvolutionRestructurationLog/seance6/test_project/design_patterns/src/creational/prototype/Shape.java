package creational.prototype;

/**
 * a Shape abstract class that plays the role of Prototype
 * in the Prototype design pattern.
 * It defines the interface of a shape 
 * and provides a clone method to all of its subclasses
 * to allow them to be prototypes.
 * @author anonbnr
 */
public abstract class Shape implements Cloneable {
	/* ATTRIBUTES */
	/**
	 * The shape's id
	 */
	private String id;
	
	/**
	 * The shape's type
	 */
	protected String type;
	
	/**
	 * The shape's position
	 */
	private Position position;
	
	/* METHODS */
	/**
	 * Get this shape's id
	 * @return this shape's id
	 */
	public String getId() {return this.id;}
	
	/**
	 * Sets this shape's id to id
	 * @param id The value to set this shape's id
	 */
	public void setId(String id) {this.id = id;}
	
	/**
	 * Get this shape's type
	 * @return this shape's type
	 */
	public String getType() {return this.type;}
	
	/**
	 * Gets this shape's position
	 * @return this shape's position
	 */
	public Position getPosition() {return this.position;}
	
	/**
	 * Sets this shape's position to position
	 * @param position The value to set this shape's position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}
	
	/**
	 * Draws this shape
	 */
	abstract void draw();
	
	/**
	 * Does a deep copy of this shape
	 */
	@Override
	public Shape clone() {
		
		Shape clone = null;
		
		try {
			clone = (Shape) super.clone();
			clone.setPosition(this.getPosition().clone());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	@Override
	public String toString() {
		return "[id = " + this.id +
				", type = " + this.type +
				", position = " + this.position +
				", hash = " + this.hashCode() +
				"]";
	}
}
