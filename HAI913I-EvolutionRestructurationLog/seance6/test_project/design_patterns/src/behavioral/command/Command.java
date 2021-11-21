package behavioral.command;

/**
 * a Command interface that plays the role of Command in
 * the Command Design pattern.<br/>
 * It provides an interface for executing an action,
 * as well as undoing it.
 * @author anonbnr
 */
public interface Command {
	/* METHODS */
	/**
	 * Executes this Command's action.
	 */
	void execute();
	
	/**
	 * Undoes this Command's action.
	 */
	void undo();
	
	/**
	 * Gets this Command's name.
	 * @return
	 */
	String getName();
}