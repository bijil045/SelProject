package Muharam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssert {

	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	@Test
	public void testLogin1(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String aTitle=driver.getTitle();
		String eTitle="invalid";
	
		SoftAssert s= new SoftAssert();
		s.assertEquals(aTitle, eTitle);
	
		driver.close();
		s.assertAll();//don't write anthing after this
		
	}
	public void testLogin2(){
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String aTitle=driver.getTitle();
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(aTitle, "invalid");
		driver.close();
		
		
	}
}
