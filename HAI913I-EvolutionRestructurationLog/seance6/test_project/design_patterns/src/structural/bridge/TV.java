package structural.bridge;

/**
 * a TV concrete class that plays the role of ConcreteImplementor
 * in the Bridge Design pattern. <br/>
 * It provides a concrete implementation of a Device, namely a TV.
 * @author anonbnr
 *
 */
public class TV extends Device {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a TV named "TV".
	 */
	public TV() {
		this.name = "TV";
	}
	
	/**
	 * Creates a TV named name.
	 * @param name The name of the TV to create.
	 */
	public TV(String name) {
		this.name = name;
	}
}
