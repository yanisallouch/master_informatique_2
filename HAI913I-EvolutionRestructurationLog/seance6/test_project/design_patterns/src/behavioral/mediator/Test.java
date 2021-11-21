package behavioral.mediator;

/**
 * a Test class for the Mediator Design pattern.<br/>
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		IChatRoom room = new ChatRoom();
		
		User alex = new ChatUser("Alex", room);
		User brian = new ChatUser("Brian", room);
		User charles = new ChatUser("Charles", room);
		User david = new ChatUser("David", room);
		
		room.addUser(alex);
		room.addUser(brian);
		room.addUser(charles);
		room.addUser(david);
		
		alex.send("Hello " + brian.getName(), brian.getId());
		brian.send("Hey dude", alex.getId());
	}
}