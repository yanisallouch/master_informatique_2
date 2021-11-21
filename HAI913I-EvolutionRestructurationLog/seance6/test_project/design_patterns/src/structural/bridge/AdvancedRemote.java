package structural.bridge;

/**
 * an AdvancedRemote concrete class that plays the role of 
 * RefinedAbstraction in the Bridge Design pattern.<br/>
 * It provides a more refined interface for Remote controls, 
 * including a Device muting functionality.
 * @author anonbnr
 *
 */
public class AdvancedRemote extends Remote {

	/* CONSTRUCTORS */
	/**
	 * Creates an AdvancedRemote controlling device.
	 * @param device The Device controlled by the AdvancedRemote
	 * to create.
	 */
	public AdvancedRemote(Device device) {
		super(device);
	}
	
	/* METHODS */
	/**
	 * Mutes the controlled Device.
	 */
	public void mute() {
		device.setVolume(0);
		System.out.println(device.getName() + " is muted. "
				+ "Volume: " + device.getVolume());
	}
}