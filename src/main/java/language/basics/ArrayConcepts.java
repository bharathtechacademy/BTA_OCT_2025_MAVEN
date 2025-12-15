package language.basics;

public class ArrayConcepts {

	public static void main(String[] args) {

		String emp1Name = "Anusha";
		int emp1Id = 1;

		String emp2Name = "bharath Reddy";
		int emp2Id = 2;

		String emp3Name = "Archana";
		int emp3Id = 3;

		// 3D Array

		// Two organizations. In each organization, three projects. In each project,
		// four employees are working.

		// Company 1 (0)
//	(0)	//Project 1: John(0), Smith(1), David(2), Peter(3)
//	(1)	//Project 2:Linda, Alice, Bob, Charlie
//	(2)	//Project 3: Tom, Jerry, Harry, Ron

		// Company 2 (1)
//	(0)	//Project 1: Sam(0), Max(1), Leo(2), Jack(3)
//	(1)	//Project 2: Mia, Zoe, Ava, Eva
//	(2)	//Project 3: Kim, Lee, Jay, Kay

		String[][][] empData = new String[2][3][4];

		empData[0][1][3] = "Charlie";
		empData[0][2][1] = "Jerry";
		empData[1][2][1] = "Lee";
		empData[1][0][0] = "Sam";
		
		
		System.out.println(empData[1][2][1]);

	}

}
