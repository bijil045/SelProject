package jsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BOpenFirefox {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.gecko.driver";
	String value="./Driver/geckodriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
	FirefoxDriver driver = new FirefoxDriver();
	driver.close();
}
}
