package keywords;

public class ChildClass extends ParentClass{	
	
	int marks = 95;//child
	
	public void printMarks(int marks) {//method local
		System.out.println("Marks: " + marks);
//		System.out.println("Marks: " + new ChildClass().marks);
//		System.out.println("Marks: " + new ParentClass().marks);
		System.out.println("Marks: " + this.marks);
		System.out.println("Marks: " + super.marks);
	}

	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.printMarks(100);  
	}

}
