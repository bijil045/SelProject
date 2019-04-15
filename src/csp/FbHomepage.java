package csp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FbHomepage {
	//declaration
	@FindBy(xpath="//span[text()='Log Out']/../..")
	private WebElement logOut;
	@FindBy(id="pageLoginAnchor")
	private WebElement fbDrp;
	//intialisation
	public FbHomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilisation
	public void clickLogout(){
		logOut.click();
	}
	public void clickDrop(){
		fbDrp.click();
	}
}
