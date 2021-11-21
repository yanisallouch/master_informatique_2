package structural.bridge;

/**
 * a Test class of the Bridge Design pattern.
 * @author anonbnr
 */
public class Test {
	public static void main(String[] args) {
		Device radio = new Radio("Aiwa");
		Device tv = new TV("Sony");
		
		Remote remote = new Remote(radio);
		ordinaryRemoteTest(remote);
		
		remote = new Remote(tv);
		ordinaryRemoteTest(remote);
		
		AdvancedRemote advRemote = new AdvancedRemote(tv);
		advancedRemoteTest(advRemote);

		advRemote = new AdvancedRemote(radio);
		advancedRemoteTest(advRemote);
	}

	/**
	 * Tests the usage of remote on a given device.
	 * @param remote The Remote to test.
	 */
	public static void ordinaryRemoteTest(Remote remote) {
		remote.togglePower();
		remote.channelUp();
		remote.channelUp();
		remote.channelUp();
		remote.channelDown();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeUp();
		remote.volumeDown();
		remote.volumeDown();
		remote.togglePower();
		System.out.println();
	}
	
	/**
	 * Tests the usage of advRemote on a given device.
	 * @param advRemote The AdvancedRemote to test.
	 */
	public static void advancedRemoteTest(AdvancedRemote advRemote) {
		advRemote.togglePower();
		advRemote.channelUp();
		advRemote.channelUp();
		advRemote.channelDown();
		advRemote.volumeUp();
		advRemote.volumeUp();
		advRemote.volumeUp();
		advRemote.volumeDown();
		advRemote.mute();
		advRemote.togglePower();
		System.out.println();
	}
}
