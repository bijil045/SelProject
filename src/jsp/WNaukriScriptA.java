package jsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WNaukriScriptA {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
	//	Set<String> v = driver.getWindowHandles();
	//	System.out.println(v.size());
	Set<String> gAWH = driver.getWindowHandles();
	for (String wh : gAWH) {
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		driver.close();
	}
}
}