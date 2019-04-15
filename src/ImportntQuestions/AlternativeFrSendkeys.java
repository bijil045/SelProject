package ImportntQuestions;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlternativeFrSendkeys {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("sdf");
 JavascriptExecutor j= (JavascriptExecutor)driver;
 j.executeScript("document.getElementById('identifierId').value='sakthi';");
//j.executeScript(document))		
		
	
}
}
