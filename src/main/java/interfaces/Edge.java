package interfaces;

public class Edge implements Selenium {

	@Override
	public void get(String url) {
		System.out.println("Edge Browser - Navigating to URL: " + url);		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Edge Browser - Finding Element: " + element);		
	}

	@Override
	public void quit() {
		System.out.println("Edge Browser - Quitting the browser.");		
	}

	@Override
	public void click(String element) {
		System.out.println("Edge Browser - Clicking on Element: " + element);		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Edge Browser - Sending Keys to Element: " + element + " with Value: " + value);		
	}

	@Override
	public void getAI(String prompt) {
		// TODO Auto-generated method stub
		
	}

}
