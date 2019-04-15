package jsp;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;
public class AOpenChrome {
	static{
				//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) throws AWTException {
	ChromeDriver driver = new ChromeDriver();
//Robot r= new Robot();
//r.keyPress(KeyEvent.VK_CONTROL);

	driver.close();
}
}
