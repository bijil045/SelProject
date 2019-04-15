package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriUploadCvMozilla {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args)  {
		WebDriver driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
	//	driver.findElement(By.id("input_resumeParser")).click();
		//hidden division popup
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		File f= new File("./Cv/job.docx");
	String path = f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);
		String msg=driver.findElement(By.className("success")).getText();
		System.out.println(msg);
		
}
}
