package structural.proxy;

/**
 * a RealInternet concrete class that plays the role of RealSubject
 * in the Proxy design pattern.<br/>
 * It implements the Internet interface to allow access to the Internet.
 * @author anonbnr
 *
 */
public class RealInternet implements Internet {

	/* METHODS */
	@Override
	public void connectTo(String serverHost) {
		System.out.println("Connecting to " + serverHost);
	}
}
