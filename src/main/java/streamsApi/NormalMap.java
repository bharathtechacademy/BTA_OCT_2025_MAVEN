package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalMap {

	public static void main(String[] args) {
		// We are going to get a set of numbers. Now we need to create an output list with the cube of each and every number.
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> output = new ArrayList<Integer>();
		
		for(int num : numbers) {			
			int qube = num*num*num;
			output.add(qube);
		}

		System.out.println();
	}

}
