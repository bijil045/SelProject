package Automtn;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesugestionselect {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
String key="webdriver.chrome.driver";
String value="./Driver/chromedriver.exe";
System.setProperty(key, value);
}
public static void main(String[] args) throws AWTException {
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
}
}
