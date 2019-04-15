package Muharam;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	@DataProvider
	public Object[][] getData(){
		Object[][] data=new Object[2][2];
		data[0][0]="userA";
		data[0][1]=123;
		data[1][0]="userB";
		data[1][1]=456;
		return data;
	}
	@Test(dataProvider="getData")
	public void createUser(String un,int pwd){
		Reporter.log("createUser"+un+" pass "+pwd,true);
	}
}
