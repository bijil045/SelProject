package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUsingXpath {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/googht.html");
	driver.findElement(By.xpath("./html/body/a")).click();
	}
}
