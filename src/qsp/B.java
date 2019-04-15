package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
		static{

			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			String key="webdriver.chrome.driver";
			String value="./Driver/chromedriver.exe";
			System.setProperty(key, value);
		}
		public static void main(String[] args)  {
			WebDriver driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.seleniumhq.org/download/");
			//driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
			List<WebElement> w = driver.findElements(By.xpath("//z"));
			System.out.println(w.size());
}
}