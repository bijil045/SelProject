package bsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSciptexe5 {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}


	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		/*driver.get("file:///C:/Users/Rahul%20Menon/Desktop/SelHtml/txtdis.html");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('t1').value='abc';");*/
		driver.get("http://www.google.com");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("document.getElementsByName('q')[0].value='sak';");
}
}