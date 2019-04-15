package jsp;
import java.util.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ITypeCsting {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws IOException {
		Date d= new Date();
		String v=d.toString();
		String v2=v.replaceAll(":","-");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		TakesScreenshot t= (TakesScreenshot)driver;
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+v2+"a.png";
		File destFile= new File(path);//png-portable network graphics
		FileUtils.copyFile(srcFile, destFile);
		driver.close();



	}
}
