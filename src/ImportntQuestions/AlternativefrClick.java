package ImportntQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlternativefrClick {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("bijilvijay045@gmail.com");
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//span[text()='Next']"));
		Actions actions= new Actions(driver);
		//actions.click(e).perform();
		//actions.moveToElement(e).click().perform();*/
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('loginButton').click();");
	}
}
