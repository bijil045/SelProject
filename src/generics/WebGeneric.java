package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebGeneric {
public static void waitForvisibilityAndClick(WebDriver driver,long time,WebElement element) {
	WebDriverWait wait= new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
}
}
