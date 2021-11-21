package creational.builder;

/**
 * a IRobotBuilder interface that plays the role of Builder
 * in the Builder design pattern.
 * It defines the interface for all robot builders.
 * @author anonbnr
 * @see IRobot
 */
public interface IRobotBuilder {
	/**
	 * Builds a Robot's head
	 */
	void buildHead();
	
	/**
	 * Builds a Robot's torso
	 */
	void buildTorso();
	
	/**
	 * Builds a Robot's arms
	 */
	void buildArms();
	
	/**
	 * Builds a Robot's legs
	 */
	void buildLegs();
	
	/**
	 * Returns the built Robot
	 */
	IRobot getRobot();
}
