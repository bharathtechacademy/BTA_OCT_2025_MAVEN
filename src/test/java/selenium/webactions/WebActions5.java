package selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebActions5 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1.Launch Chrome Browser      
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window    		
		driver.manage().window().maximize();
		
//		3.Launch the application    (https://books-pwakit.appspot.com/)
		driver.get("https://books-pwakit.appspot.com/");
		
//		4.Locate the shadow-host element (the element which hosts the shadow DOM)
		WebElement shadowHost = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']"));
		
//		5. Get the shadow root		
		SearchContext sharowRoot = shadowHost.getShadowRoot();
		
//		6.Locate the element inside shadow DOM		
		WebElement searchInput = sharowRoot.findElement(By.cssSelector("input#input"));
		searchInput.sendKeys("Selenium");
		
//		7. Close the browser
		driver.quit();

	}

}
