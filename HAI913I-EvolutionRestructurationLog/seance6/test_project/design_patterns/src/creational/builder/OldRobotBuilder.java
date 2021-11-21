package creational.builder;

/**
 * a OldRobotBuilder concrete class that plays the role of a ConcreteBuilder
 * in the Builder design pattern.
 * It extends the RobotBuilder abstract class to create old robots.
 * @author anonbnr
 *
 */
public class OldRobotBuilder extends RobotBuilder {

	/**
	 * Builds an old Robot's head
	 */
	@Override
	public void buildHead() {
		this.robot.setHead("Old Robot head");
	}

	/**
	 * Builds an old Robot's torso
	 */
	@Override
	public void buildTorso() {
		this.robot.setTorso("Old Robot torso");
	}

	/**
	 * Builds an old Robot's arms
	 */
	@Override
	public void buildArms() {
		this.robot.setArms("Old Robot arms");
	}

	/**
	 * Builds an old Robot's legs
	 */
	@Override
	public void buildLegs() {
		this.robot.setLegs("Old Robot legs");
	}
}
