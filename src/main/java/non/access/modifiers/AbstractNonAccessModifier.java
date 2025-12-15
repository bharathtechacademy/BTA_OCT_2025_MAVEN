package non.access.modifiers;

public abstract class AbstractNonAccessModifier {
	
	//abstract: abstract non-access modifier can be used when we want to create a method without body.
	
	//method : A method is a block of code { } or collection of statements written together to complete a specific task.
	
	void launchBrowserAndApplication(){
		System.out.println("Launch the edge browser");
		System.out.println("Enter url 'www.icici.com' and launch application");
	}
	
	abstract void login();
	
	abstract void logout();
	
	

	public static void main(String[] args) {
		
		//AbstractNonAccessModifier obj = new AbstractNonAccessModifier();
//		obj.launchBrowserAndApplication();
		

	}

}
