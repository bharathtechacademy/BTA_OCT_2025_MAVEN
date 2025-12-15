package loops.statements;

public class DoWhileLoop {

	public static void main(String[] args) {


		int i = 0;

		//while-loop
		while (i > 0) {		
			System.out.println("Refresh the Page");
			i++;
		}
		
		//do-while loop
		do{		
			System.out.println("Refresh the Page");
			i++;
//			if(i>5) {
//				break;
//			}
		}while (i > 0) ;
	}

}
