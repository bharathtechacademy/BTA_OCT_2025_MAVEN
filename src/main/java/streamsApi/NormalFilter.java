package streamsApi;

import java.util.ArrayList;
import java.util.List;

public class NormalFilter {

	public static void main(String[] args) {

		//There are 10 numbers. You can take it as an input. Out of these 10 numbers, separate even numbers and store in the list.
		//1,2,3,4,5,6,7,8,9,10
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		//List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> outputEvenNumbersList = new ArrayList<>();
		
		for(int number : numbers) {
			if(number % 2 == 0) {
				outputEvenNumbersList.add(number);
			}
		}
		
		System.out.println("Even Numbers List: " + outputEvenNumbersList);

	}

}
