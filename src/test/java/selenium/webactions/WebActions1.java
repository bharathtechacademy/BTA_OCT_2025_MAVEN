package selenium.webactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebActions1 {
	
	public static void main(String[] args) {
		
//		1. Launch the Chrome browser window		
		WebDriver driver = new ChromeDriver();
		
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

		
//		7. Verify application caption " Experience the difference"
//		8. Enter Invalid credentials in Username (Invalid User) and Password (Empty) textboxes
//		9. Click on Login Button
//		10. Verify error message is displayed (The username and password could not be verified.)
//		11. Click on Adminpage link
//		12. Wait for admin page
//		13. Select Data access mode as ' SOAP'
//		14. Scrolldown till Loan provider
//		15. Select Loanprovider as 'Web Service'
//		16. Click on Submit button
//		17.wait for Successful submission message
//		18.Click on Services Link
//		19.Wait for Services page
//		20.Scrolldown till Bookstore services
//		21.Get total rows, columns in the bookstore service table
//		22.Get Column headers of book store services table
//		23.Get all the data from book store service table
//		24.Close browser window
		
	}

}
