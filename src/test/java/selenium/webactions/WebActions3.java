package selenium.webactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions3 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1.Launch Chrome Browser  
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window   
		driver.manage().window().maximize();
		
//		3.Launch the application  ( https://demoqa.com/alerts )   
		driver.get("https://demoqa.com/alerts");
		
//		4.Locate Alert buttons  		
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
//		5.Launch Information alert   		
		infoAlertButton.click();
		
		//wait for the alert to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		//switch to alert and save it in a variable
		Alert infoAlert = driver.switchTo().alert();
		
//		6.Print Alert message   		
		System.out.println("Information Alert Message: " + infoAlert.getText());
		
//		7.Click on OK button		
		infoAlert.accept();
		
//		8.Launch confirmation alert		
		confirmButton.click();
		
		//wait for the alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		
		//switch to alert and save it in a variable
		Alert confirmAlert = driver.switchTo().alert();
		
//		9.Print Alert message        
		System.out.println("Confirmation Alert Message: " + confirmAlert.getText());
		
//		10.Click on Cancel button  
		confirmAlert.dismiss();
		
//		11.Launch prompt alert with dialog box alert
		promptButton.click();
		
		//wait for the alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		
		//switch to alert and save it in a variable
		Alert promptAlert = driver.switchTo().alert();
		
//		12.Print message
		System.out.println("Prompt Alert Message: " + promptAlert.getText());

//		13.Enter Text in Alert        
		promptAlert.sendKeys("Selenium Automation");
		
//		14.Click on OK button		
		promptAlert.accept();
		
//		15.Close browser window
		driver.quit();

	}

}
