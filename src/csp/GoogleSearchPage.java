package csp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	//declaration
	
		@FindBy(xpath="//a")
			private List<WebElement> allLinks;
			//initialization
			public GoogleSearchPage(WebDriver driver) {
				
				PageFactory.initElements(driver, this);
			}
			
			public void printLinkCount(){
				int count=allLinks.size();
				System.out.println(count);
			}
}
