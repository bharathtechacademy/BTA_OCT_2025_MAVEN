package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// 1. Launch the Chrome browser.
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\india\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Navigate to https://www.google.com		
		driver.get("https://www.google.com");
		
		// 3. Close the browser.
		driver.close();
	}

}
