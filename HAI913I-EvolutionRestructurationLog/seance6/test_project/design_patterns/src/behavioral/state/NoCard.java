package behavioral.state;

/**
 * A NoCard concrete class playing the role of ConcreteState
 * in the State Design pattern.<br/>
 * A NoCard state designates the state of an ATMMachine when 
 * it has no card inserted into it.
 * @author anonbnr
 */
public class NoCard extends ATMState {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a NoCard state having context as its context.
	 * @param context The context of the NoCard state to create.
	 */
	public NoCard(ATMMachine context) {
		super(context);
	}	

	/* METHODS */
	/**
	 * Sets its context's state into a HasCard state,
	 * and asks the client to enter the PIN of the inserted
	 * card.
	 */
	@Override
	public void insertCard() {
		System.out.println("Please enter a PIN");
		this.context.setATMState(this.context.getHasCardState());
	}

	/**
	 * Asks the client to insert a card first, prior
	 * to be allowed to eject it.
	 */
	@Override
	public void ejectCard() {
		defaultMessage();
	}

	/**
	 * Asks the client to insert a card first, prior
	 * to be allowed to enter its PIN.
	 */
	@Override
	public void insertPin(int pin) {
		defaultMessage();

	}

	/**
	 * Asks the client to insert a card first, prior
	 * to be allowed to withdraw any cash.
	 */
	@Override
	public void requestCash(int cash) {
		defaultMessage();
	}
	
	/**
	 * The default message returned by this NoCard state
	 * when any action besides inserting a card is invoked
	 * on its context. This message informs the client
	 * that a card must be inserted first prior to any other
	 * action. 
	 */
	private void defaultMessage() {
		System.out.println("Enter a card first");
	}
}