package loops.statements;

public class WhileLoop {
	
	//2. While Loop ==> When we don't know the total number of iterations to be executed before itself and we need to check the condition first before executing the statements.

	//syntax:
	
	//while(condition) {
		// statements
		// condition to break the loop
	// }

	public static void main(String[] args) {

		// Press the page until the page is getting displayed.

		int i = 1;

		while (i > 0) {
			
			boolean isPageDisplayed = false;
			
			if (isPageDisplayed || i<=5) { //condition to break the loop
				break; //break the loop
			}		
			System.out.println("Refresh the Page");
			i++;
		}

	}

}
