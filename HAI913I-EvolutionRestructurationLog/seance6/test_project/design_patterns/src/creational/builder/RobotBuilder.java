package creational.builder;

/**
 * a RobotBuilder abstract class that factors the common state
 * of all Concrete RobotBuilders.
 * It implements the IRobotBuilder interface.
 * @author anonbnr
 *
 */
public abstract class RobotBuilder implements IRobotBuilder {
	
	/* ATTRIBUTES */
	/**
	 * The Robot to be built by this RobotBuilder
	 */
	protected Robot robot;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a RobotBuilder and initializes the Robot
	 * to be built by it
	 */
	public RobotBuilder() {
		this.robot = new Robot();
	}

	@Override
	public IRobot getRobot() {
		return this.robot;
	}
}
