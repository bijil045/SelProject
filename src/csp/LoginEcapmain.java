package csp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LoginEcapmain {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com");
		LoginEcapnu lu= new LoginEcapnu(driver);
		lu.setUser("xyz");
		lu.setPass("abc");
		lu.clickLogin();
		Thread.sleep(2000);
		lu.setUser("admin");
		lu.setPass("manager");
		lu.clickLogin();
	}
}
