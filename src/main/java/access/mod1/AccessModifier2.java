package access.mod1;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println("Employee Name: " + am1.name);
		am1.printEmpId();	
	}

}
