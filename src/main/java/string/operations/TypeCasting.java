package string.operations;

public class TypeCasting {
	
	//Data Conversion: Converting one datatype to another datatype.
	
	//Type Casting : Converting one datatype to similar datatype.

	public static void main(String[] args) {
		
		
		byte marks = 98;
		int newMarks =marks ; // Auto casting or Widening casting.
		
		int population = 10;
		byte newPopulation =(byte)  population; // Narrowing casting or Explicit casting.
		System.out.println(newPopulation);

		
		
	}

}
