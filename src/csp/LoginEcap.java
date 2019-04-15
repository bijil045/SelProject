package csp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LoginEcap {
	//declaration
	private WebElement uTb;
	private WebElement pTb;
	private WebElement loBttn;
	//initialization
	public LoginEcap(WebDriver driver) {
		uTb=driver.findElement(By.id("username"));
		pTb=driver.findElement(By.name("pwd"));
		loBttn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	public void setUser(String un){
		uTb.sendKeys(un);
	}
	public void setPass(String pass){
		pTb.sendKeys(pass);
	}
	public void clickLogin(){
		loBttn.click();
	}
}
