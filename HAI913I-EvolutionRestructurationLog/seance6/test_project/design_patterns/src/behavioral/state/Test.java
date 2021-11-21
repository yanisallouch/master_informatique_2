package behavioral.state;

/**
 * a Test class of the State Design pattern.
 * @author anonbnr
*/
public class Test {

	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();
		
		atm.insertCard();
		
		atm.ejectCard();
		
		atm.insertCard();
		
		atm.insertPin(12);
		
		atm.insertCard();
		
		atm.insertPin(1234);
		
		atm.requestCash(2500);
		
		atm.insertCard();
		
		atm.insertPin(1234);
		
		atm.requestCash(2000);
		
		atm.insertCard();
	}
}