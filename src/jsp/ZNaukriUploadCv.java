package jsp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZNaukriUploadCv {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
	//	WebDriverWait wait = new WebDriverWait(driver,10)  ;
	//	wait.until(ExpectedConditions.titleContains("enter"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
	//	driver.findElement(By.id("input_resumeParser")).click();
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		File f= new File("./Cv/job.docx");
	String path = f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		String msg=driver.findElement(By.className("success")).getText();
		System.out.println(msg);
		
}
}