package structural.adapter;

import java.util.Random;

/**
 * An EnemyRobot class playing the role of Adaptee
 * in the Adapter design pattern.<br/>
 * The class provides the interface for
 * enemy robots, and is incompatible with the EnemyAttacker
 * interface. It needs to be adapted to work with it.
 * @author anonbnr
 * @see EnemyAttacker
 */
public class EnemyRobot {
	
	/* ATTRIBUTES */
	/**
	 * A generator used by an EnemyRobot to specify
	 * attack damage and movement distance
	 */
	Random generator = new Random();
	
	/* METHODS */
	/**
	 * Allows an EnemyRobot to attack with its hands
	 */
	public void smashwithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Robot causes " + attackDamage + " damage with its hands");
	}
	
	/**
	 * Allows an EnemyRobot to walk forward
	 */
	public void walkForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Robot walks forward " + movement + " spaces");
	}
	
	/**
	 * Allows an EnemyRobot to react to a human named driverName
	 * @param driverName The name of a human to which an EnemyRobot reacts
	 */
	public void reactToHuman(String driverName) {
		System.out.println("Enemy Robot Tramps on " + driverName + "!");
	}
}
