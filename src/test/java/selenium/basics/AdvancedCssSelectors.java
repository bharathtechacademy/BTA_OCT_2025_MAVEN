package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssSelectors {
	
	//Syntax 4 : Advanced CSS Selectors with relationships ==> ancestor > parent > child		
	
	
	// child -->  parent --> ancestor --> ancestor's parent
	
	
	// ancestor :  ul[class='leftmenu']  --> unique
	// parent : li  --> duplicate
	// child : a[href='services.htm'] --> duplicate
	
	//ul[class='leftmenu'] > li > a[href='services.htm']

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Parabank Home Page
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5: Locate the 'Services' Hyperlink using 'cssSelector' locator (Syntax 4)
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li > a[href='services.htm']"));

	}

}
