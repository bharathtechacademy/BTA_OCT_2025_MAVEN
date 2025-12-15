package operators;

public class OperatorsInJava {
	
	//Operators : operators are special characters used in Java programming language to perform different types of operations.
	
	//5 Types of Operators in Java
	
	//1. Arithmetic Operators ==> Special characters used in mathematical operations (+,-,*,/,% (modulus),++(increment-increase by 1),--(decrement - decrease by 1))
	//2. Assignment operators==> used to assign values to variables (=,+=,-=,*=,/=,%=)
	//3. Comparison Operators==> used to compare two values and return a boolean result (==,!=,>,<,>=,<=)
	//4. Logical Operators==> used to combine multiple conditions and build the logic (&& (AND), || (OR), ! (NOT))
	//5. Ternary Operator ==> used to evaluate a condition and return one of two values based on the result (condition ? value1 : value2)

	public static void main(String[] args) {
		//1. Arithmetic Operators ==> Special characters used in mathematical operations (+,-,*,/,% (modulus),++(increment-increase by 1),--(decrement - decrease by 1))
		System.out.println("***************Arithmetic Operators***************");
		int a = 10;
		int b = 5;
		System.out.println("Addition: " + (a + b)); //15
		System.out.println("Subtraction: " + (a - b)); //5
		System.out.println("Multiplication: " + (a * b)); //50
		System.out.println("Division: " + (a / b)); //2
		System.out.println("Modulus: " + (a % b)); //0
		
		//++ ==> increment operator ==> increases the value of a variable by 1
		System.out.println(a++);//10 (++ added at the end of variable called as post-increment)
		System.out.println("Value of a after post-increment: " + a); //11
		
		System.out.println(++b);//6 (++ added at the beginning of variable called as pre-increment)
		
		//-- ==> decrement operator ==> decreases the value of a variable by 1
		System.out.println(a--);//11 (post-decrement)
		System.out.println("Value of a after post-decrement: " + a); //10
		
		System.out.println(--b);//5 (pre-decrement)
		
		//2. Assignment operators==> used to assign values to variables (=,+=,-=,*=,/=,%=)
		System.out.println("***************Assignment Operators***************");
		
		int c = 20; //assignment operator
		System.out.println("Initial value of c: " + c); //20
		
		c += 10; //c = c + 10 = 30
		System.out.println("Value of c after += 10: " + c); //30
		
		c -= 5; //c = c - 5 = 25
		System.out.println("Value of c after -= 5: " + c); //25
		
		c *= 2; //c = c * 2 = 50
		System.out.println("Value of c after *= 2: " + c); //50
		
		c /= 5; //c = c / 5 = 10
		System.out.println("Value of c after /= 5: " + c); //10
		
		c %= 3; //c = c % 3 = 1
		System.out.println("Value of c after %= 3: " + c); //1
		
		//3. Comparison Operators==> used to compare two values and return a boolean result (==,!=,>,<,>=,<=)
		System.out.println("***************Comparison Operators***************");
		
		int d = 10;
		int e = 20;
		
		System.out.println("Is d equal to e? " + (d == e)); //false
		System.out.println("Is d not equal to e? " + (d != e)); //true
		System.out.println("Is d greater than e? " + (d > e)); //false
		System.out.println("Is d less than e? " + (d < e)); //true
		System.out.println("Is d greater than or equal to e? " + (d >= e)); //false
		System.out.println("Is d less than or equal to e? " + (d <= e)); //true
		
		//4. Logical Operators==> used to combine multiple conditions and build the logic (&& (AND), || (OR), ! (NOT))
		System.out.println("***************Logical Operators***************");
		
		int f = 15;
		int g = 25;
		int h = 30;
		System.out.println((f > g) && (g < h)); //false AND true = false
		System.out.println((f > g) || (g < h)); //false OR true = true
		System.out.println(!((f > g) || (g < h))); //not (false OR true) = not (true) = false
		
		
		//5. Ternary Operator ==> used to evaluate a condition and return one of two values based on the result (condition ? value1 : value2)		
		System.out.println("***************Ternary Operator***************");
		//Syntax: output = (condition) ? value1 : value2;
		
		int i = 50;
		int j = 40;
		
		int max = (i>j) ? i : j; //if i>j is true, assign i to max, else assign j to max
		System.out.println("Maximum value between i and j: " + max); //50
		

	}

}
