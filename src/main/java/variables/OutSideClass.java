package variables;

public class OutSideClass {

	public static void main(String[] args) {
		// Accessing instance variable
		CategoriesOfVariables obj = new CategoriesOfVariables();
		System.out.println(obj.name2);
		
		// Accessing static variable
		System.out.println(CategoriesOfVariables.name3);

	}

}
