package ImportntQuestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import qsp.QListBoxAssignmnet;

public class LstBx {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException   {
		QListBoxAssignmnet q= new QListBoxAssignmnet();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/snglelistbox.html");
		WebElement ltbx = driver.findElement(By.id("SLV"));
		Select s= new Select(ltbx);
		s.selectByIndex(1);
		
			//	single or  multiselect
		//if(s.isMultiple()){
			
			s.deselectAll();
		/*}
		else{
			System.out.println("single");
		}*/
		
}
}