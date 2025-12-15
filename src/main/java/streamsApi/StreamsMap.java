package streamsApi;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMap {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> output = numbers.stream().map(x -> x * x * x).collect(Collectors.toList());
		System.out.println(output);
	}
}