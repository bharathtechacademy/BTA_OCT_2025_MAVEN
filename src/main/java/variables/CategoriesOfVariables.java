package variables;

public class CategoriesOfVariables {
	
	//There are mainly four categories of variables we have in Java:
	
	//1. Local variables ==> Local variable is nothing but the variable created inside the method/block {}. Local variables can be accessed within the same block only.
	//2. Instance variables or class level variables. ==> Instance variables are declared inside the class but outside of the method
	//3. Static variables ==> Static variables are declared with the static keyword inside the class but outside of the method.
	//4. Parameter variables are arguments. ==> Parameter variables are used to pass values to methods.
	
	
	String name2 ="Java"; // Instance variable
	
	static String name3 ="Python"; // Static variable

	public static void main(String[] args) {		
		
		sumOfNumbers(10,20);
		
		// Local variable
		String name = "Selenium"; // name is a local variable
		System.out.println(name);
		
		// Accessing instance variable
		CategoriesOfVariables obj = new CategoriesOfVariables();
		System.out.println(obj.name2);
		
		// Accessing static variable
		System.out.println(name3);

	}
	
	
	public static void sumOfNumbers(int a, int b) { // a and b are parameter variables
		System.out.println(a+b);		
	}
	
	public void accessData() {
		//System.out.println(name); // Error: Cannot access local variable 'name' here
		System.out.println(name2);
	}

}
