package keywords;

public class FinalKeywords {
	
	// final vs finally vs finalize
	
	int age = 30;

	public static void main(String[] args) {
		
		//final keyword : final is a non-access modifier. We are going to use BEFORE class, BEFORE method and variable to make it constant.
		final int MAX_VALUE = 100;
		// MAX_VALUE = 200; // This will cause a compilation error
		
		//finally : it is a block to maintain mandatory code to execute. Always when we are using try-catch exception handling mechanism. 
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		} finally {
			System.out.println("This block always executes.");
		}
		
		//finalize : it is a method used to perform cleanup operations before an object is garbage collected.
		FinalKeywords obj = new FinalKeywords();
		obj = null; // Make the object eligible for garbage collection
		System.gc(); // Suggest the JVM to run garbage collection
		
		
		
	}

}
