package bsp;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExeGetLoc {
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
		WebElement e = driver.findElement(By.xpath("//h3[text()='9. Proprietary Rights']"));
		WebElement h = driver.findElement(By.cssSelector("header.header"));
		int height=h.getSize().getHeight();
		System.out.println(h);
		int x= e.getLocation().getX();
		System.out.println(x);
		int y=	e.getLocation().getY();
		y=y-height;
		System.out.println(y);
		j.executeScript("window.scrollBy('"+x+"','"+y+"')");

	}
}
