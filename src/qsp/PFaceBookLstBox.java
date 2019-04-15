package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PFaceBookLstBox {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		WebElement listbox = driver.findElement(By.id("month"));
		Select select = new Select(listbox);
		 
		List<WebElement> allOptions = select.getOptions();
		for(int i=1;i<allOptions.size();i++){
		WebElement options = allOptions.get(i);
		//System.out.println(options);
		String text = options.getText();
		System.out.println(text);
		}
		for (WebElement option : allOptions) {
			System.out.println(option.getText());
		}
		driver.close();
}
}