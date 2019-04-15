package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.description.annotation.AnnotationSource.Empty;

public class QListBoxAssignmnet {
	static{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		String key="webdriver.chrome.driver";
		String value="./Driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
		
	public static void main(String[] args) throws InterruptedException   {
		QListBoxAssignmnet q= new QListBoxAssignmnet();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Rahul%20Menon/Desktop/SelHtml/LstBox1.html");
		WebElement ListBox = driver.findElement(By.id("SLV"));
		Select select= new Select(ListBox);
		List<WebElement> alloptions = select.getOptions();
		ArrayList<String> al= new ArrayList<String>();//1
		for (WebElement options : alloptions) {
			al.add(options.getText());
		}
		System.out.println(al);
	//		Collections.sort(al);
		/*for (String txt : al) {
			System.out.println(txt);
		}
		System.out.println("count  "+alloptions.size());//3
		if(alloptions.size()==0){//3
			System.out.println("list box is empty");
	}
		else{
			System.out.println(" list box is not Empty.");
		}*/
		/*	for(int  i=1;i<al.size();i++){//4
				if(al.get(i-1).compareTo(al.get(i))>0){
				
					System.out.println(" not sorted");
							}else {
				System.out.println("sorted");}
			}*/
			//System.out.println(al+"  -"al.indexOf(alloptions));
		for (WebElement options : alloptions) {//5
			
			System.out.println(options.getText()+" -"+al.indexOf(options.getText()));
		}
		
			
	}
	}
			

