package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {
	
	//Thread.sleep vs Selenium Waits
	//1. Thread.sleep is a Java method that pauses the execution of the current thread for a specified amount of time. 
	//2. Selenium Waits are dynamic waits that allow you to wait for certain conditions to be met before proceeding with the next step in your test script.
				
	// 3 Types of Selenium Waits
	
	//1. Implicit Wait: It is a global wait that is applied to all elements in the WebDriver instance.
	//2. Explicit Wait: It is a conditional wait that is applied to a specific element or condition.
	//3. Fluent Wait: It is a more advanced version of Explicit Wait that allows you to specify the polling frequency and ignore specific exceptions while waiting.
	
	public static void main(String[] args) {
//		1. Launch the Chrome browser window		
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window		
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL "https://parabank.parasoft.com/parabank" and Launch the application		
		driver.get("https://parabank.parasoft.com/parabank");
		
		//implicit wait example
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//maximum wait time is 10 seconds
		
//		6. Verify application logo 
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//maximum wait time is 10 seconds
		wait.until(ExpectedConditions.visibilityOf(logo));//wait until logo is visible
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//img[@class='logo']"), 0));//wait until number of logo elements is more than 0
		wait.until(ExpectedConditions.alertIsPresent());//wait until alert is present		
		
		//fluent wait example
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30)) //maximum wait time is 30 seconds
				.pollingEvery(Duration.ofSeconds(5)); //check for the condition every 5 seconds
		fluentWait.until(ExpectedConditions.visibilityOf(logo));//wait until logo is visible
	}

}
