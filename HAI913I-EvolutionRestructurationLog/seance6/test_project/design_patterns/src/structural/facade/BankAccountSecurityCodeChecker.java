package structural.facade;

/**
 * A BankAccountSecurityCodeChecker concrete class that plays 
 * the role of Subsystem Class in the Facade Design pattern.<br/>
 * It provides a subsystem functionality consisting of
 * checking whether a provided security code is a valid bank 
 * security code.
 * @author anonbnr
 *
 */
public class BankAccountSecurityCodeChecker {
	
	/* ATTRIBUTES */
	/**
	 * The Bank Account associated to this BankAccountSecurityCodeChecker.
	 */
	/*
	 * can be fetched
	 * by dependency injection through the constructor, by
	 * involving some sort of a database query on a Bank Account
	 * database
	 */
	private BankAccount bankAccount;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a BankAccountSecurityCodeChecker having bankAccount
	 * as its associated bank account.
	 * @param bankAccount The valid bank account number of
	 * the BankAccountSecurityCodeChecker to create. 
	 */
	public BankAccountSecurityCodeChecker(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	/* METHODS */
	/**
	 * Gets this BankAccountSecurityCodeChecker's associated bank account
	 * security code.
	 * @return this BankAccountSecurityCodeChecker's associated bank 
	 * security code.
	 */
	public int getAccountSecurityCode() {
		return this.bankAccount.getSecurityCode();
	}
	
	/**
	 * Checks whether securityCode is the same as the one
	 * of the bank account associated to this BankAccountSecurityCodeChecker.
	 * @param securityCode The candidate bank account security code.
	 * @return true if securityCode designates the
	 * security code of the bank account associated to 
	 * this BankAccountSecurityCodeChecker.
	 */
	public boolean match(int securityCode) {
		return this.getAccountSecurityCode() == securityCode;
	}
}