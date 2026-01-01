package testng.framework.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class WebCommons {
	
	@BeforeSuite(alwaysRun = true)
	public void startReporting() {
		System.out.println("Reporting process started.....");
	}
	
	@AfterSuite(alwaysRun = true)
	public void stopReporting() {
		System.out.println("Reporting process stopped and Report generated.....");
	}
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({"BROWSER","APP_URL"})
	public void launchBrowserAndApplication(String browser, String url) {
		System.out.println(browser+" is launched...");
		System.out.println(url+" is launched...");
	}
	
	@AfterMethod(dependsOnMethods = "closeApplication",alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed....");
		System.out.println("===================================");
	}
	
	@DataProvider(name="test3Data")
	public String [][] testData(){
		String data[][]= {
				{"Valid User","Valid123"},
				{"Invalid-Name","Invalid123"}
		};
		return data;
	}

}
