package loops.statements;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {
	
	//for-each loop ==> enhanced for loop ==> Repeat the execution for  each and every value of predefined list.
	
	//syntax:
	// for(datatype variable : array/list/set) {
	//    // code to be executed
	// }

	public static void main(String[] args) {
	
		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
		empNames[2] = "Bharath";
		
		// for loop
		for(int i=0; i<empNames.length ;i++) {
			System.out.println(empNames[i]);
		}
		
		// for-each loop
		for(String name : empNames) {
			System.out.println(name);
		}
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Anusha");
		empNamesHashSet.add("Soumya");
		empNamesHashSet.add("Binoy");
		empNamesHashSet.add("Bhagwat");
		
		Set<Integer> empIdsHashSet = new HashSet<Integer>();
		empIdsHashSet.add(101);
		empIdsHashSet.add(102);
		empIdsHashSet.add(103);
		empIdsHashSet.add(104);
		empIdsHashSet.add(105);		

		// for-each loop with HashSet
		for(String name : empNamesHashSet) {
			System.out.println(name);
		}
		
		//for-each loop with HashSet
		for(Integer id : empIdsHashSet) {
			System.out.println(id);
		}
	}

}
