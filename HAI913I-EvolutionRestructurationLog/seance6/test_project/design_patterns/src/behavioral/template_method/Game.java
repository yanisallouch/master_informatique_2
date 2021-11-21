package behavioral.template_method;

/**
 * a Game abstract class that plays the role of AbstractClass
 * in the Template Method Design pattern.<br/>
 * It provides an interface consisting of a template method 
 * specifying the order by which a game must be played, as well
 * as primitive operations that must be overridden by subclasses
 * to implement subclass-specific steps of the gameplay process.
 * @author anonbnr
 */
public abstract class Game {
	/* METHODS */
	/**
	 * A template method that dictates how a game must
	 * be played. Namely, a game must be initialized,
	 * started, and finally ended.
	 */
	public final void play() {
		
		// initialize the game
		initialize();
		
		// start the game
		start();
		
		// end the game
		end();
	}
	
	/**
	 * Initializes the game.
	 */
	protected abstract void initialize();
	
	/**
	 * Starts the game.
	 */
	protected abstract void start();
	
	/**
	 * Ends the game.
	 */
	protected abstract void end();
}