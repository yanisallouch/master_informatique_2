package behavioral.observer;

/**
 * a Subject interface that plays the role of Subject in the
 * Observer Design pattern.<br/>
 * It provides an interface for subjects to register, unregister,
 * and notify observers.
 * @author anonbnr
 *
 */
public interface Subject {

	/* METHODS */
	/**
	 * Registers observer into its collection of registered
	 * observers.
	 * @param observer An observer to be registered by this
	 * Subject.
	 */
	public void register(Observer observer);
	
	/**
	 * Unregisters observer from its collection of registered
	 * observers.
	 * @param observer An observer to unregister by this Subject.
	 */
	public void unregister(Observer observer);
	
	/**
	 * Notify all registered observers of state updates.
	 */
	public void notifyObserver();
}
