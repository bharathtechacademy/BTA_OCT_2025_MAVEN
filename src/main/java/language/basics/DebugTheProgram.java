package language.basics;

public class DebugTheProgram {

	public static void main(String[] args) {		
		int i =1;
		System.out.println("Step 1: Program starts");
        System.out.println("Step 2: Preparing to execute next step");
        System.out.println("Step 3: Performing calculations");
        int j = i + 1;
        System.out.println(i / j);
        System.out.println("Step 5: Program execution completed");
	}
	
	//When an error comes in a Java program
	
	//The first line of the error is always going to give you the information about the error and the documentation location.
	//The last line of the error is going to give you the location of the error that occurred in your program.
}
