package oops;

public class PolyClass1 {
	
	public void add(int a, int b) {
		System.out.println("Sum: " + (a + b));
	}
	
	public void add(int x, double y) {
		System.out.println("Sum: " + (x + y));
	}
	
	//Method Overloading/Compile time polymorphism
	//MULTIPLE METHODS WITH SAME NAME WITH IN SAME CLASS BUT DIFFERENT ARGUMENTS
	public void add(int a, int b, int c) {
		System.out.println("Sum: " + (a + b+c));
	}

	public static void main(String[] args) {
		PolyClass1 obj = new PolyClass1();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 20.0);

	}

}
