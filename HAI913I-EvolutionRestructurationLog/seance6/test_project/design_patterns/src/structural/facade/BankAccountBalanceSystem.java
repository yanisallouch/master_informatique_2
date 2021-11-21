package structural.facade;

/**
 * A BankAccountBalanceSystem concrete class that plays the role
 * of Subsystem Class in the Facade Design pattern.<br/>
 * It provides a subsystem functionality consisting of an
 * interface to interact with a Bank Account Balance, for cash
 * withdrawal and deposit.
 * @author anonbnr
 *
 */
public class BankAccountBalanceSystem {

	/* ATTRIBUTES */
	/**
	 * The Bank Account whose balance will be handled by this
	 * BankAccountBalanceSystem.
	 */
	private BankAccount bankAccount;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a BankAccountBalanceSystem associated to
	 * bankAccount.
	 * @param bankAccount The BankAccount associated to
	 * the BankAccountBalanceSystem to create.
	 */
	BankAccountBalanceSystem(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	/* METHODS */
	/**
	 * Gets the BankAccountBalanceSystem's associated 
	 * BankAccount's balance.
	 * @return the associated BankAccount's balance.
	 */
	public double getAccountBalance() {
		return this.bankAccount.getBalance();
	}
	
	/**
	 * Deposits cash in the BankAccountBalanceSystem's associated
	 * BankAccount balance. 
	 * @param cash The amount of cash to deposit in 
	 * this BankAccountBalanceSystem's associated BankAccount balance.
	 */
	public void deposit(double cash) {
		this.bankAccount.setBalance(
				this.getAccountBalance() + cash);
		System.out.println("Deposit complete: Current Balance is "
				+ this.getAccountBalance());
	}
	
	/**
	 * Withdraws cash from this BankAccountBalanceSystem's associated
	 * BankAccount balance, if we can withdraw money from the account.
	 * @param cash
	 */
	public void withdraw(double cash) {
		if (!this.canWithdraw(cash)) {
			System.err.println("Error: You don't have enough money");
			System.out.println("Current Balance is " 
					+ this.getAccountBalance());
		}
		
		else {
			this.bankAccount.setBalance(
					this.getAccountBalance() - cash);
			System.out.println("Withdrawal complete: Current Balance is "
					+ this.getAccountBalance());
		}
	}
	
	/**
	 * Checks if we can withdraw cash from this BankAccountBalanceSystem's
	 * associated BankAccount balance.
	 * @param cash The amount of cash to check for withdrawal
	 * from this BankAccountBalanceSystem's associated BankAccount
	 * balance. 
	 * @return true if cash can be withdrawn from this
	 * BankAccountBalanceSystem's associated BankAccount balance.
	 */
	public boolean canWithdraw(double cash) {
		return this.bankAccount.getBalance() >= cash;
	}
}