package firstTry;

public class AsteriskLogger implements Logger {
	// Step 4: Implement the AsteriskLogger methods
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String message) {
		System.out.println("******************\n***Error: " + message + "***\n******************");
	}
}
