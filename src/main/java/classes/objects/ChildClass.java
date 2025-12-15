package classes.objects;

public class ChildClass extends  ParentClass{ //child extends parent
	
	//Inheritance is an OOP concept.
	//Extending parent class properties into child class without creating any object.

	public static void main(String[] args) {

		ParentClass obj = new ChildClass();		

		System.out.println("Emp Name is :"+obj.name);
		
		System.out.println("Emp Id is :"+obj.empId);

		System.out.println("Emp Visa Status is :"+obj.visaStatus);
	}

}
