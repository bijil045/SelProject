package HN;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HubNod {
@Test
public static void testGrid() throws Exception{
	String ip="192.168.43.117";
	String browser="chrome";
	URL remoteAddress= new URL("http://"+ip+":4444/wd/hub");
	DesiredCapabilities  capabilities= new DesiredCapabilities();
	capabilities.setBrowserName(browser);
WebDriver driver= new RemoteWebDriver(remoteAddress, capabilities);
//driver.close();

}
/*@Test
public static void testGrid2() throws Exception{
	URL remoteAddress= new URL("http://192.168.43.211:4444/wd/hub");
	DesiredCapabilities  capabilities= new DesiredCapabilities();
	capabilities.setBrowserName("chrome");
WebDriver driver= new RemoteWebDriver(remoteAddress, capabilities);
//driver.close();
	
}
@Test
public static void testGrid3() throws Exception{
	URL remoteAddress= new URL("http://192.168.43189:4444/wd/hub");
	DesiredCapabilities  capabilities= new DesiredCapabilities();
	capabilities.setBrowserName("chrome");
WebDriver driver= new RemoteWebDriver(remoteAddress, capabilities);
//driver.close();
	
}*/
}
