package behavioral.command;

/**
 * a TV concrete class that plays the role of Receiver in the
 * Command Design pattern.<br/>
 * It can have one or many of its operations invoked as 
 * primitive operations in a ConcreteCommand's associated operation.
 * It provides an interface for a TV, namely whether it's on or off,
 * and a way to switch between its channels. 
 * @author anonbnr
 */
public class TV {
	
	/* ATTRIBUTES */
	/**
	 * Specifies whether this TV is on/off.
	 */
	private boolean isOn;
	
	/**
	 * This TV's current channel.
	 */
	private int channel;
	
	/* METHODS */
	/**
	 * Checks whether this TV is on/off.
	 * @return true if it's on, false otherwise.
	 */
	public boolean isOn() {
		return isOn;
	}
	
	/**
	 * Gets this TV's current channel.
	 * @return this TV's current channel.
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * Switches this TV on.
	 */
	public void switchOn() {
		isOn = true;
	}
	
	/**
	 * Switches this TV off.
	 */
	public void switchOff() {
		isOn = false;
	}
	
	/**
	 * Sets channel as this TV's current channel.
	 * @param channel The value to set this TV's current channel. 
	 */
	public void switchChannel(int channel) {
		this.channel = channel;
	}
}