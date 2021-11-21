package behavioral.memento;

/**
 * an Originator concrete class that plays the role of Originator
 * in the Memento Design pattern.<br/>
 * It provides a dummy interface for any originator object, and
 * ways for it to create Memento objects to encapsulate its internal
 * state, that it can retrieve later when it wishes to restore itself
 * to said state.
 * @author anonbnr
 * @see Memento
 */
public class Originator {
	/* ATTRIBUTES */
	/**
	 * This Originator's internal state.
	 */
	private String state;
	
	/* METHODS */
	/**
	 * Gets this Originator's state.
	 * @return this Originator's state.
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets state as this Originator's state.
	 * @param state The value to set this Originator's state.
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Externalizes its internal state into a Memento.
	 * @return a Memento that encapsulates its internal state.
	 */
	public Memento externalizeState() {
		return new Memento(state);
	}
	
	/**
	 * Restores its internal state as its was encapsulated by memento.
	 * @param memento The Memento that previously encapsulated the
	 * internal state of this Originator.
	 */
	public void restoreState(Memento memento) {
		setState(memento.getState());
	}
}