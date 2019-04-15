package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KFndElemntsTrivago {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("http://www.trivago.in");
	driver.findElement(By.name("sQuery")).sendKeys("B");
	//Thread.sleep(1000);
	 List<WebElement> allLinks = driver.findElements(By.xpath("//mark[contains(text(),'B')]"));
	// Thread.sleep(1000);
	 int count=allLinks.size();
	 System.out.println(count);
	 for (WebElement links : allLinks) {
		links.getText();
		
	}
allLinks.get(0).click();
	}
}
