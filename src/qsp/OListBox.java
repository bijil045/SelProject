package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OListBox {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/SelHtml/LstBox1.html");
		WebElement ListBox = driver.findElement(By.id("SLV"));
		Select select= new Select(ListBox);
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		 List<WebElement> a = select.getAllSelectedOptions();
		System.out.println(a.size());
		WebElement b = select.getFirstSelectedOption();
		System.out.println(b.getText());
		List<WebElement> c = select.getOptions();
		
		System.out.println(c.size());
		/*if(select .isMultiple()){
			System.out.println("deselect");
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Dosa");
			select.deselectAll();
		}
		else{
			System.out.println("Can't use deselct on single select listbox");
		}*/
	}
}