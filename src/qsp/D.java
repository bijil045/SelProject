package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver =new FirefoxDriver();

		driver.get("https://www.google.com");
		Robot  ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_P);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(20000);
		//press escape to cancel
		ro.keyPress(KeyEvent.VK_ESCAPE);
		
}
}