package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generics.Utility;
import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class ScriptLess {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.actitime.com");
		for(int i=0;i<=3;i++){
		String k1=	Utility.getXLData("./input/data.xlsx", "Keyss", i, 0);
		String k2=	Utility.getXLData("./input/data.xlsx", "Keyss", i, 1);
		String k3=	Utility.getXLData("./input/data.xlsx", "Keyss", i, 2);
			System.out.println("k1"+k1);
			System.out.println("k2"+k2);
			System.out.println("k3"+k3);
			String xv=Utility.getPropertyValue("./input/elements.properties", k2);
			if(k1.equals("enter"))
					{
				driver.findElement(By.xpath(xv)).sendKeys(k3);
			}else if(k1.equals("click")){
				driver.findElement(By.xpath(xv)).click();
		}else{
			System.out.println("invalid k1");
		}
			Thread.sleep(4000);
		}
		driver.close();
	}	
				
		
}
