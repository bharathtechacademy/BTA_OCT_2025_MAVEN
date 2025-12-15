package language.basics;

public class CommentsInJava {

	// 1. Single-line comments. ==> // --> Cntrl+/ (comment/uncomment)
	// 2. Multi-line comments. ==> /*...*/ --> Cntrl+Shift+/  (comment) ,  Cntrl+Shift+\ (uncomment)
	// 3. Documentation comments. ==> /**...*/ --> Alt+Shift +J

	/**
	 * The main entry point for the Java application. This method serves as the program's
	 * execution starting point when the class is run directly from the command line or IDE.
	 * 
	 * <p>The main method is a special method in Java that is recognized by the Java Virtual Machine (JVM)
	 * as the starting point of program execution. When you run a Java application, the JVM automatically
	 * looks for and invokes this method.</p>
	 * 
	 * <p><strong>Method Signature Requirements:</strong></p>
	 * <ul>
	 *   <li>Must be declared as {@code public} - accessible from anywhere</li>
	 *   <li>Must be declared as {@code static} - can be called without creating an instance of the class</li>
	 *   <li>Must be declared as {@code void} - does not return any value</li>
	 *   <li>Must be named exactly {@code main}</li>
	 *   <li>Must accept a single parameter of type {@code String[]} - command-line arguments</li>
	 * </ul>
	 * 
	 * <p><strong>Return Type:</strong> {@code void} - This method does not return any value.
	 * It executes the program logic and terminates when complete.</p>
	 * 
	 * <p><strong>Parameters:</strong></p>
	 * <ul>
	 *   <li>{@code args} - An array of String objects containing command-line arguments passed
	 *       to the program during execution. Each argument is separated by spaces when provided
	 *       from the command line (e.g., {@code java HelloWorld arg1 arg2 arg3}).</li>
	 * </ul>
	 * 
	 * <p><strong>Usage Example:</strong></p>
	 * <pre>{@code
	 * // Run from command line:
	 * java HelloWorld
	 * 
	 * // Output:
	 * // Hello, World!
	 * }</pre>
	 * 
	 * <p><strong>Purpose:</strong> This main method demonstrates the most basic Java program.
	 * It prints the classic "Hello, World!" message to the standard output (console) using
	 * the {@link System#out} print stream.</p>
	 * 
	 * <p><strong>Note:</strong> This is typically the first program written when learning Java,
	 * as it demonstrates the minimal structure required for a runnable Java application.</p>
	 * 
	 * @param args Command-line arguments array. Not used in this simple example, but required
	 *             by the JVM to recognize this as a valid main method entry point.
	 * 
	 * @author Bharath Reddy
	 * @version 1.0
	 * @since 2020
	 * 
	 * @see java.lang.System#out
	 * @see java.io.PrintStream#println(String)
     * {@link String} → Shows hyperlink with class name  
     * {@linkplain Integer} → Same link, but displays plain text
     * @link https://docs.oracle.com/javase/ (External link)
     * 
     * 6. SNIPPET USING REGIONS (Advanced)
     *
     * {@snippet lang="java" region="calc"}
     * ----
     * // @start region=calc
     * int x = 100;
     * int y = 50;
     * System.out.println(x - y);
     * // @end region=calc
     * 
     * This method converts 😊 to bytes.
	 */
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		

//		/*
//		 * This line refers to the main method. This is always going to act like a
//		 * starting point for Java execution. If there is no main method, we cannot
//		 * execute any program. So, whenever you want to run some program, first you
//		 * need to create a main method. Then, we need to write all the instructions
//		 * inside the main method only.
//		 */

	}

}
