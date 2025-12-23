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

public class WebActions2 {
	
	static WebDriver driver;

	public static void main(String[] args) {		

//		1. Launch the Chrome browser window		
		driver = new ChromeDriver();
		
//		2. Maximize the browser window		
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application(https://demoqa.com/automation-practice-form)
		driver.get("https://demoqa.com/automation-practice-form");
		
//		5. Wait for Pageload
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[text()='Practice Form']"), 0));
		
//		6. Enter Firstname and Lastname
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		firstName.sendKeys("Bharath Tech");
		lastName.sendKeys("Academy");
		
//		7. Enter Email
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("bharthtechacademy@gmail.com");
		
//		8. Select Gender 'Male'
		selectGender("Male");
		
//		9. Enter mobile number		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("9553220022");
		
//		10.Select DOB (14-Feb-1991)
		selectDOB("14", "February", "1991");		
		
//		11.Search and Select Computer Science
		selectSubject("Computer Science");
		
//		12.Select Hobbies as Sports and Reading
		String [] hobbies = {"Sports", "Reading"};
		selectHobbies(hobbies);
		
//		13.Upload any photo
		WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		uploadPhoto.sendKeys(System.getProperty("user.dir") + "\\Files\\Profile.png");
		
//		14.Submit Details		
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",submitButton);
		
//		15.Wait for successful submission message 
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='Thanks for submitting the form']"), 0));
		
//		16. Close browser window
		driver.quit();

	}
	
	//Common method to select the gender value.
	public static void selectGender(String gender) {
		WebElement genderRadio = driver.findElement(By.xpath("//label[text()='"+gender+"']"));
		genderRadio.click();
	}
	
	//Common method to select the date of birth
	public static void selectDOB(String day, String month, String year) {
		
		//click on DOB input field and launch the date picker
		WebElement dobInput = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dobInput.click();
		
		//wait for date picker to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@class='react-datepicker__month-select']"), 0));
		
		//select the month
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText(month);
		
		//select the year
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText(year);
		
		//select the day
		WebElement dayOption = driver.findElement(By.xpath("//div[contains(@aria-label,'"+month+"') and text()='"+day+"']"));
		dayOption.click();
	
	}
	
	//common method to select subject
	public static void selectSubject(String subject) {
		
		//Locate the subject input field
		WebElement subjectInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		
		//Enter the subject name
		Actions actions = new Actions(driver);
		actions.sendKeys(subjectInput, subject).perform();
		
		//Wait for the subject auto-suggestion to appear (//div[text()='Computer Science' and contains(@class,'option')])
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"), 0));
		
		//Click on the subject from the auto-suggestion using js click
		WebElement subjectOption = driver.findElement(By.xpath("//div[text()='"+subject+"' and contains(@class,'option')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",subjectOption);
		
	}
	
	
	//Common method to select the hobbies
	public static void selectHobbies(String[] hobbies) {
		for (String hobby : hobbies) {
			WebElement hobbyCheckbox = driver.findElement(By.xpath("//label[text()='" + hobby + "']"));
			if (!hobbyCheckbox.isSelected()) {
				hobbyCheckbox.click();
			}
		}
	}

}
