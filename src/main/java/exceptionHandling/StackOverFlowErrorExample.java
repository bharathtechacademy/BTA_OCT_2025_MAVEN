package exceptionHandling;

public class StackOverFlowErrorExample {
	
	
	public static void printName() {
		printName();
	}

	public static void main(String[] args) {
		printName();
	}

}
