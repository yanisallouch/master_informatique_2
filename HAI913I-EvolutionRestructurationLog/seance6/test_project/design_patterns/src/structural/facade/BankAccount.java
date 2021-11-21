package structural.facade;

/**
 * a BankAccount concrete class that plays the role of Subystem
 * Class in the Facade Design pattern.<br/>
 * It provides a subsystem functionality consisting of 
 * an interface for defining Bank Accounts.
 * @author anonbnr
 *
 */
public class BankAccount {
	
	/* ATTRIBUTES */
	/**
	 * The Bank Account's number.
	 */
	private int number;
	
	/**
	 * The Bank Account's security code.
	 */
	private int securityCode;
	
	/**
	 * The Bank Account's balance.
	 */
	private double balance;
	
	/* CONSTRUCTORS */
	/**
	 * Creates and empty Bank Account.
	 */
	public BankAccount() {
		
	}

	/**
	 * Creates a Bank Account having a number number,
	 * a securityCode security code, and a balance amount of
	 * money in its balance.
	 * @param number The number of the Bank Account to create.
	 * @param securityCode The security code of the Bank Account 
	 * to create.
	 * @param balance The amount of money in the balance of the
	 * Bank Account to create.
	 */
	public BankAccount(int number, int securityCode, 
			double balance) {
		this.number = number;
		this.securityCode = securityCode;
		this.balance = balance;
	}

	/* METHODS */
	/**
	 * Gets this BankAccount's number.
	 * @return this BankAccount's number.
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * Sets number as this BankAccount's number.
	 * @param number The value to set this BankAccount's number. 
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * Gets this BankAccount's security code.
	 * @return this BankAccount's security code.
	 */
	public int getSecurityCode() {
		return securityCode;
	}

	/**
	 * Sets securityCode as this BankAccount's security code.
	 * @param securityCode The value to set this BankAccount's 
	 * security code.
	 */
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * Gets this BankAccount's amount of money in the balance.
	 * @return this BankAccount's amount of money in the balance.
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Sets balance as this BankAccount's amount of money in
	 * the balance.
	 * @param balance The value to set this BankAccount's amount 
	 * of money in the balance.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}