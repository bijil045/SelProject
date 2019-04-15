package ImportntQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAttributeValue {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
String s = driver.findElement(By.id("email")).getAttribute("id");
		
		System.out.println(s);
}
}
