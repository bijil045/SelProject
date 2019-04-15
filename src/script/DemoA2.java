package script;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generics.Result;
@Listeners(Result.class)
public class DemoA2 {
	@Test
	public void testA(){
		Reporter.log("testA",true);
		Assert.fail();
	}
}
