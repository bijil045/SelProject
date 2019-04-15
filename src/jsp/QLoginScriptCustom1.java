package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QLoginScriptCustom1 {
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
		driver.get("https://demo.actitime.com/login.do");
		//3.enter the username
		driver.findElement(By.id("username")).sendKeys("admin");
		//4.enter the pass
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//login
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		while(true){
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("logout link is present and is clicked");
				break;
			} catch (Exception e) {
				System.out.println("logout is not present");
			}
		}
		
		driver.close();
	}

}
