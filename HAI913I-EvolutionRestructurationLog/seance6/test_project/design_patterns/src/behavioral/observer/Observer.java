package behavioral.observer;

/**
 * an Observer interface that plays the role of Observer in
 * the Observer Design pattern.<br>
 * It provides an interface for observers to update their
 * state upon being notified by a Subject.
 * @author anonbnr
 *
 */
public interface Observer {
	/**
	 * Updates the state of this observer.
	 */
	public void update();
}