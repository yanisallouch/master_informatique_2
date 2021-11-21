package structural.facade;

/**
 * A BankAccountNumberChecker concrete class that plays the role
 * of Subsystem Class in the Facade Design pattern.<br/>
 * It provides a subsystem functionality consisting of
 * checking whether a provided number is a valid bank 
 * account number.
 * @author anonbnr
 *
 */
public class BankAccountNumberChecker {

	/* ATTRIBUTES */
	/**
	 * The Bank Account associated to this BankAccountChecker.
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
	 * Creates a BankAccountNumberChecker having bankAccount
	 * as its associated bank account.
	 * @param bankAccount The valid bank account number of
	 * the BankAccountNumberChecker to create. 
	 */
	public BankAccountNumberChecker(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	/* METHODS */
	/**
	 * Gets this BankAccountNumberChecker's associated bank account
	 * number.
	 * @return this BankAccountNumberChecker's associated bank 
	 * account number.
	 */
	public int getAccountNumber() {
		return this.bankAccount.getNumber();
	}
	
	/**
	 * Checks whether accountNumber is the same as the one
	 * of the bank account associated to this BankAccountNumberChecker.
	 * @param accountNumber The candidate bank account number.
	 * @return true if accountNumber designates the
	 * account number of the bank account associated to 
	 * this BankAccountNumberChecker.
	 */
	public boolean match(int accountNumber) {
		return this.getAccountNumber() == accountNumber;
	}
}