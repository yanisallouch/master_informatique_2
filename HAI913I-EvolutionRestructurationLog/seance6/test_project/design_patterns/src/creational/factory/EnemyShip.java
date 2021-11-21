package creational.factory;

/**
 * an EnemyShip concrete class playing the role of Product
 * in the Factory Method Design pattern.<br/>
 * It provides an interface for all possible EnemyShips 
 * that can be created by the factory method
 * 
 * @author anonbnr
 *
 */
public abstract class EnemyShip {
	/* ATTRIBUTES */
	/**
	 * The EnemyShip's name
	 */
	private String name;
	
	/**
	 * The EnemyShip's amount of damage inflicted
	 */
	private double amtDamage;
	
	/* CONSTRUCTORS */
	/**
	 * Creates an EnemyShip named name and having amtDamage
	 * as its amount of inflicted damage.
	 * @param name The name of the EnemyShip to create.
	 * @param amtDamage The amount of damage inflicted
	 * by the EnemyShip to create.
	 */
	public EnemyShip(String name, double amtDamage) {
		this.setName(name);
		this.setAmtDamage(amtDamage);
	}
	
	/* METHODS */
	/**
	 * Gets this EnemyShip's name
	 * @return this EnemyShip's name
	 */
	public String getName() {return name;}
	
	/**
	 * Sets this EnemyShip's name to name.
	 * @param name The value to set this EnemyShip's name.
	 */
	public void setName(String name) {this.name = name;}
	
	/**
	 * Gets this EnemyShip's amount of inflicted damage.
	 * @return this EnemyShip's amount of inflicted damage.
	 */
	public double getAmtDamage() {return amtDamage;}
	
	/**
	 * Sets this EnemyShip's amount of inflicted damage to amtDamage.
	 * @param amtDamage The value to set this EnemyShip's
	 * amount of inflicted damage.
	 */
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	/**
	 * Allows this EnemyShip to follow a Hero ship.
	 */
	public void followHeroShip() {
		System.out.println(this.name + " is following the hero");
	}
	
	/**
	 * Displays this EnemyShip's name on the screen.
	 */
	public void displayEnemyShip() {
		System.out.println(this.name + " is on the screen");
	}
	
	/**
	 * Allows this EnemyShip to inflict damage.
	 */
	public void enemyShipShoots() {
		System.out.println(this.name + " attacks and does " + this.amtDamage + " damage");
	}
}