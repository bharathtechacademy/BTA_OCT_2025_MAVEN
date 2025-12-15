package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {
		
		String [] empNames = new String[3]; // This can hold 3 employee names.
	
		try {
			empNames[0] = "Bharath";
			empNames[1] = "ABC";
			empNames[2] = "Bharath";
			empNames[3] = "Shanmukh";
		} catch (Exception e) {
			System.out.println("Array Index is Exceeded. Please provide the valid index.");			
		} finally { // finally block will be executed always, irrespective of exception occurred or not.
			System.out.println("Execution Completed Successfully.");
		}
		
		
	}

}
