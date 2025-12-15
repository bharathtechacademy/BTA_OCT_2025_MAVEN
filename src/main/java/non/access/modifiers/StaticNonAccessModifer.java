package non.access.modifiers;

public class StaticNonAccessModifer {
	
	// The static non-access modifier can be used before the data, before the method, before the block, and in inner classes.
	
	// When we are going to use static non-access modifier before any Java element, it won't be part of the class instance, so you don't need to create any object.
	
	
	String course1 = "Java"; // instance variable
	
	private static String course2 = "Selenium"; // static variable
	
	public static void display() { // static method
		System.out.println("Static method called");
	}

	public static void main(String[] args) {
		
		StaticNonAccessModifer obj = new StaticNonAccessModifer();
		System.out.println("Instance variable: " + obj.course1); // accessing instance variable using object
		System.out.println("Static variable: " + course2); // accessing static variable directly without object
		display(); // accessing static method directly without object


	}

}
