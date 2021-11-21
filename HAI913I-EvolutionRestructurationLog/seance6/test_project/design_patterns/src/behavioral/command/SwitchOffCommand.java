package behavioral.command;

/**
 * a SwitchOffCommand that plays the role of ConcreteCommand in
 * the Command Design pattern.<br/>
 * It provides an implementation to executing the switching off
 * behavior of a an associated receiving TV instance.
 * @author anonbnr
 * @see TV
 */
public class SwitchOffCommand implements Command {
	
	/* ATTRIBUTES */
	/**
	 * This switching off command's associated receiving TV.
	 */
	private TV tv;

	/* CONSTRUCTORS */
	/**
	 * Creates a SwitchOffCommand having tv as its associated
	 * receiving TV.
	 * @param tv The receiving TV that'll get associated to the
	 * SwitchOffCommand to create.
	 */
	public SwitchOffCommand(TV tv) {
		this.tv = tv;
	}

	/* METHODS */
	/**
	 * Turns its associated TV off.
	 */
	@Override
	public void execute() {
		tv.switchOff();
	}

	/**
	 * Turns its associated TV on.
	 */
	@Override
	public void undo() {
		tv.switchOn();
	}

	@Override
	public String getName() {
		return "Switching TV " + (tv.isOn()? "on" : "off");
	}
}