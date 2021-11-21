package behavioral.command;

/**
 * a Test class for the Command Design pattern.
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		CommandManager manager = (CommandManager) 
				CommandManager.getInstance(CommandManager.class);
		
		TV tv = new TV();
		manager.execute(new SwitchOnCommand(tv));
		manager.undo();
		manager.redo();
		manager.execute(new SwitchOffCommand(tv));
		manager.undo();
		manager.redo();
		
		manager.execute(new SwitchOnCommand(tv));
		manager.execute(new SwitchChannelCommand(tv, 1));
		manager.execute(new SwitchChannelCommand(tv, 2));
		manager.execute(new SwitchChannelCommand(tv, 3));
		manager.undo();
		manager.undo();
		manager.redo();
		
		manager.history();
	}
}