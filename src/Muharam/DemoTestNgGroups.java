package Muharam;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNgGroups {
	@BeforeClass(alwaysRun=true)//run this method irrespective of group
	public void login(){
		Reporter.log("login",true);
			}
	@Test(priority=1,groups={"user","smoke"},invocationCount=2)
	public void createuser(){Reporter.log("createUser",true);}
	@Test(priority=1,groups={"user"},enabled=false)//never run this method
	public void edituser(){Reporter.log("editUser",true);}
	@Test(priority=1,groups={"user"})
	public void deleteuser(){Reporter.log("deleteUser",true);}
	@Test(priority=1,groups={"product","smoke"})//method can added to multiple groups
	public void createProduct(){Reporter.log("createProduct",true);}
	@Test(priority=1,groups={"product"})
	public void deleteProduct(){Reporter.log("deleteProduct",true);}
	
}
