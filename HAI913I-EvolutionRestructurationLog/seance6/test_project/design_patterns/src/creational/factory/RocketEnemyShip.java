package creational.factory;

/**
 * A RocketEnemyShip concrete class playing the role of 
 * ConcreteProduct in the Factory Method Design pattern.<br/>
 * It provides the interface for Rocket EnemyShips.
 * 
 * @author anonbnr
 */
public class RocketEnemyShip extends EnemyShip {

	/* CONSTRUCTORS */
	/**
	 * Creates a RocketEnemyShip, named "Rocket Enemy Ship",
	 * and inflicting 10.0 damage upon attacking 
	 */
	public RocketEnemyShip() {
		super("Rocket Enemy Ship", 10.0);
	}
}