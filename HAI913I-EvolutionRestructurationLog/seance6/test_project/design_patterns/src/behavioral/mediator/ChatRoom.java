package behavioral.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * a ChatRoom concrete class that plays the role of ConcreteMediator
 * in the Mediator Design pattern.<br/>
 * It provides an implementation for a chat room that maintains
 * a hash table of User objects, identified each by their IDs, 
 * and mediates messages sent and received between them.
 * @author anonbnr
 *
 */
public class ChatRoom implements IChatRoom {
	
	/* ATTRIBUTES */
	/**
	 * This chat room's hash table of User objects.
	 */
	private Map<String, User> users = new HashMap<>();

	/**
	 * Retrieves the User identified by userId (if it exists) 
	 * and invokes its message receiving behavior to receive
	 * message.
	 */
	@Override
	public void sendMessage(String message, String userId) {
		Optional<User> user = Optional.of(users.get(userId));
		user.ifPresent(aUser -> aUser.receive(message));
	}

	/**
	 * Adds <user's ID, user> into this chat room's hash table
	 * of User objects.
	 */
	@Override
	public void addUser(User user) {
		users.put(user.getId(), user);
	}
}