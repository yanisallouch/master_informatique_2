package behavioral.observer;

/**
 * a Test class for the Observer Design pattern.
 * @author anonbnr
 *
 */
public class Test {

	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMStock(197.00);
		stockGrabber.setAppleStock(677.60);
		stockGrabber.setGoogleStock(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMStock(197.00);
		stockGrabber.setAppleStock(677.60);
		stockGrabber.setGoogleStock(676.40);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIBMStock(197.00);
		stockGrabber.setAppleStock(677.60);
		stockGrabber.setGoogleStock(676.40);
	}
}