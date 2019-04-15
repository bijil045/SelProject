package generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Result.class)
public class DemoA {
@Test
public void createUser(){
	Reporter.log("create a user",true);
	Assert.fail();
}
@Test
public void deleteUser(){
	Reporter.log("delete a user",true);
}
}
