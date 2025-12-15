package interfaces;

public interface Selenium {	
	
	public void get(String url);
	
	public void findElement(String element);
	
	public void quit();
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	
	public default void getAI(String prompt) {
		// Default implementation (can be overridden by implementing classes)
		System.out.println("Selenium Interface - getAI method called with prompt: " + prompt);
	}
	
	public static void showVersion() {
		System.out.println("Selenium Interface - Version 1.0");
	}
	
	private void logAction(String action) {
		System.out.println("Selenium Interface - Action Logged: " + action);
	}
	
	
	public default void getAIResponse(String prompt) {
		sendAIRequest(prompt);
		System.out.println("Receive Response from AI Model");
	}

	public default void getAIImage(String prompt) {
		sendAIRequest(prompt);
		System.out.println("Receive Image from AI Model");
	}
	
	private void sendAIRequest(String prompt) {
		System.out.println("Connect to AI Model");
		System.out.println("Send Prompt: " +  prompt);
	}
	


}
