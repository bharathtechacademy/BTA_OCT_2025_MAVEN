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

public class WebActions4 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1.Launch Chrome Browser      
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window    		
		driver.manage().window().maximize();
		
//		3.Launch the application    (https://demoqa.com/frames)
		driver.get("https://demoqa.com/frames");
		
//		4.Locate elements 'Frames' header in main window and 'This is a sample page' inside the frame    
		WebElement mainHeader = driver.findElement(By.xpath("//h1[text()='Frames']"));
		
		// Switch to frame
		driver.switchTo().frame("frame1");
		
		// Locate element inside the frame
		WebElement frameHeader = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
//		5.Print frame element text          
		System.out.println("Frame Header Text: " + frameHeader.getText());
		
		// Switch back to main window
		driver.switchTo().defaultContent();
		
//		6.Print main window element text  
		System.out.println("Main Header Text: " + mainHeader.getText());
		
//		copy text from frame 2
		driver.switchTo().frame("frame2");
		
//		Print frame 2 element text          
		WebElement frame2Header = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("Frame 2 Header Text: " + frame2Header.getText());	
		
//		Switch back to main window
		driver.switchTo().defaultContent();		
		
//		7.Close browser window
		driver.quit();

	}

}
