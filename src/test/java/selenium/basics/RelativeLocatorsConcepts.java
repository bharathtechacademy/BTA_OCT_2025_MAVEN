package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsConcepts {
	
	// Syntax: RelativeLocator.with(targetElement).direction(referenceElement);
	
	//above, below, toLeftOf, toRightOf, near
	
	//target : //a[text()='Services']
	//reference: About Us

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Parabank homepage
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
			
//		5: Locate the 'Services' using 'Relative' locator 
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Services']")).below(By.linkText("About Us")));
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Services']")).above(By.linkText("Products")));
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Services']")).near(By.className("logo")));

//		5: Locate the 'Services' at bottom using 'Relative' locator
		driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Services']")).toRightOf(By.linkText("About Us")));

	}

}
