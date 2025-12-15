package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

	public static void main(String[] args) {
		
//		0.Add browser options like headless, incognito, disable notifications etc.
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		options.addArguments("--headless");
//		options.addArguments("--disable-notifications");
//		options.addArguments("--disable-popup-blocking");
		options.addArguments("--start-maximized");
		options.addArguments("--certificate-errors");
		
//		1. Launch the Browser window (Browser = Chrome)  
		WebDriver driver = new ChromeDriver(options);		
		
//		2. Maximize the browser window   
		driver.manage().window().maximize();
		
//		3. Enter URL and Launch the Application (https://www.google.co.in/)   		
		driver.get("https://www.google.co.in/");
		System.out.println("Title: " + driver.getTitle());
		
//		4. close the browser
		driver.quit();

	}

}
