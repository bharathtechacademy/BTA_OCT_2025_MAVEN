package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {
	
	//WebElement: a web element is nothing but the element displayed in the UI, like a button, image, text box, etc. ==>WebElement
	//Locator : Selenium method to identify the location of a web element within the web page. ==> By
	
	//9 Types of Locators in Selenium:
	
	//1.id  ==> id attribute value of the element  ("APjFqb")
	//2.name  ==> name attribute value of the element ("q")
	//3.className  ==> class attribute value of the element ("gLFyf")
	//4.tagName ==> Html tag name of the element ("input")
	//5.linkText ==> text value of hyperlink element ("Gmail")
	//6.partialLinkText ==> partial text value of hyperlink element ("Gmail")
	
	//7.cssSelector
	//8.xpath
	
	//9.RelativeLocator (new in Selenium 4)


	public static void main(String[] args) {
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.google.co.in");
		
//		5: Locate the google search text box using 'id' locator
		driver.findElement(By.id("APjFqb"));
		
//		6: Locate the google search text box using 'name' locator
		driver.findElement(By.name("q"));
		
//		7: Locate the google search text box using 'className' locator
		driver.findElement(By.className("gLFyf"));
		
//		8: Locate the google search text box using 'tagName' locator
		driver.findElement(By.tagName("textarea"));
		
//		9: Locate the 'How Search Works' link using 'linkText' locator
		driver.findElement(By.linkText(" How Search works "));
		
//		10: Locate the 'How Search Works' link using 'partialLinkText' locator
		driver.findElement(By.partialLinkText("How Search"));

	}

}
