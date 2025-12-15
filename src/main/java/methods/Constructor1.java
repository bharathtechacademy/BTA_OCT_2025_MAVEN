package methods;

public class Constructor1 {

	// Constructor : constructor is a Java special method used to initialize the
	// objects. The constructor is called when an object of any class is created.

	String bloodGroup = "O+ve";

	// Default Constructor
	Constructor1() {

	}
	
	int empId=0;	

	// Parameterized Constructor
	Constructor1(int id) {
		empId = id;
	}	
	
	//Before parameterized constructor
//	void printEmployeeName(int empid, String empname) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Name: " + empname);
//	}
//	
//	void printEmployeeAddress(int empid, String empaddress) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Address: " + empaddress);
//	}
//	
//	void printEmployeeSalary(int empid, double empsalary) {
//		System.out.println("Employee ID: " + empid);
//		System.out.println("Employee Salary: " + empsalary);
//	}

	//After parameterized constructor
	void printEmployeeName(String empname) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empname);
	}
	
	void printEmployeeAddress(String empaddress) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Address: " + empaddress);
	}
	
	void printEmployeeSalary(double empsalary) {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Salary: " + empsalary);
	}

}
