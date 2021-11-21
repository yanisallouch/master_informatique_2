package structural.facade;

/**
 * A BankAccountWelcomeWindow concrete class that plays the role of
 * Subsystem Class in the Facade Design pattern.<br/>
 * It provides a subsystem functionality consisting of displaying
 * a welcoming message to a client upon interacting with its account.
 * @author anonbnr
 *
 */
public class BankAccountWelcomeWindow {
	/* ATTRIBUTES */
	/**
	 * The Bank Account associated to this BankAccountWelcomeWindow.  
	 */
	private BankAccount bankAccount;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BankAccountWelcomeWindow that welcomes
	 * the client.
	 */
	public BankAccountWelcomeWindow(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
		System.out.println(this.setWelcomeMessage());
	}
	
	/* METHODS */
	/**
	 * Sets the welcoming message of this BankAccountWelcomeWindow
	 */
	public String setWelcomeMessage() {
		StringBuffer buf = new StringBuffer();
		
		buf.append("Welcome to ABC Bank\n");
		buf.append("We're happy to provide you with money, " 
				+ "if we can\n");
		buf.append("Account: " + bankAccount.getNumber() + "\n");
		buf.append("Balance: " + bankAccount.getBalance());
		
		return buf.toString();
	}
}
