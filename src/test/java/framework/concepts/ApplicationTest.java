package framework.concepts;

public class ApplicationTest {

	public static void main(String[] args) {

		WebCommons web = new WebCommons();
		AppCommons app = new AppCommons();

		web.startReporting();

		// Test Case 1
		web.launchBrowserAndApplication("Chrome", "https://www.google.com/");
		app.loginIntoApplication("Bharath", "Bharath123");
		app.verifyApplicationHomePage();
		app.testCase1();
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 2
		web.launchBrowserAndApplication("Chrome", "https://www.google.com/");
		app.loginIntoApplication("Bharath", "Bharath123");
		app.verifyApplicationHomePage();
		app.testCase2();
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 3 -Valid Data
		web.launchBrowserAndApplication("Chrome", "https://www.google.com/");
		app.loginIntoApplication("Bharath", "Bharath123");
		app.verifyApplicationHomePage();
		app.testCase3("Valid Data");
		app.logoutFromApplication();
		web.closeBrowser();

		// Test Case 3 - Invalid Data
		web.launchBrowserAndApplication("Chrome", "https://www.google.com/");
		app.loginIntoApplication("Invalid-Name", "Invalid123");
		app.verifyApplicationHomePage();
		app.testCase3("In-valid Data");
		app.logoutFromApplication();
		web.closeBrowser();
		
		web.startReporting();

	}

}
