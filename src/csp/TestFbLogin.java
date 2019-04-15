package csp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestFbLogin {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		FbLoginEncap fb= new FbLoginEncap(driver);
		FbHomepage fh= new FbHomepage(driver);
		fb.setUser("bijilvijay045@gmail.com");
		fb.setPass("***");
		fb.clickLogin();
		Thread.sleep(5000);
		fh.clickDrop();
		Thread.sleep(5000);
		fh.clickLogout();
	}
}