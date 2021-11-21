package behavioral.template_method;

/**
 * a Football concrete class that plays the role of ConcreteClass
 * in the Template Method Design pattern.<br/>
 * It provides an concretion of how a football game must
 * be played by implementing the primitive operations declared
 * by Game and invoked in its template method.
 * @author anonbnr
 */
public class Football extends Game {
	/* METHODS */
	@Override
	protected void initialize() {
		System.out.println("Football game initialized! Start playing.");
	}

	@Override
	protected void start() {
		System.out.println("Football game started. Enjoy the game!");
	}

	@Override
	protected void end() {
		System.out.println("Football game finished!");
	}
}