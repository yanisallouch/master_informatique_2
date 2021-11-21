package creational.builder;

/**
 * a test class
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		RobotEngineer robotEngineer = new RobotEngineer(new OldRobotBuilder());
		robotEngineer.constructRobot();
		Robot robot = (Robot) robotEngineer.getRobot();
		System.out.println("An old Robot:\n" + robot);
		System.out.println();
		
		robotEngineer.setRobotBuilder(new SophisticatedRobotBuilder());
		robotEngineer.constructRobot();
		robot = (Robot) robotEngineer.getRobot();
		System.out.println("A sophisticated Robot:\n" + robot);
	}
}
