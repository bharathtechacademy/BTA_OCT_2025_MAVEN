package selenium.basics;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionConcepts {
	
	//Assertions : Validation Points in the program
	
	//2 Assertion Types:
	
	//1. Hard Assertion : if any validation point fails, rest of the code will not be executed  ==> Assert --> TestNG, Junit --> static methods
	//2. Soft Assertion : if any validation point fails, rest of the code will be executed ==> SoftAssert --> TestNG --> non-static methods

	
	//Methods of Assert class (Hard /Soft Assertion)
	
	//1. assertEquals(actual, expected) : to check actual vs expected value
	//2. assertNotEquals(actual, expected) : to check actual vs expected value should not be same
	//3. assertTrue(condition) : to check condition is true
	//4. assertFalse(condition) : to check condition is false
	//5. assertNull(object) : to check object is null
	//6. assertNotNull(object) : to check object is not null
	//7. fail() : to fail the test case explicitly
	
	public static void main(String[] args) {
		
		//Hard Assertion Example:
		Assert.assertEquals(10, 10, "Values are not Matching");
		Assert.assertNotEquals("Hello", "hello", "Values are Matching"); 
		Assert.assertTrue(5 > 1, "Condition is False");
		Assert.assertFalse(3 < 1, "Condition is True");
		Assert.assertNull(null, "Object is not Null");
		Assert.assertNotNull("Selenium", "Object is Null");
		//Assert.fail("Failing the test case explicitly");
		
		//Soft Assertion Example:
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(10, 20, "Values are not Matching");
		softAssert.assertNotEquals("Hello", "Hello", "Values are Matching"); 
		softAssert.assertTrue(5 < 1, "Condition is False");
		softAssert.assertFalse(3 > 1, "Condition is True");
		softAssert.assertNull(123, "Object is not Null");
		softAssert.assertNotNull(null, "Object is Null");
		softAssert.fail("Failing the test case explicitly");
		softAssert.assertAll(); //To report all soft assertion results
		
		System.out.println("Execution Completed");
	

	}

}
