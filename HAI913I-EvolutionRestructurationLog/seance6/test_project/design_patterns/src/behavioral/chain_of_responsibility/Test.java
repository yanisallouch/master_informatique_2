package behavioral.chain_of_responsibility;

/**
 * a Test class for the Chain of Responsibility Design pattern.
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		ILogger chain = getChainOfLoggers();
		
		chain.log(new LogRequest("This is a standard information", 
				StandardLogRequestLevel.INFO));
		
		chain.log(new LogRequest("This is a debug level information", 
				StandardLogRequestLevel.DEBUG));
		
		chain.log(new LogRequest("This is an error level information", 
				StandardLogRequestLevel.ERROR));
	}

	/**
	 * Creates a chain of loggers to handle log requests.
	 * @return The first logger in the chain of loggers.
	 */
	private static ILogger getChainOfLoggers() {
		ILogger errorLogger = new ErrorLogger(StandardLogRequestLevel.ERROR);
		ILogger fileLogger = new FileLogger(StandardLogRequestLevel.DEBUG);
		ILogger consoleLogger = new ConsoleLogger(StandardLogRequestLevel.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
	}
}