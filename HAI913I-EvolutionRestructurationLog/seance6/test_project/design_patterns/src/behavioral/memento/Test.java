package behavioral.memento;

/**
 * a Test class for the Memento Design pattern.
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State 1");
		originator.setState("State 2");
		careTaker.addMemento(originator.externalizeState());
		
		originator.setState("State 3");
		careTaker.addMemento(originator.externalizeState());
		
		originator.setState("State 4");
		System.out.println("Originator's current state: " 
				+ originator.getState());
		
		originator.restoreState(careTaker.get(0));
		System.out.println("Originator's first saved state: " 
				+ originator.getState());
		originator.restoreState(careTaker.get(1));
		System.out.println("Originator's second saved state: " 
				+ originator.getState());
	}
}