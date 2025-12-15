package loops.statements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorsInJava {
	
	//Iterators are default methods available in the collections. These methods are used to iterate over each and every value.
	
	//Iterator interface provides three important methods:
	//1. hasNext() ==> checks if there is any next value available in the collection.
	//2. next() ==> moves the cursor to the next value and returns the value.
	//3. remove() ==> removes the current value from the collection.

	public static void main(String[] args) {
		
		//Create a list of employee names using ArrayList and iterate over each and every name using Iterator.
		List<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Bharath");
		empNamesList.add("Anusha");
		empNamesList.add("Soumya");		
		Iterator<String> iteratorList =empNamesList.iterator();
				
		while(iteratorList.hasNext()) {
			String name = iteratorList.next();
			System.out.println(name);
			if(name == "Anusha") {
				iteratorList.remove(); //removing the name "Anusha" from the list
			}
		}
		
		System.out.println("After removing Anusha from the list:"+empNamesList);
		
		//Store values in the MAP
		Map<Integer, String> empMap = new HashMap<Integer, String>();
		empMap.put(101, "Bharath");
		empMap.put(102, "Anusha");
		empMap.put(103, "Soumya");
		
		Iterator<String> mapValues = empMap.values().iterator();
		while(mapValues.hasNext()) {
			String name = mapValues.next();
			System.out.println(name);			
		}
		
		
	}

}
