package streamsApi;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {

	public static void main(String[] args) {
		
		Interface1 obj = new ImpClass();
		obj.sum(5, 10);
		obj.multiply(5, 10);
		
		
		FunInterface fobj = (a,b)-> System.out.println("Sum using FI: " + (a + b));
		fobj.sum(20, 30);
		
		
		BiConsumer<Integer,Integer> bicon = (a,b) -> System.out.println("Sum using BiConsumer: " + (a + b));
		bicon.accept(50, 70);
		
		FunInterface2 fobj2 = str -> str.isEmpty();
		System.out.println(fobj2.isStringEmpty("Hello"));
		
		Predicate<String> pobj = str -> str.isEmpty();
		System.out.println(pobj.test(""));
		
		FunInterface3 fobj3 = a -> a * a;
		System.out.println("Square using FI: " + fobj3.square(7));
		
		Function <Integer, Integer> func = a -> a * a;
		System.out.println("Square using Function: " + func.apply(8));
		
		FunInterface4 fobj4 = () -> Calendar.getInstance().getTime().toString();
		System.out.println("Current Time using FI: " + fobj4.getTime());
		
		Supplier <String> sup = () -> Calendar.getInstance().getTime().toString();
		System.out.println("Current Time using Supplier: " + sup.get());
	}

}
