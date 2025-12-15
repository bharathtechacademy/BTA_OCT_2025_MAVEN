package non.access.modifiers;

public final class FinalNonAccessModifier {
	
	//final : final non-access modifier can be used before the variable, before the method, even before classes as well.
	
	//final means ==> No more modifications allowed.
	
	// final variable: final variable will become constant, and you cannot change the value.
	// final method: final method we cannot override within the sub/child classes.
	//final class: final class cannot be inherited/extended.
	
	final double pie = 3.14;
	
	public final void method1() {
		System.out.println("This is method 1 from parent class");
	}

	public static void main(String[] args) {
		
		FinalNonAccessModifier obj = new FinalNonAccessModifier();
		System.out.println("Value of pie: " + obj.pie);
		//obj.pie = 3.16; // trying to change the value of final variable
	
	}

}
