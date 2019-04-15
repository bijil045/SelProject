package csp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginEncap {
	//declaration
	@FindBy(id="email")
	private WebElement eMail;
	@FindBy(name="pass")
	private WebElement pTb;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loBttn;
	//initialization
	public FbLoginEncap(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setUser(String un){
		eMail.sendKeys(un);
	}
	public void setPass(String pass){
		pTb.sendKeys(pass);
	}
	public void clickLogin(){
		loBttn.click();
	}
}
