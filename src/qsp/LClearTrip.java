package qsp;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class LClearTrip {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(55, TimeUnit.SECONDS);
		driver.get("http://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Bang");
		driver.findElement(By.xpath("//a[contains(text(),'BLR')]")).click();
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		driver.findElement(By.xpath("//a[contains(text(),'GOI')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();
		driver.findElement(By.id("SearchBtn")).click();
		List<WebElement> allPrice = driver.findElements(By.xpath("//th[@class='price']"));
		for(int i=1;i<allPrice.size();i++)
		 {
			String t1=allPrice.get(i-1).getText().substring(1).replaceAll(",", "");
			String t2=allPrice.get(i).getText().substring(1).replaceAll(",", "");
					int v1= Integer.parseInt(t1);
					int v2=Integer.parseInt(t2);
					System.out.println("Comparing .."+v1+"  with "+v2);
			if(v1<=v2){
				System.out.println("pass...");
			}
			else{
				System.out.println("fail...");
			}
		}
		
	}
}