package conditional.statements;

public class IfElseConditionalStatements {

	public static void main(String[] args) {

		// Sample program to demonstrate if, else if and else statements
		int number = 15;

		if (number > 0) {
			System.out.println(number + " is a positive number.");
		} else if (number < 0) {
			System.out.println(number + " is a negative number.");
		} else {
			System.out.println("The number is zero.");
		}

		// Sample program to demonstrate nested if-else statements

		// main if-else
		boolean isPrabashMovieAvailable = true;
		boolean isMaheshMovieAvailable = false;
		boolean isVenkyMovieAvailable = false;

		// nested if else
		boolean isReclinersAvailable = false;
		boolean isBolconyAvailable = true;

		if (isPrabashMovieAvailable) {
			System.out.println("Watch Pranbas Movie");

			if (isReclinersAvailable) {
				System.out.println("Sit in Recliners");
			} else if (isBolconyAvailable) {
				System.out.println("Sit in Bolcony");
			} else {
				System.out.println("Sit in Normal Seat");
			}

		} else if (isMaheshMovieAvailable) {
			System.out.println("Watch Mahesh Movie");
		} else if (isVenkyMovieAvailable) {
			System.out.println("Watch Venky Movie");
		} else {
			System.out.println("Watch Web Series at Home");
		}

	}

}
