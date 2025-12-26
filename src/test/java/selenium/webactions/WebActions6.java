package selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebActions6 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1.Launch Chrome Browser      
		WebDriver driver = new ChromeDriver();
		
//		2.Maximize the browser window    		
		driver.manage().window().maximize();
		
//		3.Launch the application    (https://jqueryui.com/slider/)
		driver.get("https://jqueryui.com/slider/");
		
//		4. switch to the frame which contains the slider
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
//		5. Locate the slider element
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		
//		6.Locate the slider handle element
		WebElement sliderHandle = slider.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
//		7. Move the slider handle to the right side by 200 pixels.
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(sliderHandle, 200, 0).perform();
		
//		8. Move the slider handle to the left side by 100 pixels.
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();
		
//		9. Again Move the slider handle to the left side by 100 pixels.
		actions.dragAndDropBy(sliderHandle, -100, 0).perform();
		
//		10. Close the browser
		driver.quit();

	}

}
