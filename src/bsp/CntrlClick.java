package bsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CntrlClick {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException   {
			WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.actitime.com");
			driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.findElement(By.linkText("actiTIME Inc.")).click();
	//	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		WebElement link = driver.findElement(By.linkText("Gmail"));
		Actions actions= new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(1000);
		Set<String> allWhS = driver.getWindowHandles();
		System.out.println(allWhS.size());
		for (String wh : allWhS) {
			driver.switchTo().window(wh);//switch to tab
			System.out.println(driver.getTitle());
			
		}
		driver.close();
		driver.quit();
}
}
