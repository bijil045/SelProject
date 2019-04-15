package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KUsingXpathA {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/xpthhtm.html");
	//driver.findElement(By.xpath("./html/body/a")).click();
	driver.findElement(By.xpath("//input"));//A1B1A2B2C1
	driver.findElement(By.xpath("//input[@type='text'"));//A1B1	
	driver.findElement(By.xpath("//input[@value='A'"));//A1A2
	driver.findElement(By.xpath("//input[@type='button'and @value='B']"));//B2
	driver.findElement(By.xpath("//input[@type='checkbox']"));//C1
	
	driver.findElement(By.xpath("//input[@type='text'or@type='button']"));//A1B1A2B2
	driver.findElement(By.xpath("//input[@value='A'or@value='B']"));
	driver.findElement(By.xpath("//input[not@type='checkbox']"));
	driver.findElement(By.xpath("//input[@value]"));
	
	
	
	}
}
