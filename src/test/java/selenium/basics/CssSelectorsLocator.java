package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsLocator {
	
	//CSS Selectors: CSS selector is a pattern that is used to locate the element based on the CSS properties of elements.
	
	//Syntax 1 : tagName#id
	//Syntax 2 : tagName.className
	//Syntax 3 : tagName[attribute='value']
	//Syntax 4 : Advanced CSS Selectors with relationships ==> ancestor > parent > child		

	public static void main(String[] args) {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.google.co.in");
		
//		5: Locate the google search text box using 'cssSelector' locator (Syntax 1)
		driver.findElement(By.cssSelector("textarea#APjFqb"));
		
//		6: Locate the google search text box using 'cssSelector' locator (Syntax 2)
		driver.findElement(By.cssSelector("textarea.gLFyf"));
		
//		7: Locate the google search text box using 'cssSelector' locator (Syntax 3)
		driver.findElement(By.cssSelector("textarea[title='Search']"));
		
		


	}

}
