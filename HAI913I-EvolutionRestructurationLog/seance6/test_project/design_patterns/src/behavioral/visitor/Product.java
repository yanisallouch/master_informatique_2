package behavioral.visitor;

/**
 * a Product abstract class that plays the role of Element
 * in the Visitor Design pattern.<br/>
 * Product is the root class of the products hierarchy.
 * It implements the Visitable interface to allow its
 * subclasses to be visitable. The visitor accepting behavior
 * is implemented by its subclasses, each according to its type. 
 * @author anonbnr
 */
public abstract class Product implements Visitable {
	/* ATTRIBUTES */
	/**
	 * The product's name.
	 */
	private String name;
	
	/**
	 * The product's price.
	 */
	private double price;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a Product named name having price.
	 * @param name The name of the Product to create.
	 * @param price The price of the Product to create.
	 */
	public Product(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	/* METHODS */
	/**
	 * Gets this Product's name.
	 * @return this Product's name.
	 */
	public String getName() {return this.name;}
	
	/**
	 * Sets name as this Product's name.
	 * @param name The value to set this Product's name.
	 */
	public void setName(String name) {this.name = name;}
	
	/**
	 * Gets this Product's price.
	 * @return this Product's price.
	 */
	public double getPrice() {return this.price;}
	
	/**
	 * Sets price as this Product's price.
	 * @param price The value to set this Product's price.
	 */
	public void setPrice(double price) {this.price = price;}
}