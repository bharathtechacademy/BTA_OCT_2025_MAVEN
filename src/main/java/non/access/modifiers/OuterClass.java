package non.access.modifiers;

public class OuterClass {
	
	class InnerClass {		//non-static inner class
		String value = "I'm from Inner Class";
	}
	
	static class StaticInnerClass {//static inner class
		String value = "I'm from Static Inner Class";
	}
	
	class Navigation{
		void navigate() {
			System.out.println("Navigating...");
		}
	}
	
	class Window{
		void open() {
			System.out.println("Opening window...");
		}
	}
	

}
