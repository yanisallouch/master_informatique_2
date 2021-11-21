package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import creational.singleton.Singleton;

/**
 * a CommandManager that plays the role of Invoker in the Command
 * Design pattern.<br/>
 * It's a singleton class that provides an interface to 
 * executing, undoing, and redoing commands.
 * @author anonbnr
 * @see Command
 */
public class CommandManager extends Singleton {
	
	/* ATTRIBUTES */
	/**
	 * This command manager's stack of commands that can be
	 * undone.
	 */
	private Stack<Command> undoStack = new Stack<>();
	
	/**
	 * This command manager's stack of commands that can be
	 * redone.
	 */
	private Stack<Command> redoStack = new Stack<>();
	
	/**
	 * This command manager's history of executed, undone, and
	 * redone commands.
	 */
	private List<String> history = new ArrayList<>();
	
	/* METHODS */
	/**
	 * Displays this command manager's history of executed,
	 * undone, and redone commands.
	 */
	public void history() {
		history.forEach(System.out::println);
	}
	
	/**
	 * Executes command, then stores it in the undo stack 
	 * and the history list.
	 * @param command The command to execute.
	 */
	public void execute(Command command) {
		command.execute();
		undoStack.push(command);
		history.add(command.getName());
	}
	
	/**
	 * Undoes the last executed command (if it exists), 
	 * then pushes it into the redone stack and the history list. 
	 */
	public void undo() {
		Optional<Command> command = Optional.of(undoStack.pop());
		command.ifPresent(aCommand -> {
			aCommand.undo();
			redoStack.push(aCommand);
			history.add(aCommand.getName() + " (undo)");
		});
	}
	
	/**
	 * Redoes the last undone command (if its exists),
	 * then pushes it into the undone stack and the history list.
	 */
	public void redo() {
		Optional<Command> command = Optional.of(redoStack.pop());
		command.ifPresent(aCommand -> {
			aCommand.execute();
			undoStack.push(aCommand);
			history.add(aCommand.getName() + " (redo)");
		});
	}
}