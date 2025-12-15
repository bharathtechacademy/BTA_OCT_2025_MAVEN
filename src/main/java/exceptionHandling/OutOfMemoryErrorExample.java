package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {

	public static void main(String[] args) {
		
		List<Integer[]> list = new ArrayList<>();
		
		while(1>0) {
			list.add(new Integer[10000000]);
		}
		
		//4bytes*10000000=40MB

	}

}
