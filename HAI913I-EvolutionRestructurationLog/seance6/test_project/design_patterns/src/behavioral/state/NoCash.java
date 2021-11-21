package behavioral.state;

/**
 * A NoCash concrete class playing the role of ConcreteState
 * in the State Design pattern.<br/>
 * A NoCash state designates the state of an ATMMachine when 
 * it has no cash in it.
 * @author anonbnr
 */
public class NoCash extends ATMState {
	
	/* CONSTRUCTORS */
	/**
	 * Creates a NoCash state having context as its context.
	 * @param context The context of the NoCash state to create.
	 */
	public NoCash(ATMMachine context) {
		super(context);
	}

	/* METHODS */
	/**
	 * Informs the client that there's no cash in this state's
	 * machine.
	 */
	@Override
	public void insertCard() {
		defaultMessage();
	}

	/**
	 * Informs the client that there's no cash in this state's
	 * machine.
	 */
	@Override
	public void ejectCard() {
		defaultMessage();
	}

	/**
	 * Informs the client that there's no cash in this state's
	 * machine.
	 */
	@Override
	public void insertPin(int pin) {
		defaultMessage();
	}

	/**
	 * Informs the client that there's no cash in this state's
	 * machine.
	 */
	@Override
	public void requestCash(int cash) {
		defaultMessage();
	}
	
	/**
	 * The default message returned by this NoCash state
	 * when any action is invoked on its context. 
	 * This message informs the client that there's no cash
	 * in the machine.
	 */
	private void defaultMessage() {
		System.out.println("No cash in the machine");
	}
}