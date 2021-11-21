package structural.facade;

/**
 * a Test class for the Facade Design pattern.
 * @author anonbnr
 *
 */
public class Test {

	public static void main(String[] args) {
		int clientAccountNumber = 123456789,
				clientSecurityCode = 1234;
		
		BankAccountFacade facade = new BankAccountFacade(
				clientAccountNumber, clientSecurityCode);
		
		facade.withdrawCash(50);
		facade.withdrawCash(900);
		facade.depositCash(200);
	}
}