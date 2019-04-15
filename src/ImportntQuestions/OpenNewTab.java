package ImportntQuestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");    
         Robot r = new Robot();        
         r.keyPress(KeyEvent.VK_CONTROL);
         r.keyPress(KeyEvent.VK_T);
         r.keyRelease(KeyEvent.VK_CONTROL);
         r.keyRelease(KeyEvent.VK_T);
         Thread.sleep(10000);
      Set<String> wh = driver.getWindowHandles();
      ArrayList<String> a=new ArrayList<String>(wh);
      driver.switchTo().window(a.get(1));
       driver.get("http://www.facebook.com");
}
}