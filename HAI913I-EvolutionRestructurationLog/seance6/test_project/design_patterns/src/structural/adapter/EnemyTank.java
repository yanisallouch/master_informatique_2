package structural.adapter;

import java.util.Random;

/**
 * An EnemyTank class, conforming to the EnemyAttacker interface.
 * The class needs to interact with EnemyRobot, but cannot
 * do so because EnemyRobot has an incompatible interface.
 * EnemyRobot needs to be adapted to work with it.
 * @author anonbnr
 * @see EnemyRobot
 * @see EnemyRobotAdapter
 * 
 */
public class EnemyTank implements EnemyAttacker {
	
	/* ATTRIBUTES */
	/**
	 * A generator used by an EnemyTank to specify
	 * attack damage and movement distance
	 */
	private Random generator = new Random();

	/* METHODS */
	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		System.out.println("Enemy Tank does " + attackDamage + " damage");
	}

	@Override
	public void driveForward() {
		int movement = generator.nextInt(5) + 1;
		System.out.println("Enemy Tank moves " + movement + " spaces");
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println(driverName + " is driving the tank");
	}
}
