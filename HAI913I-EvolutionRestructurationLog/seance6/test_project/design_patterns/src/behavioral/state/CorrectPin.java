package behavioral.state;

/**
 * A CorrectPin concrete class playing the role of ConcreteState
 * in the State Design pattern.<br/>
 * A CorrectPin state designates the state of an ATMMachine when 
 * a correct PIN card is entered.
 * @author anonbnr
 */
public class CorrectPin extends ATMState {

	/* CONSTRUCTORS */
	/**
	 * Creates a CorrectPin state having context as its context.
	 * @param context The context of the CorrectPin state to create.
	 */
	public CorrectPin(ATMMachine context) {
		super(context);
	}

	/* METHODS */
	/**
	 * Informs the client that the ATMMachine cannot accept
	 * more than one card, since a card has already been inserted.
	 */
	@Override
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
	 * Informs the client that a PIN has already been entered.
	 */
	@Override
	public void insertPin(int pin) {
		System.out.println("Already entered PIN");

	}

	/**
	 * If the requested cash can be withdrawn from this state's
	 * machine, then the machine returns the cash back to the client,
	 * and updates its cash contents.
	 * Otherwise, it informs the client that there's not enough cash
	 * to complete the transaction. Afterwards, the card ejecting behavior
	 * is invoked on this state. Finally, if the machine has no more cash 
	 * in it, then the machine's state is set into a NoCash state.
	 */
	@Override
	public void requestCash(int cash) {
		if (cash > this.context.getCashInMachine())
			System.out.println("Not enough cash to complete this transaction");
		
		else {
			System.out.println(cash + " is provided by the machine");
			this.context.setCashInMachine(this.context.getCashInMachine() - cash);
		}
		
		this.ejectCard();
		
		if (this.context.getCashInMachine() <= 0)
			this.context.setATMState(this.context.getNoCashState());
	}
}