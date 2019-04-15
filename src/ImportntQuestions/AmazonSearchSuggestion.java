package ImportntQuestions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearchSuggestion {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");    
		String[] s={"a","u","t","o","m","a","t","i","o","n"};
		for(int i=0;i<=s.length-1;i++){
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s[i]);
			List<WebElement> l = driver.findElements(By.xpath("//div[contains(@id,'issDiv')]"));
			for (WebElement sg : l) {
				System.out.println(sg.getText());
			}
			Thread.sleep(10000);
		}

	}
}