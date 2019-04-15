package jsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EDisplayBrowserHtml {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.google.com");
	//String s= driver.getPageSource();
	//System.out.println(s);
	String url= driver.getCurrentUrl();
	System.out.println(url);
Dimension v = driver.manage().window().getSize();
System.out.println(v);
	//driver.quit();

}
}
