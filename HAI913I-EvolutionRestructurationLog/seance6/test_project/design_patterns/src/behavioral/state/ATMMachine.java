package behavioral.state;

/**
 * An ATMMachine concrete class playing the role of Context
 * in the State Design pattern.<br/>
 * An ATMMachine has a current ConcreteState, and several
 * possible alternative ConcreteStates 
 * (HasCard, NoCard, CorrectPin, NoCash)<br/>
 * Each state defines the behavior of the ATMMachine in :
 * <ol>
 * 	<li>reactions to a card inserted/ejected</li>
 * 	<li>reactions to pin entered</li>
 * 	<li>reactions to cash withdrawal requests</li>
 *</ol><br/><br/>
 *
 * @author anonbnr
 * @see HasCard
 * @see NoCard 
 * @see CorrectPin
 * @see NoCash
 */
public class ATMMachine {
	/* ATTRIBUTES */
	/**
	 * The machine's current state.
	 */
	protected ATMState atmState;
	
	// Possible states
	/**
	 * The machine's HasCard state. 
	 */
	private ATMState hasCard;
	
	/**
	 * The machine's NoCard state. 
	 */
	private ATMState noCard;
	
	/**
	 * The machine's CorrectPin state. 
	 */
	private ATMState correctPin;
	
	/**
	 * The machine's NoCash state.
	 */
	private ATMState noCash;
	
	// Data
	/**
	 * The amount of cash in the machine.
	 */
	private int cashInMachine = 2000;
	
	/* CONSTRUCTORS */
	/**
	 * Creates an ATMMachine, sets its possible states,
	 * and sets its current state to NoCard if it contains
	 * cash, otherwise sets its current state to NoCash.
	 */
	public ATMMachine() {
		noCard = new NoCard(this);
		hasCard = new HasCard(this);
		correctPin = new CorrectPin(this);
		noCash = new NoCash(this);
		
		if (cashInMachine <= 0)
			atmState = noCash;
		else
			atmState = noCard;
	}
	
	/* METHODS */
	/**
	 * Gets this machine's current state.
	 * @return this machine's current state
	 */
	public ATMState getATMState() {
		return this.atmState;
	}
	
	/**
	 * Sets this machine's current state to atmState.
	 * @param atmState The IATMState to set this machine's 
	 * current state.
	 */
	public void setATMState(ATMState atmState) {
		this.atmState = atmState;
	}
	
	/**
	 * Gets this machine's NoCard state.
	 * @return this machine's NoCard state.
	 */
	public ATMState getNoCardState() { return this.noCard; }
	
	/**
	 * Gets this machine's HasCard state.
	 * @return this machine's HasCard state.
	 */
	public ATMState getHasCardState() { return this.hasCard; }
	
	/**
	 * Gets this machine's CorrectPin state.
	 * @return this machine's CorrectPin state.
	 */
	public ATMState getCorrectPinState() { return this.correctPin; }
	
	/**
	 * Gets this machine's NoCash state.
	 * @return this machine's NoCash state.
	 */
	public ATMState getNoCashState() { return this.noCash; }
	
	/**
	 * Gets this machine's amount of cash.
	 * @return this machine's amount of cash.
	 */
	public int getCashInMachine() {
		return this.cashInMachine;
	}
	
	/**
	 * Sets cashInMachine as this machine's amount of cash.
	 * @param cashInMachine The value to set this machine's amount of cash.
	 */
	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	/**
	 * Invokes the card insertion behavior on this machine's
	 * current state.
	 */
	public void insertCard() {
		this.atmState.insertCard();
	}
	
	/**
	 * Invokes the card ejection behavior on this machine's
	 * current state.
	 */
	public void ejectCard() {
		this.atmState.ejectCard();
	}
	
	/**
	 * Invokes the PIN entering behavior on this machine's
	 * current state.
	 */
	public void insertPin(int pin) {
		this.atmState.insertPin(pin);
	}
	
	/**
	 * Invokes the cash withdrawal behavior on this machine's
	 * current state.
	 */
	public void requestCash(int cash) {
		this.atmState.requestCash(cash);
	}
}