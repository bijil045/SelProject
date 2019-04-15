package bsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import qsp.QListBoxAssignmnet;

public class DropDownMenuActitime {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException   {
			WebDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		//find the menu
		WebElement menu = driver.findElement(By.linkText("Features"));
		//mouse hover on the menu
		Actions actions= new Actions(driver);
		actions.moveToElement(menu).perform();
		//select first Sub menu
		driver.findElement(By.linkText("Simple Time Tracking")).click();
}
}