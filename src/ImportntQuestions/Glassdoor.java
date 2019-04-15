package ImportntQuestions;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Glassdoor {
	static{

		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException, AWTException   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.glassdoor.co.in");    
		driver.findElement(By.xpath("(//span[text()='Companies'])[1]")).click();
		driver.findElement(By.id("LocationSearch")).sendKeys("chennai");
		driver.findElement(By.id("HeroSearchButton")).submit();

		Thread.sleep(2000);
		Set<String> wh = driver.getWindowHandles();
	
		ArrayList<String> a= new ArrayList<String>(wh);
	/*Iterator<String> it= wh.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
		}*/
		driver.switchTo().window(a.get(1));
	/*	List<WebElement> c = driver.findElements(By.xpath("//a[contains(@class,'tightAll')]"));
		for (WebElement C : c) {
			System.out.println(C.getText());
		}

		List<WebElement> o = driver.findElements(By.xpath("//span[@class='url']"));
		for (WebElement O : o) {
			System.out.println(O.getText());
		}
		List<WebElement> g = driver.findElements(By.xpath("//a[contains(@class,'reviews')]/span[@class='num h2']"));
		for (WebElement G : g) {
			System.out.println(G.getText());
		}*/
	/*			List<WebElement> i = driver.findElements(By.xpath("//span[contains(@class,'Sm h2')]"));
		for (WebElement I : i) {
			System.out.println(I.getAttribute("innerText"));
		}*/
		List<WebElement> i = driver.findElements(By.xpath("//div[@class='ratingsSummary cf']//span[@class='bigRating strong margRtSm h2']"));
		for (WebElement I : i) {
			System.out.println(I.getAttribute("innerText"));
			//System.out.println(I.getText());
		}
		//WebElement x = driver.findElement(By.xpath("//span[text()='3.6']"));
		//System.out.println(x.getAttribute("innerText"));
	}
}
