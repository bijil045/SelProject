package jsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TLoginScriptCustom$ {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) throws InterruptedException {
	//1.open the browser.
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//2.Enter the url
driver.get("https://demo.actitime.com/login.do");
//verify Login page is dispalyed
//checkpoint 1->Verify Title
String expResult="actiTIME - Login";
System.out.println("ExpResult:+expResult");
String actualResult=driver.getTitle();
System.out.println("ActualResult:+actualResult");
if(actualResult.equals(expResult))
{
	System.out.println("matching:...");
}
else{
	System.out.println("not matching :...");
}
//check point 2->verify elements are present or not
WebElement userName = driver.findElement(By.id("username"));
if(userName.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
WebElement password = driver.findElement(By.name("pwd"));
if(password.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
if(login.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
driver.findElement(By.id("username")).sendKeys("admin");
//4.enter the pass
driver.findElement(By.name("pwd")).sendKeys("manager");
//login
driver.findElement(By.xpath("//div[text()='Login ']")).click();
//Thread.sleep(2000);
String expHpTitle="actiTIME - Enter Time-Track";
System.out.println("expected:"+expHpTitle);
String actHpTitle=driver.getTitle();
System.out.println("actual:"+actHpTitle);
if(actHpTitle.equals(expHpTitle))
{
	System.out.println("matching:...");
}
else{
	System.out.println("not matching :...");
}
}

}
