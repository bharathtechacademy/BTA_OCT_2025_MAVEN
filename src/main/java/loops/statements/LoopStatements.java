package loops.statements;

public class LoopStatements {
	
	//LoopStatements ==> Loop the statements ==> Execute the statements again and again based on the conditions.
	
	//Types of Loop Statements:
	//1. For Loop ==> When we know the total number of iterations to be executed before itself.
	//2. While Loop ==> When we don't know the total number of iterations to be executed before itself and we need to check the condition first before executing the statements.

	public static void main(String[] args) {
		
		//Before loops 
		
		//If we need to print name "John" 5 times
		System.out.println("John");
		System.out.println("John");
		System.out.println("John");
		System.out.println("John");
		System.out.println("John");
		
		//Using For Loop
		
		for(int i=1; i<=5; i++) {
			System.out.println("John");
		}

	}

}
