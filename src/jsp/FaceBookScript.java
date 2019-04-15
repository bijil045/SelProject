package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookScript {
static{
		
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
	String value="./Driver/chromedriver.exe";
	System.setProperty(key, value);
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
String expResult="Facebook – log in or sign up";
System.out.println("ExpResult:"+expResult);
String actualResult=driver.getTitle();
System.out.println("ActualResult:"+actualResult);
if(actualResult.equals(expResult))
{
	System.out.println("matching:...");
}
else{
	System.out.println("not matching :...");
}
WebElement email = driver.findElement(By.id("email"));
if(email.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
WebElement password = driver.findElement(By.name("pass"));
if(password.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
if(login.isDisplayed()){
	System.out.println("pass");
}
else{
	System.out.println("failed");
}
}

}
