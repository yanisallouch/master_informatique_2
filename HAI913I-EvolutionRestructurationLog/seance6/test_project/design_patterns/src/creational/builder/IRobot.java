package creational.builder;

/**
 * a IRobot interface that plays the role of Product 
 * in the Builder design pattern.
 * It defines an interface for all possible robots 
 * @author anonbnr
 */
public interface IRobot {
	
	/**
	 * Sets this Robot's head to head
	 * @param head The value to set this robot's head
	 */
	void setHead(String head);
	
	/**
	 * Sets this Robot's torso to torso
	 * @param torso The value to set this robot's torso
	 */
	void setTorso(String torso);
	
	/**
	 * Sets this Robot's arms to arms
	 * @param arms The value to set this robot's arms
	 */
	void setArms(String arms);
	
	/**
	 * Sets this Robot's legs to legs
	 * @param legs The value to set this robot's legs
	 */
	void setLegs(String legs);
}
