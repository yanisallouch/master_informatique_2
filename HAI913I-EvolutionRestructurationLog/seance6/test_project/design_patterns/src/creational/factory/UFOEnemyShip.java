package creational.factory;

/**
 * A UFOEnemyShip concrete class playing the role of 
 * ConcreteProduct in the Factory Method Design pattern.<br/>
 * It provides the interface for UFO EnemyShips.
 * @author anonbnr
 */
public class UFOEnemyShip extends EnemyShip {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a UFOEnemyShip, named "UFO Enemy Ship",
	 * and inflicting 20.0 damage upon attacking 
	 */
	public UFOEnemyShip() {
		super("UFO Enemy ship", 20.0);
	}
	
	/**
	 * Creates a UFOEnemyShip named name and having amtDamage
	 * as its amount of inflicted damage.
	 */
	public UFOEnemyShip(String name, double amtDamage) {
		super(name, amtDamage);
	}
}