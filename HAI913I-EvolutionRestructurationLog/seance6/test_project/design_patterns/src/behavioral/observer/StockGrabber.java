package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * a StockGrabber concrete class that plays the role of ConcreteSubject
 * in the Observer Design pattern.<br/>
 * It provides an interface for observers to subscribe to state changes
 * about stock prices, namely those of IBM, Apple, and Google.
 * @author anonbnr
 */
public class StockGrabber implements Subject {

	/* ATTRIBUTES */
	/**
	 * This stock grabber's list of registered observers.
	 */
	private List<Observer> observers;
	
	/**
	 * The price of the IBM stock.
	 */
	private double ibmStock;
	
	/**
	 * The price of the Apple stock.
	 */
	private double appleStock;
	
	/**
	 * The price of the Google stock
	 */
	private double googleStock;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a StockGrabber and initializes its list of
	 * registered observers as an empty ArrayList.
	 */
	public StockGrabber() {
		observers = new ArrayList<>();
	}
	
	/* METHODS */
	/**
	 * Gets this StockGrabber's IBM stock price.
	 * @return this StockGrabber's IBM stock price.
	 */
	public double getIBMStock() {
		return this.ibmStock;
	}
	
	/**
	 * Sets ibmStock as the price of this StockGrabber's IBM stock.
	 * @param ibmStock The value to set the price of 
	 * this StockGrabber's IBM stock.
	 */
	public void setIBMStock(double ibmStock) {
		this.ibmStock = ibmStock;
		notifyObserver();
	}
	
	/**
	 * Gets this StockGrabber's Apple stock price.
	 * @return this StockGrabber's Apple stock price.
	 */
	public double getAppleStock() {
		return this.appleStock;
	}
	
	/**
	 * Sets appleStock as the price of this StockGrabber's Apple stock.
	 * @param appleStock The value to set the price of 
	 * this StockGrabber's Apple stock.
	 */
	public void setAppleStock(double appleStock) {
		this.appleStock = appleStock;
		notifyObserver();
	}
	
	/**
	 * Gets this StockGrabber's Google stock price.
	 * @return this StockGrabber's Google stock price.
	 */
	public double getGoogleStock() {
		return this.googleStock;
	}
	
	/**
	 * Sets googleStock as the price of this StockGraber's Google stock.
	 * @param googleStock The value to set the price of 
	 * this StockGraber's Google stock.
	 */
	public void setGoogleStock(double googleStock) {
		this.googleStock = googleStock;
		notifyObserver();
	}
	
	/**
	 * Adds observer to this StockGrabber's list of registered
	 * observers.
	 */
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Removes observer from this StockGrabber's list of registered
	 * observers.
	 */
	@Override
	public void unregister(Observer o) {
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer: observers)
			observer.update();
	}
}