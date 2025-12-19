package selenium.basics;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebActions {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
//		1: Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
//		2: Maximize the browser window to full screen
		driver.manage().window().maximize();
		
//		3: Clear all cookies from the browser
		driver.manage().deleteAllCookies();
		
//		4: Open Google India homepage
		driver.get("https://www.example.com");
		
//		5: Locate the element using xpath locator
		WebElement element = driver.findElement(By.xpath("//tag[@att='val']"));
		
		/*******Common Web-Element Actions***********/
		
//		Verify whether the element is displayed within the web page.
		boolean isDisplayed = element.isDisplayed();
		System.out.println("Is element displayed: " + isDisplayed);
		
//		Verify whether the element is enabled to perform the action.
		boolean isEnabled = element.isEnabled();
		System.out.println("Is element enabled: " + isEnabled);
		
//		Verify whether the checkbox is already selected before selecting.
		boolean isSelected = element.isSelected();
		System.out.println("Is element selected: " + isSelected);
		
		/*******Element Specific Actions***********/
		
		/********************BUTTON ELEMENT***********/
		
//		Locate the button element.
		WebElement button = driver.findElement(By.id("buttonId"));
		
//		Verify the label of the button.		
		String buttonLabel = button.getText(); //if the button has text
		System.out.println("Button label: " + buttonLabel);
		
		String buttonValue = button.getAttribute("value"); //if the button uses value attribute
		System.out.println("Button value: " + buttonValue);
		
//		Clicking on the button.
		button.click();
		
//		Double-click on the button.
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
//		Mouse hover on the button.		
		actions.moveToElement(button).perform();
		
//		Right-click on the button.		
		actions.contextClick(button).perform();
		
//		Drag and drop operation on top of the button.		
		WebElement sourceElement = driver.findElement(By.id("sourceId"));
		WebElement targetElement = driver.findElement(By.id("targetId"));
		actions.dragAndDrop(sourceElement, targetElement).perform();
		
//		Scroll until the button is visible, and then click on the button.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		
//		Click on the hidden element.
		js.executeScript("arguments[0].click();", button);
		
		/********************TEXTBOX ELEMENT***********/
		
//		Locate the textbox element.
		WebElement textbox = driver.findElement(By.name("textboxName"));
		
//		Clear the text box.
		element.clear();
		
//		Enter text into the text box.		
		textbox.sendKeys("Sample Text");
		
//		Verify the placeholder text within the text box.
		String placeholderText = textbox.getAttribute("placeholder");
		System.out.println("Placeholder text: " + placeholderText);
		
//		Enter text along with function keys.
		actions.sendKeys(textbox, "Text with ENTER key").sendKeys(Keys.ENTER).perform();
		
//		Enter text into disabled text box.
		js.executeScript("arguments[0].value='SampleText'", button);
		
		/********************DROPDOWN ELEMENT***********/
		
//		Locate the dropdown element.
		WebElement dropdown = driver.findElement(By.name("dropdownName"));
		
//		Verify whether drop-down is single selection or multi-selection drop-down.
		Select select = new Select(dropdown);
		boolean isMultiple = select.isMultiple();
		
//		Select the option from the drop-down.		
		select.selectByVisibleText("Option1");
		select.selectByValue("option2Value");
		select.selectByIndex(3);
		
//		We can deselect options if it is a multi-select drop-down.
		if(isMultiple) {
			select.selectByVisibleText("Option1");
			select.selectByValue("option2Value");
			select.selectByIndex(3);
			select.deselectByVisibleText("Option1");
			select.deselectByValue("option2Value");
			select.deselectByIndex(3);
			select.deselectAll();
		}
		
//		Verify selected option from the drop-down.
		String selectedOption = select.getFirstSelectedOption().getText();
		
//		Verify all the options available within the dropdown.
		List<WebElement> options = select.getOptions();
		for(WebElement option : options) {
			System.out.println("Dropdown option: " + option.getText());
		}
		
		/********************CHECKBOX ELEMENT***********/		
//		Locate the checkbox element.
		WebElement checkbox = driver.findElement(By.id("checkboxId"));
		
//		Select the checkbox if already not selected.
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		/********************RADIO-BUTTON ELEMENT***********/	
//		Locate the radio-button element.
		WebElement radioButton = driver.findElement(By.id("radioButtonId"));
		
//		Click on the radio button.
		radioButton.click();
		
		/********************IMAGE ELEMENT***********/	
//		Locate the image element.
		WebElement image = driver.findElement(By.xpath("//img[@alt='sampleImage']"));
		
//		Verify whether the image is displayed or not.		
		boolean isImageDisplayed = image.isDisplayed();
		System.out.println("Is image displayed: " + isImageDisplayed);
		
//		Verify whether the correct image is displayed using the 'src' attribute.
		String imageSrc = image.getAttribute("src");
		System.out.println("Image source URL: " + imageSrc);
		
//		Verify the size of the image or resolution of the image.
		int imageWidth = image.getSize().getWidth();
		int imageHeight = image.getSize().getHeight();
		System.out.println("Image width: " + imageWidth + ", height: " + imageHeight);
		
//		Verify the position of the image.
		int imageX = image.getLocation().getX();
		int imageY = image.getLocation().getY();
		System.out.println("Image position - X: " + imageX + ", Y: " + imageY);
				
//		Verify the color of a specific pixel within the image.
		int pixelColor = ImageIO.read(new URL(imageSrc)).getRGB(imageX, imageY);
		
		/********************HYPERLINK ELEMENT***********/			
//		Locate the hyperlink element.
		WebElement hyperlink = driver.findElement(By.linkText("Click here"));
		
//		Verify the URL of the hyperlink.(method 1)
		String linkURL = hyperlink.getAttribute("href");
		System.out.println("Hyperlink URL: " + linkURL);
		
//		Verify the URL of the hyperlink.(method 2)
		hyperlink.click();
		String currentURL = driver.getCurrentUrl();
		
		/********************TEXT ELEMENT***********/		
//		Locate the text element.
		WebElement textElement = driver.findElement(By.id("textElementId"));
		
//		Verify the text within the element.
		String elementText = textElement.getText();
		System.out.println("Element text: " + elementText);
		
		/********************UPLOAD ELEMENT***********/		
//		Locate the file upload element.
		WebElement uploadElement = driver.findElement(By.name("uploadName"));
		
//		Upload the file by specifying the file path.
		uploadElement.sendKeys("C:\\path\\to\\file.txt");
	}

}
