package firstTry;

class SpacedLogger implements Logger {
	// Step 5: Implement the SpacedLogger methods
	@Override
	public void log(String message) {
		for (char c : message.toCharArray()) {
			System.out.print(c + " ");
		}
		System.out.println();
		}
	
		@Override
		public void error(String message) {
			System.out.print("ERROR: ");
			for (char c : message.toCharArray()) {
				System.out.print(c + " ");
			}
			System.out.println();
	}
}