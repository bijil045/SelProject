package qsp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MFlipKartSearchKey {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3][@class='_1va75j']")).click();
		List<WebElement> prices = driver.findElements(By.xpath("//div[contains(@class,'NK')]"));
		//String xp="//div[starts-with(text(),'Apple iphone')]/../../div[2]/div[1]//div[1]/div[1]";
		System.out.println(	prices.size());
		ArrayList<Integer> al= new ArrayList<Integer>();
	/*TreeSet<Integer> ts= new TreeSet<Integer>();
		System.out.println(ts.first());
		System.out.println(ts.last()); tree set sorting */
		for(int i=1;i<prices.size();i++)
		{
			String t1=prices.get(i-1).getText().substring(1).replaceAll(",", "");
			al.add(Integer.parseInt(t1));
		}
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.get(0));//lowest
		System.out.println(al.get(al.size()-1));//Highest
	}
}