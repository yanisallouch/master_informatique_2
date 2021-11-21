package creational.builder;

/**
 * a RobotEngineer concrete class that plays the role of Director
 * in the Builder design pattern.
 * It uses a IRobotBuilder to create robots. 
 * It configures it with Concrete IRobotBuilder classes to create
 * different kinds of robots.
 * @author anonbnr
 * @see IRobotBuilder
 * @see IRobot
 */
public class RobotEngineer {
	/* ATTRIBUTES */
	/**
	 * The RobotEngineer's Robot builder
	 */
	private IRobotBuilder robotBuilder;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a RobotEngineer having robotBuilder 
	 * as its Robot builder
	 * @param robotBuilder The value to set this RobotEngineer's
	 * Robot builder
	 */
	public RobotEngineer(IRobotBuilder robotBuilder) {
		this.setRobotBuilder(robotBuilder);
	}
	
	/* METHODS */
	/**
	 * Gets the Robot built by this RobotEngineer's Robot builder
	 * @return the robot built by this RobotEngineer's Robot builder
	 */
	public IRobot getRobot() {
		return this.robotBuilder.getRobot();
	}
	
	/**
	 * Sets this RobotEngineer's Robot builder
	 * @param robotBuilder The value to set this RobotEngineer's
	 * Robot builder 
	 */
	public void setRobotBuilder(IRobotBuilder robotBuilder) {
		this.robotBuilder = robotBuilder;
	}
	
	/**
	 * Constructs the Robot to be returned by this RobotEngineer
	 * by invoking the building operations of its Robot builder
	 */
	public void constructRobot() {
		this.robotBuilder.buildHead();
		this.robotBuilder.buildTorso();
		this.robotBuilder.buildArms();
		this.robotBuilder.buildLegs();
	}
}
