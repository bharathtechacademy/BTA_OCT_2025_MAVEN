package loops.statements;

public class JumpingStatements {
	
	//Jumping Statements: set of keywords used to jump from the current iteration to other iterations.
	
	//There are mainly three different jumping statements available:
	//1. break statement: used to terminate the current loop or switch statement and transfer execution to the statement immediately following the loop or switch.
	//2. continue statement: used to skip the current iteration of a loop and transfer execution to the beginning of the next iteration of the loop.
	//3. return statement: used to exit from a method and optionally return a value to the caller.

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {	
			
			if(i==5) {
				//break; //break the loop and come out of the flow
				continue; //skip the current iteration and move to next iteration
			}
			
			System.out.println(i);
		}

	}

}
