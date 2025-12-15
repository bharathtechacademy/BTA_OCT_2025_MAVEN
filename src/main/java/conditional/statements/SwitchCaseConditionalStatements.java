package conditional.statements;

public class SwitchCaseConditionalStatements {
	
	//Example switch case Conditional statement
	
/*		switch(input) {
	
	case input1:
		Code to execute if input is equal to input1;
		break;
		
	case input2:
		Code to execute if input is equal to input2;
		break;
			
	case input3:
		Code to execute if input is equal to input3;
		break;
				
	default:
		Code to execute if input does not match any of the cases;
		break;*/

	public static void main(String[] args) {

		//Select the school dress based on the day.
//		- If it is Monday to Friday, regular school uniform.
//		- If it is Saturday, sports dress.
//		- If it is Sunday, color dress.

		String day = "";

		switch (day) {

		case "Monday":
			System.out.println("Regular School Uniform");
			break;
		case "Tuesday":
			System.out.println("Regular School Uniform");
			break;
		case "Wednesday":
			System.out.println("Regular School Uniform");
			break;
		case "Thursday":
			System.out.println("Regular School Uniform");
			break;
		case "Friday":
			System.out.println("Regular School Uniform");
			break;
		case "Saturday":
			System.out.println("Sports Dress");
			break; // break the flow
		case "Sunday":
			System.out.println("Color Dress");
			break;
		default:
			System.out.println("Invalid Day");
		}

	}

}
