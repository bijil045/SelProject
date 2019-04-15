package Automtn;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoC {
	@BeforeClass
	public void openApp(){
		Reporter.log("open app",true);
	}
	@AfterClass
	public void closeApp(){
		Reporter.log("close app",true);
	}
	@BeforeMethod
	public void login(){
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout(){
		Reporter.log("logout",true);
	}
	@Test(priority=-1)
	public void createUser(){
		Reporter.log("create user",true);
			}
	@Test(invocationCount=3)
	public void editUser(){
		Reporter.log("edit user",true);
			}
	@Test(priority=1,invocationCount=2)
	public void deleteUser(){
		Reporter.log("delete user",true);
			}
}
