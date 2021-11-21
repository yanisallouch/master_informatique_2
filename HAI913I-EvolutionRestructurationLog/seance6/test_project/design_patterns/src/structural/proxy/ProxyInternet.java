package structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * a ProxyInternet concrete class that plays the role of Proxy
 * in the Proxy design pattern.<br/>
 * It provides a proxy to classes implementing Internet, particularly
 * to ban Internet connections to some hosts.
 * @author anonbnr
 *
 */
public class ProxyInternet implements Internet {
	
	/* ATTRIBUTES */
	/**
	 * The proxied Internet connection
	 */
	private Internet internet;
	
	/**
	 * The list of banned sites
	 */
	private static List<String> bannedSites;
	
	static {
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
		bannedSites.add("def.com");
		bannedSites.add("ijk.com");
		bannedSites.add("lnm.com");
	}

	/* METHODS */
	/**
	 * Only allows the proxied Internet connection to connect to hosts 
	 * that are not in the banned sites, otherwise denies access to the host.
	 * It also creates the Internet connection, only if it hasn't already
	 * been created 
	 */
	@Override
	public void connectTo(String serverHost) {
		if (bannedSites.contains(serverHost))
			System.err.println("Access Denied to " + serverHost);
		
		else {
			if (internet == null)
				internet = new RealInternet();
			
			internet.connectTo(serverHost);
		}
	}
}
