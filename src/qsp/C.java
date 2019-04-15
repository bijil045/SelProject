package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver =new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
		Thread.sleep(1000);
		Robot  ro = new Robot();
		
		ro.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		ro.keyPress(KeyEvent.VK_ENTER);
}
}