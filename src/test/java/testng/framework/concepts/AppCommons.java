package testng.framework.concepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AppCommons extends WebCommons{

	@BeforeMethod(dependsOnMethods = "launchBrowserAndApplication", alwaysRun = true)
	@Parameters({"APP_USER","APP_PWD"})
	public void loginIntoApplication(String username, String password) {
		System.out.println("Login process started for user: " + username);
		System.out.println("User logged in successfully with password: " + password);
	}

	@AfterMethod(alwaysRun = true)
	public void logoutFromApplication() {
		System.out.println("User logged out successfully.");
	}

	@AfterMethod(dependsOnMethods = "logoutFromApplication",alwaysRun = true)
	public void closeApplication() {
		System.out.println("Application is closed successfully.");
	}

	@BeforeMethod(dependsOnMethods = "loginIntoApplication",alwaysRun = true)
	public void verifyApplicationHomePage() {
		System.out.println("Application home page is verified successfully.");
	}
	
	
	@Test(priority=1,groups= {"Smoke","Regression"},enabled=true,retryAnalyzer = RetryTest.class)
	public void testCase1() {
		Assert.fail("Test Case 1 is Failed");
		System.out.println("Executing test case 1...");		
	}
	
	@Test(groups= {"Regression"})
	public void testCase2() {
		System.out.println("Executing test case 2...");
	}
	
	@Test(dataProvider = "test3Data", priority=-1,groups= {"Smoke","Regression","Sanity"})
	public void testCase3(String data1, String data2) {
		System.out.println("Executing test case 3 with data: " + data1 + ", " + data2);
		System.out.println("Test case 3 executed successfully.");
	}
	
	@Test(groups= {"Regression"},priority=-2, dependsOnMethods = {"testCase1","testCase2"})
	public void testCase4() {
		System.out.println("Executing test case 4...");
	}
	
	@Test(priority=2,invocationCount = 3)
	public void testCase5() {
		System.out.println("Executing test case 5...");
	}
	
	@Test(priority=3,timeOut = 3000)
	public void testCase6() throws InterruptedException {
		System.out.println("Executing test case 6...");
		Thread.sleep(4000);
		System.out.println("Test case 6 executed successfully.");
	}
}
