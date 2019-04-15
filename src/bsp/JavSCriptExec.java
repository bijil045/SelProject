package bsp;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavSCriptExec {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException, AWTException   {
			WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/logon.do");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("alert('hi')");
}
}