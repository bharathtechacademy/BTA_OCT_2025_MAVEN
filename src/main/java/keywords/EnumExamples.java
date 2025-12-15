package keywords;

//after using enum
enum Direction {
	NORTH, SOUTH, EAST, WEST // public static final
}

enum Operation {
	ADD {
		@Override
		public int result(int a, int b) {
			return a + b;
		}
	},
	SUBTRACT {
		@Override
		public int result(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {
		@Override
		public int result(int a, int b) {
			return a * b;
		}
	},
	DIVIDE {
		@Override
		public int result(int a, int b) {
			return a / b;
		}
	};

	public abstract int result(int a, int b);
}

public class EnumExamples {

	//before using enum
//	final String direction1 = "NORTH";
//	final String direction2 = "SOUTH";
//	final String direction3 = "EAST";
//	final String direction4 = "WEST";

	public static void main(String[] args) {
		System.out.println(Direction.NORTH);
		System.out.println(Operation.MULTIPLY.result(10, 5));
	}

}
