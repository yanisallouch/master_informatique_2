package structural.bridge;

/**
 * a Radio concrete class that plays the role of ConcreteImplementor
 * in the Bridge Design pattern. <br/>
 * It provides a concrete implementation of a Device, namely a Radio.
 * @author anonbnr
 *
 */
public class Radio extends Device {

	/* CONSTRUCTORS */
	/**
	 * Creates a Radio named "Radio".
	 */
	public Radio() {
		this.name = "Radio";
	}
	
	/**
	 * Creates a Radio named name.
	 * @param name The name of the Radio to create.
	 */
	public Radio(String name) {
		this.name = name;
	}
}
