package behavioral.command;

/**
 * a SwitchOnCommand that plays the role of ConcreteCommand in
 * the Command Design pattern.<br/>
 * It provides an implementation to executing the switching on
 * behavior of a an associated receiving TV instance.
 * @author anonbnr
 * @see TV
 */
public class SwitchOnCommand implements Command {
	
	/* ATTRIBUTES */
	/**
	 * This switching on command's associated receiving TV.
	 */
	private TV tv;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a SwitchOnCommand having tv as its associated
	 * receiving TV.
	 * @param tv The receiving TV that'll get associated to the
	 * SwitchOnCommand to create.
	 */
	public SwitchOnCommand(TV tv) {
		this.tv = tv;
	}

	/* METHODS */
	/**
	 * Turns its associated TV on.
	 */
	@Override
	public void execute() {
		tv.switchOn();
	}

	/**
	 * Turns its associated TV off.
	 */
	@Override
	public void undo() {
		tv.switchOff();
	}

	@Override
	public String getName() {
		return "Switching TV " + (tv.isOn()? "on" : "off");
	}
}