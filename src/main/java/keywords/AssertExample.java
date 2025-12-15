package keywords;

public class AssertExample {
	
	//assert : assert is a keyword we are going to use to implement assertions in Java.
	//Assertions will be used to compare the expected result versus the actual result, basically.

	public static void main(String[] args) {
		
		int age = 17;
		
		assert age >= 18 : "Age is not valid to vote";

		System.out.println("You are eligible to vote.");
		

	}

}
