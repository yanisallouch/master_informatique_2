package structural.adapter;

/**
 * An EnemyAttacker interface playing the role of Target
 * in the Adapter design pattern.<br/>
 * The interface provides the interface for
 * enemy attackers, and is incompatible with EnemyRobot, 
 * which has to be adapted to work with it 
 * @author anonbnr
 * @see EnemyRobot
 *
 */
public interface EnemyAttacker {
	/* METHODS */
	/**
	 * Allows an EnemyAttacker to fire a weapon
	 */
	void fireWeapon();
	
	/**
	 * Allows an EnemyAttacker to drive forward
	 */
	void driveForward();
	
	/**
	 * Assigns a driver named driverName to an EnemyAttacker
	 */
	void assignDriver(String driverName);
}
