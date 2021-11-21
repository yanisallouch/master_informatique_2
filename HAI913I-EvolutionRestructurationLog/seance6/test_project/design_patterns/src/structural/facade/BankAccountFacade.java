package structural.facade;

/**
 * A BankAccount concrete class that plays the role of 
 * Facade in the Facade Design pattern.<br/>
 * It provides a simpler interface to interact with an account
 * balance system composed of many subsystems including: 
 * <ol>
 * 	<li>A Welcoming message printer</li>
 * 	<li>An Account Number checker</li>
 * 	<li>A Security Code checker</li>
 * 	<li>A Balance withdrawal and deposit subsystem</>
 * </ol>
 * @author anonbnr
 *
 */
public class BankAccountFacade {

	/* ATTRIBUTES */
	/**
	 * The BankAccount that this Facade is 
	 * matching the client's credentials against to allow
	 * it access to it interface.
	 */
	private BankAccount bankAccount;
	
	/**
	 * The window welcoming the Bank Account client.
	 */
	private BankAccountWelcomeWindow welcomeWindow;
	
	/**
	 * The account number provided by the client.
	 */
	private int accountNumber;
	
	/**
	 * The security number provided by the client.
	 */
	private int securityCode;
	
	/**
	 * The number checker for the client's provided account 
	 * number. 
	 */
	private BankAccountNumberChecker numberChecker;
	
	/**
	 * The security code checker for the client's provided 
	 * security code.
	 */
	private BankAccountSecurityCodeChecker codeChecker;
	
	/**
	 * The balance system for this Facade's associated BankAccount.
	 */
	private BankAccountBalanceSystem balanceSystem;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BankAccountFacade for the accountNumber
	 * and securityCode provided by the client, in order to
	 * allow them to interact with its simple interface.
	 * @param accountNumber The account number provided to 
	 * the BankAccountFacade to create. 
	 * @param securityCode The security code provided to 
	 * the BankAccountFacade to create. 
	 */
	public BankAccountFacade(int accountNumber, int securityCode) {
		this.fetchBankAccount();
		this.welcomeWindow = new BankAccountWelcomeWindow(bankAccount);
		
		this.accountNumber = accountNumber;
		this.securityCode = securityCode;
		this.numberChecker = new BankAccountNumberChecker(bankAccount);
		this.codeChecker = new BankAccountSecurityCodeChecker(bankAccount);
		this.balanceSystem = new BankAccountBalanceSystem(bankAccount);
	}
	
	/* METHODS */
	/**
	 * Gets the account number provided to this BankAccountFacade 
	 * by the client.
	 * @return the account number provided to this BankAccountFacade 
	 * by the client.
	 */
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * Gets the security code provided to this BankAccountFacade 
	 * by the client.
	 * @return the security code provided to this BankAccountFacade 
	 * by the client.
	 */
	public int getSecurityCode() {
		return this.securityCode;
	}
	
	/**
	 * Allows the client to withdraw cash from its BankAccount,
	 * if the account number and security code match those of the
	 * BankAccountFacade's associated BankAccount, and that the
	 * client is allowed to withdraw cash from this BankAccount.
	 * @param cash The cash to withdraw as requested by the client.  
	 */
	public void withdrawCash(double cash) {
		if (numberChecker.match(accountNumber)
				&& codeChecker.match(securityCode)
				&& balanceSystem.canWithdraw(cash)) {
		
			balanceSystem.withdraw(cash);
			System.out.println("Transaction Complete.\n");
		}
		else
			System.err.println("Transaction Failed.\n");
	}
	
	/**
	 * Allows the client to deposit cash into its BankAccount,
	 * if the account number and security code match those of the
	 * BankAccountFacade's associated BankAccount.
	 * @param cash The cash to deposit as requested by the client.  
	 */
	public void depositCash(double cash) {
		if (numberChecker.match(accountNumber)
				&& codeChecker.match(securityCode)) {
			balanceSystem.deposit(cash);
			System.out.println("Transaction Complete.\n");
		}
		else
			System.err.println("Transaction Failed.\n");
	}
	
	/**
	 * Fetches a BankAccount to which the credentials of the
	 * client must be matched. Can be obtained through
	 * dependency injection , by involving some sort of a 
	 * database query on a Bank Account database
	 */
	private void fetchBankAccount() {
		this.bankAccount = new BankAccount(123456789, 1234, 1000);
	}
}