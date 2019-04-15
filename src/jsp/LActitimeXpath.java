package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LActitimeXpath {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	
	//driver.findElement(By.xpath("//input[@id='headerContainer'"));	
	driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
	driver.findElement(By.xpath("//img[contains(@src,'logo')]"));
	
	driver.findElement(By.xpath("//input[@id='Username']"));
	driver.findElement(By.xpath("//input[@name='pwd']"));
	driver.findElement(By.xpath("//input[@name='remember']"));
	driver.findElement(By.xpath("//div[@text()='Login ']"));
	driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink ']"));
	
	
	
	
	
	
	
	
	}
}
