package string.operations;

public class TypeCast2 extends TypeCast1 {

	public static void main(String[] args) {
		
		TypeCast2 obj = new TypeCast2(); //normal way to create object of TypeCast2 class
		
		
		// Upcasting (use parent class in the place of datatype
		TypeCast1 obj1 = new TypeCast2(); 
		
		// Downcasting
		TypeCast2 obj2 = (TypeCast2) obj1;
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//TakesScreenshot ts = (TakesScreenshot) driver;
	}

}
