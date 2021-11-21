package behavioral.command;

/**
 * a SwitchChannelCommand that plays the role of 
 * ConcreteCommand in the Command Design pattern.<br/>
 * It provides an implementation to executing the switching between
 * channel behavior of a an associated receiving TV instance.
 * @author anonbnr
 * @see TV
 */
public class SwitchChannelCommand implements Command {
	
	/* ATTRIBUTES */
	/**
	 * This switching between channels 
	 * command's associated receiving TV.
	 */
	private TV tv;
	
	/**
	 * The old channel of this switching between channels
	 * command's associated receiving TV. 
	 */
	private int oldChannel;
	
	/**
	 * The new channel of this switching between channels
	 * command's associated receiving TV. 
	 */
	private int newChannel;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a SwitchChannelCommand having tv as its associated
	 * receiving TV, and newChannel as the new channel to switch
	 * to.
	 * @param tv The receiving TV that'll get associated to the
	 * SwitchChannelCommand to create.
	 * @param newChannel The new channel of tv to switch to by
	 * the SwitchChannelCommand to create.
	 */
	public SwitchChannelCommand(TV tv, int newChannel) {
		this.tv = tv;
		this.newChannel = newChannel;
	}

	/* METHODS */
	/**
	 * Stores the TV's current channel, then switches to 
	 * the new channel.
	 */
	@Override
	public void execute() {
		oldChannel = tv.getChannel();
		tv.switchChannel(newChannel);
	}

	/**
	 * Switches the TV back to its old channel.
	 */
	@Override
	public void undo() {
		newChannel = tv.getChannel();
		tv.switchChannel(oldChannel);
	}

	@Override
	public String getName() {
		return "Switching to " + tv.getChannel();
	}
}