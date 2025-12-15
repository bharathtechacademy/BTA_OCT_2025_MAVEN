package non.access.modifiers;

public class OuterClass2 {

	public static void main(String[] args) {
		
		//create an instance of OuterClass (if non static class)
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass innerClass =  new OuterClass().new InnerClass();
		System.out.println(innerClass.value);
		
		//create an instance of StaticInnerClass (if static class)
		OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		System.out.println(staticInnerClass.value);

	}

}
