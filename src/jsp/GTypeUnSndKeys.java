package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTypeUnSndKeys {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.gmail.com");
WebElement e = driver.switchTo().activeElement();

	e.sendKeys("bijil");

}
}
