package jsp;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DNaukriCloseQuit {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://www.naukri.com");//entering url without using get
	//String s= driver.getPageSource();
//System.out.println(s);
//	String url= driver.getCurrentUrl();
	//System.out.println(url);
String wh = driver.getWindowHandle();
System.out.println(wh);
 /*Set<String> whs = driver.getWindowHandles();
 System.out.println(whs.size());
 System.out.println(whs);*/
	driver.quit();
 //driver.close();

}
}
