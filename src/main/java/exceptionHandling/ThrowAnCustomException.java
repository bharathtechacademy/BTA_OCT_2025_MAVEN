package exceptionHandling;

public class ThrowAnCustomException {

	public static void main(String[] args) throws Exception {
		int age =17;

		if (age < 18) {
			System.out.println("Not Eligible to Vote");
		} else {
			System.out.println("Eligible to Vote");
		}

		System.out.println("Execution Completed");

	}

}
