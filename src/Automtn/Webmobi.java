package Automtn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webmobi {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.get("https://www.webmobi.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,'/user')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='identity']")).sendKeys("bijilvijay045@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Chikkumon@090");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn create']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='btn btn-ln select']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='trade']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='datepicker_st']")).click();
		driver.findElement(By.xpath("(//span[@class='flatpickr-next-month'])[4]")).click();
		driver.findElement(By.xpath("//span[text()='February ']/../../../div[2]//div[2]/span[text()='16']")).click();
		
		
		
}
}