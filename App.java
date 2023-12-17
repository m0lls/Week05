package firstTry;

public class App {
	 public static void main(String[] args) {
	     // Step 6a: Instantiate instances of the logger classes
	     Logger asteriskLogger = new AsteriskLogger();
	     Logger spacedLogger = new SpacedLogger();

	     // Step 6b: Test both methods on both instances
	     asteriskLogger.log("Hello");
	     asteriskLogger.error("Hello");

	     spacedLogger.log("Hello");
	     spacedLogger.error("Hello");
	 }
}