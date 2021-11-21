package structural.bridge;

/**
 * a Device abstract class that plays the role of Implementor in
 * the Bridge Design pattern.<br/>
 * It provides a common factoring for all devices, and default
 * implementations for their behavior.
 * It's bridged to its Remote abstraction to allow different remote
 * controls to work for different devices, independently. The
 * client then only has to deal with a Remote interface to control 
 * its Device, independently of how that control is implemented 
 * by the Device itself.
 * @author anonbnr
 * @see Remote
 *
 */
public abstract class Device {
	
	/* ATTRIBUTES */
	/**
	 * The Device's volume.
	 */
	private int volume;
	
	/**
	 * The Device's channel.
	 */
	private int channel;
	
	/**
	 * The Device's power status.
	 */
	private boolean isEnabled;
	
	/**
	 * The Device's name.
	 */
	protected String name;

	/* METHODS */
	/**
	 * Checks if the Device is enabled
	 * @return true if the Device is enabled, false otherwise
	 */
	public boolean isEnabled() {
		return this.isEnabled;
	}
	
	/**
	 * Enables this Device.
	 */
	public void enable() {
		this.isEnabled = true;
	}
	
	/**
	 * Disables this Device.
	 */
	public void disable() {
		this.isEnabled = false;
	}
	
	/**
	 * Gets this Device's volume.
	 * @return this Device's volume.
	 */
	public int getVolume() {
		return this.volume;
	}
	
	/**
	 * Sets volume as this Device's volume.
	 * @param volume The value to set this Device's volume.
	 */
	public void setVolume(int volume) {
		if (volume >= 0)
			this.volume = volume;
	}
	
	/**
	 * Gets this Device's channel.
	 * @return this Device's channel.
	 */
	public int getChannel() {
		return this.channel;
	}
	
	/**
	 * Sets channel as this Device's channel.
	 * @param channel The value to set this Device's channel.
	 */
	public void setChannel(int channel) {
		if (channel > 0)
			this.channel = channel;
	}
	
	/**
	 * Gets this Device's name.
	 * @return this Device's name.
	 */
	public String getName() {
		return name;
	}
}