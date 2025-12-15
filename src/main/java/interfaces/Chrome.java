package interfaces;

public class Chrome implements Selenium {

	@Override
	public void get(String url) {
		System.out.println("Chrome Browser - Navigating to URL: " + url);		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Chrome Browser - Finding Element: " + element);		
	}

	@Override
	public void quit() {
		System.out.println("Chrome Browser - Quitting the browser.");		
	}

	@Override
	public void click(String element) {
		System.out.println("Chrome Browser - Clicking on Element: " + element);		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Chrome Browser - Sending Keys to Element: " + element + " with Value: " + value);		
	}

	@Override
	public void getAI(String prompt) {
		// TODO Auto-generated method stub
		
	}

	

}
