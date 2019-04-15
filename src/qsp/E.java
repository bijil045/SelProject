package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yatra.com/");
		
		//Thread.sleep(1000);
	//	Robot  ro = new Robot();
	//	ro.keyPress(KeyEvent.VK_ESCAPE);
}
}
