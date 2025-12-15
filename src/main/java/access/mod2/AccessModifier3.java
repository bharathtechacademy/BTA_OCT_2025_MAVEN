package access.mod2;

import access.mod1.AccessModifier1;

public class AccessModifier3 extends AccessModifier1{

	public static void main(String[] args) {
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println("Employee Name: " + am1.name);
		am1.printEmpId();	
	}

}
