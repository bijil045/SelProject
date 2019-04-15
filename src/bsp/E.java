package bsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com");
		Robot  ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_P);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//press escape to cancel
		ro.keyPress(KeyEvent.VK_CODE_INPUT);
}
}
