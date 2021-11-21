package structural.flyweight;

/**
 * a Shape interface that plays the role of Flyweight in
 * the Flyweight Design pattern.<br/>
 * It provides operations to be invoked on a Shape
 * according to an extrinsic state. More specifically,
 * it provides a drawing operation that is used to draw a shape
 * at a given position.
 * @author anonbnr
 * @see Position
 */
public interface Shape {
	/**
	 * Draws a shape at position.
	 * @param position The Position at which to draw this shape.
	 */
	void draw(Position position);
}