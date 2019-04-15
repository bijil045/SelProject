package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivPopup {//calenderpopup
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		//1.open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//2.Enter the url
		driver.get("https://retail.starhealth.in/renewal");
		
		driver.findElement(By.id("nqame2")).sendKeys("bij123");
		
	driver.findElement(By.id("dtDOB")).click();
	//driver.findElement(By.linkText("8")).click();
	//driver.findElement(By.xpath("//li[@class='currentdate']/a")).click();
	driver.findElement(By.cssSelector("li.currentdate>a")).click();
	driver.findElement(By.id("proceed")).click();
}
}
