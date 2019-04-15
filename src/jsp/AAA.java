package jsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAA {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("http://www.naukri.com");
String p = driver.getWindowHandle();
 Set<String> r = driver.getWindowHandles();
 r.remove(p);
 
 for (String w : r) {
	 String t = driver.switchTo().window("r").getTitle();
	 System.out.println(t);
}
 
//driver.switchTo().window("Virtusa Corporation-Google Chrome").close();
//driver.get("");
//WebElement un = driver.findElement(By.id("username"));
//driver.navigate().back();
//un.sendKeys("admin");
//String x = driver.getTitle();
//System.out.println(x);
}
}