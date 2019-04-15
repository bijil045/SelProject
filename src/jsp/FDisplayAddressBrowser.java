package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FDisplayAddressBrowser {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
System.out.println(driver);
String wh=driver.getWindowHandle();
System.out.println(wh);

}
}
