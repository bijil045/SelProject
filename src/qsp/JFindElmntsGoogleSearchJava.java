package qsp;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JFindElmntsGoogleSearchJava {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("java");
	Thread.sleep(3000);
	 List<WebElement> allLinks = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
	//Thread.sleep(3000);
	// int count=allLinks.size();
	// System.out.println(count);
	 for (WebElement links : allLinks) {
		String p = links.getText();
		System.out.println(p);
	}
//allLinks.get(0).click();
	}
}
