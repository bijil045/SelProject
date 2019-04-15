package qsp;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws AWTException, InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/Demo.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count= allLinks.size();
		for(int i=0;i<count;i++){
			WebElement link = allLinks.get(i);
			String text= link.getText();
			String  url= link.getAttribute("href");
			System.out.println(text+" -->"+url);
		}
	}
}