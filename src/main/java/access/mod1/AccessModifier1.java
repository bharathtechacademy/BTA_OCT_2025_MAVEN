package access.mod1;

public class AccessModifier1 {
	
	//Access Modifiers in Java : Keywords that we are going to use in Java to control the access of Java elements.
	
	//Types of Access Modifiers:
	
	//1.public  ==> accessible from anywhere (within the project)
	//2.protected ==> accessible within the same package and also in subclass in different package
	//3.default(no keyword)  ==> accessible only within the same package
	//4.private ==> accessible only within the same class

	//public : before class, method, variable
	//protected : before method, variable
	//default : before class, method, variable
	//private : before method, variable
	
	 public String name = "Bharath";
	
	 public void printEmpId() {
		System.out.println("Employee ID: 12345");
	}	
	
	public static void main(String[] args) {
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println("Employee Name: " + am1.name);
		am1.printEmpId();	
	}

}
