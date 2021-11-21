package behavioral.mediator;

/**
 * an IChatRoom interface that plays the role of Mediator
 * in the Mediator Design pattern.<br/>
 * It provides an interface for chat rooms to act as a mediator
 * between different kinds of users.
 * @author anonbnr
 */
public interface IChatRoom {
	
	/* METHODS */
	/**
	 * Sends message to the user identified by userId.
	 * @param message The message to send.
	 * @param userId The userId of the receiving User.
	 */
	void sendMessage(String message, String userId);
	void addUser(User user);
}