package behavioral.state;

/**
 * An IATMState interface playing the role of State
 * in the State Design pattern.<br/>
 * an IATMState defines the state-dependent
 * behavior of its context (designating an ATMMachine), 
 * namely how the state affects what happens to it when:
 * 		<ol>
 * 		<li>a client inserts a card into it</li>
 * 		<li>the ATMMachine ejects a card back into a client</li>
 * 		<li>a client inserts a PIN</li>
 * 		<li>a client requests cash</li>
 * 		</ol>
 * @author anonbnr
 * @see ATMMachine
 */
public interface IATMState {
	/* METHODS */
	/**
	 * The state-dependent behavior exerted by an IATMState
	 * when a client inserts a card into an ATMMachine.
	 */
	void insertCard();
	
	/**
	 * The state-dependent behavior exerted by an IATMState
	 * when an ATMMachine ejects a card back into a client.
	 */
	void ejectCard();
	
	/**
	 * The state-dependent behavior exerted by an IATMState
	 * when a client inserts a card PIN.
	 * @param pin The card PIN inserted by a client.
	 */
	void insertPin(int pin);
	
	/**
	 * The state-dependent behavior exerted by an IATMState
	 * when a client requests cash from an ATMMachine.
	 * @param cash The amount of cash requested by a client.
	 */
	void requestCash(int cash);
}