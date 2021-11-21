package structural.adapter;

/**
 * An EnemyRobotAdapter class playing the role of Adapter
 * in the Adapter design pattern.<br/>
 * The class uses the object adapter variant of the design
 * pattern to adapt the EnemyRobot interface to
 * the EnemyAttacker interface
 * @author anonbnr
 *
 */
public class EnemyRobotAdapter implements EnemyAttacker {
	
	/* ATTRIBUTES */
	/**
	 * The EnemyRobot instance that will be adapted by this adapter
	 * to work with EnemyAttacker
	 */
	private EnemyRobot robot;
	
	/* CONSTRUCTOR */
	/**
	 * Creates an EnemyRobotAdapter having robot as an EnemyRobot
	 * to adapt to work with EnemyAttacker
	 * @param robot The EnemyRobot to adapt to work with EnemyAttacker
	 */
	public EnemyRobotAdapter(EnemyRobot robot) {
		this.setRobot(robot);
	}

	/* METHODS */
	/**
	 * Sets robot as this adapter's EnemyRobot to adapt to work
	 * with EnemyAttacker
	 * @param robot The value to set this adapter's EnemyRobot to
	 * adapt work with EnemyAttacker
	 */
	public void setRobot(EnemyRobot robot) {
		this.robot = robot;
	}
	
	/**
	 * Adapts the smashWithHands() method of EnemyRobot
	 */
	@Override
	public void fireWeapon() {
		robot.smashwithHands();
	}
	
	/**
	 * Adapts the walkForward() method of EnemyRobot
	 */
	@Override
	public void driveForward() {
		robot.walkForward();
	}

	/**
	 * Adapts the reactToHuman() method of EnemyRobot
	 */
	@Override
	public void assignDriver(String driverName) {
		robot.reactToHuman(driverName);
	}
}
