package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//XPATH Locators: XPath is a language used to locate elements on a web page using their XML path.
	
	// 2 Types of XPATH:
	
	// 1: Absolute XPATH: It defines the complete path from the root element to the desired element. It starts with a single forward slash (/).
	// Example: /html/body/div[1]/div[2]/ul[1]/li[3]/a
	
	// 2: Relative XPATH: It starts with a double forward slash (//).
	// Example: //input[@id='searchBox']
	
	// Syntax of RELATIVE XPATH:
	
	/*************************BASIC - LEVEL 1*************************/
	//Syntax 1: //tagName[@attribute='value']
	//Syntax 2: //tagName[text()='value']
	
	/********LEVEL 2 -partial values with contains, starts-with ******/
	//Syntax 3: //tagName[contains(@attribute,'partialValue')]
	//Syntax 4: //tagName[starts-with(@attribute,'startingValue')]
	
	//Syntax 5: //tagName[contains(text(),'partialTextValue')]
	//Syntax 6: //tagName[starts-with(text(),'startingTextValue')]
	
	/********LEVEL 3 - combine multiple attribute and text values to locate (and) ******/
	//Syntax 7: //tagName[@attribute1='value' and @attribute2='value' and text()='value']
	
	

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Parabank homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5: Locate the 'Parabank Logo' using 'XPATH' locator (Syntax 1)
		driver.findElement(By.xpath("//img[@class='logo']"));
		
//		6: Locate the 'Parabank Caption' using 'XPATH' locator (Syntax 2)
		driver.findElement(By.xpath("//p[text()='Experience the difference']"));
		
//		7: Locate the 'Parabank Logo' using 'XPATH' locator (Syntax 3)
		driver.findElement(By.xpath("//img[contains(@src,'logo')]"));		
		
//		8: Locate the 'Parabank Logo' using 'XPATH' locator (Syntax 4)
		driver.findElement(By.xpath("//img[starts-with(@src,'images/logo')]"));	
		
//		9: Locate the 'Parabank Caption' using 'XPATH' locator (Syntax 5)
		driver.findElement(By.xpath("//p[contains(text(),'difference')]"));
		
//		10: Locate the 'Parabank Caption' using 'XPATH' locator (Syntax 6)
		driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		11: Locate the 'Parabank Logo' using 'XPATH' locator (Syntax 7)
		driver.findElement(By.xpath("//img[@alt='ParaBank' and @class='logo' and @title='ParaBank']"));	
		
//		12: Locate the 'Parabank Caption' using 'XPATH' locator (Syntax 7)
		driver.findElement(By.xpath("//p[@class='caption' and text()='Experience the difference']"));
		

	}

}
