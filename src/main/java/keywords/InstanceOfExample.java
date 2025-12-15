package keywords;

public class InstanceOfExample extends Instance1{
	
	//instanceff : used to check whether an object is an instance of a specific class or implements a specific interface.

	public static void main(String[] args) {
		
		Instance1 obj1 = new Instance1();
		InstanceOfExample obj2 = new InstanceOfExample();
		
		System.out.println(obj1 instanceof Instance1);
		System.out.println(obj1 instanceof InstanceOfExample);
	}

}
