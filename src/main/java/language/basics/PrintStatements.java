package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Print the information and go to the next line.
		System.out.println("Hello, World !");
		
		//Print the information and stay on the same line.
		System.out.print("Hello,");
		System.out.print(" World !");
		System.out.println();
		
		 //Multi-line string printing (Java 15+ Text Block)
        String message = """
                7) This is a multiline text block.
                Line 1
                Line 2
                Line 3
                """;
        System.out.println(message);
		
		//Print the formatted content and stay on the same line.
		System.out.println("Anusha is completed B.Tech, and employee ID is 1234. Her visa status is true.");
		System.out.println("Mayuri is completed B.Tech, and employee ID is 1235. Her visa status is false.");
		System.out.println("Benoy is completed B.Tech, and employee ID is 1236. Her visa status is true.");
		//%s refers to string or text value.
		//%d refers to digit or number.
		//%f refers to decimal point, number with decimals.
		//%b refers to a Boolean value, true or false.
		System.out.printf("%s is completed B.Tech, and employee ID is %d. Her visa status is %b.","Anusha",1234,true);
		System.out.println();
		
		 //Printing formatted decimal values(round off to certain decimal places)
        double price = 199.49789;
        System.out.printf("Price: %.2f", price);  // 2 decimal places
        System.out.println();
		
		//Print error messages within the Java.
		System.out.println();
		System.err.println("There is an error in line number 27.");
		System.out.println();
		
		//Print the logs.
		Logger logger = Logger.getLogger("Hello World");
		logger.info("There is an information within line number 35. Program is going well.");
		System.out.println();
		logger.warning("Hey Bharath, there is a warning. I think something is going wrong in line number 37.");
		System.out.println();
		
		//Print and export the logs into a text file.
		PrintWriter log = new PrintWriter("C:\\Training\\Oct_2025_8AM\\AutomationTraining\\JavaTraining\\HelloWorld.txt");
		log.println("Currently, line number 42 is executed successfully.");
		log.println("Currently, line number 43 is executed successfully.");
		log.println("Program is successfully completed without any issues.");
		log.close();		
		
		
		
	}

}
