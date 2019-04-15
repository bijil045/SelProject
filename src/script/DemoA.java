package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Page.LoginPage;
import generics.BaseTest;
import generics.Result;
import generics.Utility;

@Listeners(Result.class)
public class DemoA extends BaseTest{
	@Test
	public void testA() throws InterruptedException{
		String un=Utility.getXLData(DATA_PATH,"DemoA",1,0);
		String pw=Utility.getXLData(DATA_PATH, "DemoA", 1,1);
		
		LoginPage l=new LoginPage(driver);
		//Thread.sleep(5000);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
	}
	//@Test
	//public void testB(){
	//	Reporter.log("testB",true);
	//}
}
