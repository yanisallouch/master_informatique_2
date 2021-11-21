package behavioral.mediator;

/**
 * a User abstract class that plays the role of Colleague in the
 * Mediator Design pattern.<br/>
 * It provides an interface for all users capable of sending and
 * receiving messages between each other through a chat room, which
 * acts as a mediator.
 * @author anonbnr
 *
 */
public abstract class User {
	
	/* ATTRIBUTES */
	/**
	 * This user's id.
	 */
	private String id;
	
	/**
	 * This user's name.
	 */
	private String name;
	
	/**
	 * This user's chat room.
	 */
	private IChatRoom room;
	
	/**
	 * a User ID counter.
	 */
	private static int idCounter = 1;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a User named name and having room
	 * as its mediating chat room.
	 * @param name The name of the User to create.
	 * @param room The chat room associated to 
	 * the User to create.
	 */
	public User(String name, IChatRoom room) {
		this.id = String.valueOf(idCounter++);
		this.name = name;
		this.room = room;
	}
	
	/* METHODS */
	/**
	 * Gets this user's id.
	 * @return this user's id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets this user's name.
	 * @return this user's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets this user's associated chat room.
	 * @return this user's associated chat room.
	 */
	public IChatRoom getRoom() {
		return room;
	}

	/**
	 * Send message to the user identified by userId.
	 * @param message The message to send.
	 * @param userId The id of the receiving User.
	 */
	public abstract void send(String message, String userId);
	
	/**
	 * Receives message.
	 * @param message The message to receive.
	 */
	public abstract void receive(String message);
}