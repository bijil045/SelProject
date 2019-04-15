package bsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException, AWTException   {
			WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("actiTIME Inc.")).click();
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions= new Actions(driver);
	 actions.contextClick(link).perform();//we get contextmenu
	 Thread.sleep(4000);
	 Robot rb= new Robot();
	 rb.keyPress(KeyEvent.VK_W);//t-> new tab w->new window
 
}
}