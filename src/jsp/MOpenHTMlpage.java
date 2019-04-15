package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MOpenHTMlpage {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/googht.html");
	//	WebElement we = driver.findElement(By.tagName("a"));
	//	we.click();
	/*	driver.findElement(By.tagName("a")).click();//in the browser find the element by using tag name"a" and click it
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.id("a1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("n1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Google")).click();;
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Goo")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);*/
		driver.findElement(By.cssSelector("a.c1")).click();
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		driver.findElement(By.cssSelector(".c1")).click();
		driver.findElement(By.cssSelector("a#a1")).click();
		driver.findElement(By.cssSelector("#a1")).click();
	}
}
