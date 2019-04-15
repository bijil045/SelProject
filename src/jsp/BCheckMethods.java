package jsp;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class BCheckMethods {
	static{
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		String key="webdriver.gecko.driver";
		String value="./Driver/geckodriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) {
		SearchContext s;//a.findElement(),b.a.findElement()
		WebDriver w;//
		JavascriptExecutor js;//a.executeScript(),b.executeAsyncScript()

		TakesScreenshot t;//a.getScreenshotAS()
		WebElement e;
		RemoteWebDriver rd;




		RemoteWebDriver r;
		FirefoxDriver driver= new FirefoxDriver();
		driver.close();
	}
}

