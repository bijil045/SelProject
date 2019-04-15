package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HNavigteBrowser {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
//	driver.navigate().to("http://www.gmail.com");
//	driver.navigate().back();
//driver.navigate().forward();
//	driver.navigate().refresh();
	//driver.navigate().refresh();//method chaining
	//driver.manage().deleteAllCookies();
//	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	

}
}
