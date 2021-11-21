package behavioral.memento;

/**
 * a Memento concrete class that plays the role of Memento in the
 * Memento Design pattern.<br/>
 * It provides an interface for encapsulating and getting the 
 * state of an Originator. 
 * @author anonbnr
 * @see Originator
 */
public class Memento {
	/* ATTRIBUTES */
	/**
	 * The state of the Originator creating this Memento.
	 */
	private String state;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a Memento that encapsulates state.
	 * @param state The state of an Originator object to encapsulate
	 * in the Memento to create.
	 */
	public Memento(String state) {
		this.state = state;
	}
	
	/* METHODS */
	/**
	 * Returns the state of the Originator that created this Memento.
	 * @return the state of the Originator that created this Memento.
	 */
	public String getState() {
		return this.state;
	}
}