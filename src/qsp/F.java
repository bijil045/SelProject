package qsp;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class F {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--</disable-notifications");
		WebDriver driver =new FirefoxDriver(options);
		driver.manage().deleteAllCookies();
		driver.get("https://www.yatra.com/");
}
}