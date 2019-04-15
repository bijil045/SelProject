package bsp;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrp {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException, AWTException   {
			WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement source = driver.findElement(By.xpath("//h1[.='Block 1')]"));
	WebElement target = driver.findElement(By.xpath("//h1[.='Block 3')]"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
		
}
}