package ImportntQuestions;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Checkbox {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		 driver.get("file:///C:/Users/Rahul%20Menon/Desktop/SelHtml/chkbox.html"); 
 		 driver.findElement(By.xpath("//label[text()='housingmoves']")).click();
 		
}
}