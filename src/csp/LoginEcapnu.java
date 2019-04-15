package csp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEcapnu {
	//declaration
	@FindBy(id="username")
		private WebElement uTb;
	@FindBy(name="pwd")
		private WebElement pTb;
	@FindBy(xpath="//div[text()='Login ']")
		private WebElement loBttn;
		//initialization
		public LoginEcapnu(WebDriver driver) {
			/*uTb=driver.findElement(By.id("username"));
			pTb=driver.findElement(By.name("pwd"));
			loBttn=driver.findElement(By.xpath("//div[text()='Login ']"));*/
			PageFactory.initElements(driver, this);
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
