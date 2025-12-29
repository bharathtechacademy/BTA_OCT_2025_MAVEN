package framework.concepts;

import org.testng.Assert;

public class AppCommons {

	public void loginIntoApplication(String username, String password) {
		System.out.println("Login process started for user: " + username);
		System.out.println("User logged in successfully with password: " + password);
	}

	public void logoutFromApplication() {
		System.out.println("User logged out successfully.");
	}

	public void closeApplication() {
		System.out.println("Application is closed successfully.");
	}

	public void verifyApplicationHomePage() {
		System.out.println("Application home page is verified successfully.");
	}
	
	
	
	public void testCase1() {
		Assert.fail("Test Case 1 is Failed");
		System.out.println("Executing test case 1...");		
	}
	
	public void testCase2() {
		System.out.println("Executing test case 2...");
	}
	
	public void testCase3(String data) {
		System.out.println("Executing test case 3 with data: " + data);
		System.out.println("Test case 3 executed successfully.");}
}
