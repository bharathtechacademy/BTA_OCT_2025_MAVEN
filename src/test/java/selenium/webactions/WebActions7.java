package selenium.webactions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions7 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1.Launch Chrome Browser  
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window   
		driver.manage().window().maximize();
		
		//start reporting
		Reports.setupReport();
		
//		3.Launch the application  ( https://demoqa.com/alerts )   
		driver.get("https://demoqa.com/alerts");
		
//		4.Locate Alert buttons  		
		WebElement infoAlertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement promptButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		// Start collecting Test Case results
		Reports.startReporting("Info Alerts in Selenium");
		
//		5.Launch Information alert   		
		infoAlertButton.click();
		Reports.logMessage("info", "Information Alert button clicked.");
		
		//wait for the alert to be present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Reports.logMessage("pass", "Alert is successfully displayed.");
		
		//switch to alert and save it in a variable
		Alert infoAlert = driver.switchTo().alert();
		Reports.logMessage("info", "Switched to Information Alert.");
		
//		6.Print Alert message   		
		System.out.println("Information Alert Message: " + infoAlert.getText());
		Reports.logMessage("info", "Information Alert message printed, Message: " + infoAlert.getText());
		
//		7.Click on OK button		
		infoAlert.accept();
		Reports.logMessage("pass", "Clicked on OK button of Information Alert.");
		Reports.attachScreenshot(getWindowScreenshot(driver, "InfoAlertScreenshot"));
		Reports.endReport();
		
		//Start new Test Case for Confirmation Alert
		Reports.startReporting("Confirmation Alerts in Selenium");
		
//		8.Launch confirmation alert		
		confirmButton.click();
		Reports.logMessage("info", "Confirmation Alert button clicked.");
		
		//wait for the alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		Reports.logMessage("pass", "Confirmation Alert is successfully displayed.");
		
		//switch to alert and save it in a variable
		Alert confirmAlert = driver.switchTo().alert();
		Reports.logMessage("info", "Switched to Confirmation Alert.");
		
//		9.Print Alert message        
		System.out.println("Confirmation Alert Message: " + confirmAlert.getText());
		Reports.logMessage("info", "Confirmation Alert message printed, Message: " + confirmAlert.getText());
		
//		10.Click on Cancel button  
		confirmAlert.dismiss();
		Reports.logMessage("pass", "Clicked on Cancel button of Confirmation Alert.");
		Reports.attachScreenshot(getWindowScreenshot(driver, "ConfirmAlertScreenshot"));
		Reports.endReport();
		
		//Start new Test Case for Prompt Alert
		Reports.startReporting("Prompt Alerts in Selenium");
		
//		11.Launch prompt alert with dialog box alert
		promptButton.click();
		Reports.logMessage("info", "Prompt Alert button clicked.");
		
		//wait for the alert to be present
		wait.until(ExpectedConditions.alertIsPresent());
		Reports.logMessage("pass", "Prompt Alert is successfully displayed.");
		
		//switch to alert and save it in a variable
		Alert promptAlert = driver.switchTo().alert();
		Reports.logMessage("info", "Switched to Prompt Alert.");
		
//		12.Print message
		System.out.println("Prompt Alert Message: " + promptAlert.getText());
		Reports.logMessage("info", "Prompt Alert message printed, Message: " + promptAlert.getText());

//		13.Enter Text in Alert        
		promptAlert.sendKeys("Selenium Automation");
		Reports.logMessage("info", "Text entered in Prompt Alert: Selenium Automation");
		
//		14.Click on OK button		
		promptAlert.accept();
		Reports.logMessage("pass", "Clicked on OK button of Prompt Alert.");
		Reports.attachScreenshot(getWindowScreenshot(driver, "PromptAlertScreenshot"));
		Reports.endReport();
		
//		15.Close browser window
		driver.quit();

	}
	
//		Common method to capture the screenshot of entire browser window.
	public static String getWindowScreenshot(WebDriver driver, String screenshotName) {
		String filePath = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		try {
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filePath;
	}

//		Common Method to Capture screenshot of web element.
	public static String getElementScreenshot(WebElement element, String screenshotName) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + ".png";
		try {
			File screenshotFile = element.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filePath;
	}

}
