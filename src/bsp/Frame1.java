package bsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}


	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/Page1.html");
		//using index
		driver.switchTo().frame(0);
		//driver.switchTo()
		driver.findElement(By.id("t2")).sendKeys("a");
	//driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("a");
		//using id
	/*	driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("b");
		//using address
		WebElement e = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("c");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("c");*/
}
}