package selenium.webactions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebActions1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
//		1. Launch the Chrome browser window		
		driver = new ChromeDriver();
		
//		2. Maximize the browser window		
		driver.manage().window().maximize();
		
//		3. Delete all the cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL "https://parabank.parasoft.com/parabank" and Launch the application		
		driver.get("https://parabank.parasoft.com/parabank");
		
//		5. Verify application title (""ParaBank | Welcome | Online Banking"
		String title = driver.getTitle();
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
		
//		6. Verify application logo 
		WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
//		7. Verify application caption " Experience the difference"
		WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
		Assert.assertEquals(caption.getText(), "Experience the difference");
		
//		8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		//clear 
		username.clear();
		password.clear();
		
		//enter invalid credentials
		username.sendKeys("Invalid User");
		password.sendKeys("");
		
//		9. Click on Login Button		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
		loginButton.click();
		
//		10. Verify error message is displayed (The username and password could not be verified.)
//		Thread.sleep(2000); //wait for error message to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//maximum wait time is 10 seconds
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//p[text()='Please enter a username and password.']"), 0));
		
//		11. Click on Adminpage link		
		WebElement adminPageLink = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageLink.click();
		
//		12. Wait for admin page
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//h1[contains(text(),'Administration')]"), 0));
		
//		13. Select Data access mode as ' SOAP'
		selectDataAccessMode("soap");
		
//		14. Scrolldown till Loan provider
		WebElement loanProvider = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",loanProvider);
		
//		15. Select Loan provider as 'Web Service'
		Select loanSelect = new Select(loanProvider);
		loanSelect.selectByVisibleText("Web Service");
		
//		16. Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		17.wait for Successful submission message
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//b[text()='Settings saved successfully.']"), 0));
		
//		18.Click on Services Link		
		WebElement servicesLink = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));
		servicesLink.click();
		
//		19.Wait for Services page		
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//span[text()='Bookstore services:']"), 0));
		
//		20.Scrolldown till Bookstore services		
		WebElement bookstoreServices = driver.findElement(By.xpath("//span[text()='Bookstore services:']"));
		js.executeScript("arguments[0].scrollIntoView(true);",bookstoreServices);
		
//		21.Get total rows, columns in the bookstore service table
		List<WebElement> rows = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr[1]//td"));
		int totalRows = rows.size();
		int totalColumns = columns.size();		
		
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
		printTableData(totalRows, totalColumns);
		
//		24.Close browser window		
		driver.quit();
	}
	
	public static void selectDataAccessMode(String mode) {
		WebElement dbaMode = driver.findElement(By.xpath("//input[@value='"+mode+"']"));
		dbaMode.click();
	}
	
	public static void printTableData(int rows, int columns) {
		
		for(int r=1; r<=rows; r++) {
			for(int c=1; c<=columns; c++) {
				WebElement data = driver.findElement(By.xpath("//span[text()='Bookstore services:']/following-sibling::table[1]//tbody//tr["+r+"]//td["+c+"]"));
				System.out.print("row "+r+"column "+c+" data is : "+data.getText()+"  ");
			}
			System.out.println();
		}
	}

}
