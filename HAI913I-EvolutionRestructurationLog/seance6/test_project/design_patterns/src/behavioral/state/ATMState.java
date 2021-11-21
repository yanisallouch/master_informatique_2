package behavioral.state;

/**
 * an ATMState abstract class used to factor the
 * common structure and behavior of all ConcreteState classes.
 * @author anonbnr
 */
public abstract class ATMState implements IATMState {
	/* ATTRIBUTES */
	/**
	 * The state's context, designating an ATMMachine.
	 */
	protected ATMMachine context;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a ATMState having context as its context.
	 * @param context The context of the ATMState to create.
	 */
	public ATMState(ATMMachine context) {
		this.context = context;
	}
}