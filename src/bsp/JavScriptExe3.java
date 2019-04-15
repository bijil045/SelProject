package bsp;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScriptExe3 {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException, AWTException   {
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/license-agreement");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		for(int i=1;i<=10;i++){
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		}
		for(int i=1;i<=10;i++){
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(1000);
			}
}
}