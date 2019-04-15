package ImportntQuestions;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Multilnk {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/SelHtml/Multilink.html");
		List<WebElement> al = driver.findElements(By.tagName("a"));
		for (WebElement wl : al) {
			if(wl.getText().equals("Actitime")){

				wl.click();
			}
		}	
	}
}