package structural.bridge;

/**
 * a Remote concrete class that plays the role of Abstraction
 * in the Bridge Design pattern.<br/>
 * It provides a common factoring of any Remote control's state
 * and default implementations of its behavior.
 * It references a Device as its bridging implementor, 
 * within which it encapsulates the concrete 
 * implementation of this control.
 * @author anonbnr
 *
 */
public class Remote {
	
	/* ATTRIBUTES */
	/**
	 * The Device controlled by this Remote.
	 */
	protected Device device;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a Remote controlling device
	 * @param device The Device controlled by the Remote to create.
	 */
	public Remote(Device device) {
		this.device = device;
	}
	
	/* METHODS */
	/**
	 * Toggles the controlled Device's power status
	 */
	public void togglePower() {
		if (device.isEnabled())
			device.disable();
		else
			device.enable();
		
		System.out.println(device.getName() + " is now " 
				+ (device.isEnabled()? "On." : "Off."));
	}
	
	/**
	 * Turns down the controlled Device's volume
	 */
	public void volumeDown() {
		device.setVolume(device.getVolume() - 1);
		System.out.println("Volume: " + device.getVolume());
	}
	
	/**
	 * Turns up the controlled Device's volume
	 */
	public void volumeUp() {
		device.setVolume(device.getVolume() + 1);
		System.out.println("Volume: " + device.getVolume());
	}
	
	/**
	 * Goes to the controlled Device's previous channel
	 */
	public void channelDown() {
		device.setChannel(device.getChannel() - 1);
		System.out.println("Channel: " + device.getChannel());
	}
	
	/**
	 * Goes to the controlled Device's next channel
	 */
	public void channelUp() {
		device.setChannel(device.getChannel() + 1);
		System.out.println("Channel: " + device.getChannel());
	}
}
