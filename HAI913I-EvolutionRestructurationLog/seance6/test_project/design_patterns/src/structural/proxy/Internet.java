package structural.proxy;

/**
 * an Internet interface that plays the role of Subject
 * in the Proxy design pattern.<br/>
 * It provides an interface for connecting to the Internet
 * that we want to limit access to using a proxy.
 * @author anonbnr
 */
public interface Internet {
	
	/* METHODS */
	/**
	 * Connects to serverHost
	 * @param serverHost An Internet host to which we wish to connect
	 */
	void connectTo(String serverHost);
}
