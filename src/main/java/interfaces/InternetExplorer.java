package interfaces;

public class InternetExplorer implements Selenium {

	@Override
	public void get(String url) {
		System.out.println("Internet Explorer Browser - Navigating to URL: " + url);		
	}

	@Override
	public void findElement(String element) {
		System.out.println("Internet Explorer Browser - Finding Element: " + element);		
	}

	@Override
	public void quit() {
		System.out.println("Internet Explorer Browser - Quitting the browser.");		
	}

	@Override
	public void click(String element) {
		System.out.println("Internet Explorer Browser - Clicking on Element: " + element);		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Internet Explorer Browser - Sending Keys to Element: " + element + " with Value: " + value);		
	
		Selenium.showVersion();
	}

}
