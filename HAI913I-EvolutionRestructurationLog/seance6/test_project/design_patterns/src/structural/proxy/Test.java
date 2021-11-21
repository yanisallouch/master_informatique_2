package structural.proxy;

/**
 * a Test class
 * @author anonbnr
 *
 */
public class Test {
	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("abc.com");
		internet.connectTo("google.com");
	}
}
