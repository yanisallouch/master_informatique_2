package behavioral.mediator;

/**
 * a ChatUser concrete class that plays the role of ConcreteColleague
 * in the Mediator Design pattern.<br/>
 * It provides a simple implementation of the message sending
 * and receiving behavior of chat users.
 * @author anonbnr
 *
 */
public class ChatUser extends User {

	/* CONSTRUCTORS */
	/**
	 * Creates a ChatUser named name and having room
	 * as its mediating chat room.
	 * @param name The name of the ChatUser to create.
	 * @param room The chat room associated to the 
	 * ChatUser to create.
	 */
	public ChatUser(String name, IChatRoom room) {
		super(name, room);
	}

	/**
	 * Forwards the message to be sent to its associated 
	 * mediating chat room.
	 */
	@Override
	public void send(String message, String userId) {
		System.out.println(this.getName() + " ==> " + message);
		this.getRoom().sendMessage(message, userId);
	}

	/**
	 * Receives message.
	 */
	@Override
	public void receive(String message) {
		System.out.println(this.getName() + " <== " + message);
	}
}