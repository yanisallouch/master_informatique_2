package behavioral.state;

/**
 * A HasCard concrete class playing the role of ConcreteState
 * in the State Design pattern.<br/>
 * A HasCard state designates the state of an ATMMachine when 
 * it has a card inserted into it.
 * @author anonbnr
 */
public class HasCard extends ATMState {
	/* CONSTRUCTORS */
	/**
	 * Creates a HasCard state having context as its context.
	 * @param context The context of the HasCard state to create.
	 */
	public HasCard(ATMMachine context) {
		super(context);
	}
	
	/* METHODS */
	@Override
	/**
	 * Informs the client that the ATMMachine cannot accept
	 * more than one card, since a card has already been inserted.
	 */
	public void insertCard() {
		System.out.println("You can't insert more than one card");
	}

	/**
	 * Ejects the inserted card and set its context's state 
	 * into a NoCard state.
	 */
	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		this.context.setATMState(this.context.getNoCardState());
	}

	/**
	 * Checks if the entered PIN is correct, if so it informs 
	 * the client that its entered PIN is correct, and sets
	 * its context's state into a CorrectPin state. Otherwise,
	 * it informs the client that its entered PIN is incorrect,
	 * and invokes the card card ejecting behavior on this state.
	 */
	@Override
	public void insertPin(int pin) {
		if (pin == 1234) {
			System.out.println("Correct PIN");
			this.context.setATMState(this.context.getCorrectPinState());
		}
		
		else {
			System.out.println("Wrong PIN");
			this.ejectCard();
		}
	}

	/**
	 * Asks the client to enter a PIN of the inserted card first, 
	 * prior to be allowed to request any cash from the ATMMachine.
	 */
	@Override
	public void requestCash(int cash) {
		System.out.println("Enter PIN First");
	}
}