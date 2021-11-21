package behavioral.template_method;

/**
 * a Basketball concrete class that plays the role of ConcreteClass
 * in the Template Method Design pattern.<br/>
 * It provides an concretion of how a basketball game must
 * be played by implementing the primitive operations declared
 * by Game and invoked in its template method.
 * @author anonbnr
 */
public class Basketball extends Game {
	/* METHODS */
	@Override
	protected void initialize() {
		System.out.println("Basketball game initialized! Start playing.");
	}

	@Override
	protected void start() {
		System.out.println("Basketball game started. Enjoy the game!");
	}

	@Override
	protected void end() {
		System.out.println("Basketball game finished!");
	}
}