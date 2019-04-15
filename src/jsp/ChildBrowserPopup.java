package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {//NaukriChildbrowserpopup
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> gAWH = driver.getWindowHandles();
	gAWH.remove(parent);
		for (String wh : gAWH) {
		driver.switchTo().window(wh).close();
		
	}
}
}
