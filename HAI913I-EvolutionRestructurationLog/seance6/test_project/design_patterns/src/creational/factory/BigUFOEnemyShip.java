package creational.factory;

/**
 * A BigUFOEnemyShip concrete class playing the role of 
 * ConcreteProduct in the Factory Method Design pattern.<br/>
 * It provides the interface for Big UFO EnemyShips.
 * @author anonbnr
 */
public class BigUFOEnemyShip extends UFOEnemyShip {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BigUFOEnemyShip, named "Big UFO Enemy Ship",
	 * and inflicting 40.0 damage upon attacking 
	 */
	public BigUFOEnemyShip() {
		super("Big UFO Enemy Ship", 40.0);		
	}
}