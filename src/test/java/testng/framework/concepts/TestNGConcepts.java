package testng.framework.concepts;

import org.testng.annotations.Test;

//Challenges with Basic Framework
//=========================
//1. Each and every test case can't run independently inside the main method. 
//2. Grouping the tests and run the specific group is not possible inside the main method. 
//3. Dependency test is not possible inside the main method. 
//4. Test prioritization is not possible inside the main method. 
//5. Disabling the test cases temporarily or permanently from the test execution is not possible in the main method. 
//6. We have prepared framework just to reduce the duplicate code, but now inside the main method, we are duplicating the methods by calling them again and again. 
//7. It is not supporting parallel execution currently. 
//8. There is no in-built parameterization, or there is no in-built reporting feature. 

public class TestNGConcepts {
	
	
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	
	

}
