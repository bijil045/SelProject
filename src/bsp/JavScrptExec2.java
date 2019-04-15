package bsp;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScrptExec2 {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException, AWTException   {
			WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		String msg="Happy Festivals";
		j.executeScript("alert('"+msg+"')");
		
}
}
