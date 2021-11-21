package behavioral.observer;

/**
 * a StockObserver concrete class that plays the role of
 * ConcreteObserver in the Observer Design pattern.<br/>
 * It provides an interface for stock observer to update their
 * state upon being notified from a StockGrabber subject.
 * @author anonbnr
 *
 */
public class StockObserver implements Observer {
	/* ATTRIBUTES */
	
	/**
	 * The StockGrabber instance that this 
	 * StockObserver is registered to.
	 */
	private StockGrabber stockGrabber;
	
	/**
	 * This StockObserver's id
	 */
	private int id;
	
	/**
	 * The price of the IBM stock.
	 */
	private double ibmStock;
	
	/**
	 * The price of the Apple stock.
	 */
	private double appleStock;
	
	/**
	 * The price of the Google stock.
	 */
	private double googleStock;
	
	/**
	 * A counter for the number of StockObservers created.
	 */
	private static int idTracker = 0;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a StockObserver that gets registerd to stockGrabber.
	 * @param stockGrabber The StockGrabber to which the StockObserver
	 * to create gets registered.
	 */
	public StockObserver(StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.id = ++idTracker;
		stockGrabber.register(this);
	}
	
	/* METHODS */
	/**
	 * Updates the stocks observed by this StockObserver
	 * and displays their new states.
	 */
	@Override
	public void update() {
		this.ibmStock = stockGrabber.getIBMStock();
		this.appleStock = stockGrabber.getAppleStock();
		this.googleStock = stockGrabber.getGoogleStock();
		
		displayPrices();
	}
	
	
	/**
	 * Displays the states of the stocks observed by this
	 * StockObserver.
	 */
	public void displayPrices() {
		StringBuffer buf = new StringBuffer();
		
		buf.append("Observer " + id + "\n");
		buf.append("IBM: " + ibmStock + "\n");
		buf.append("Apple: " + appleStock + "\n");
		buf.append("Google: " + googleStock + "\n");
		
		System.out.println(buf.toString());
	}
}