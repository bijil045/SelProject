package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Result implements ITestListener {
static int passCount=0,failCount=0,skipCount=0;
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getName();
		Reporter.log("test"+name+" is pass", true);
		passCount++;
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getName();
		Reporter.log("test"+name+" is fail", true);
		failCount++;
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getName();
		Reporter.log("test"+name+" is skipped", true);
		skipCount++;
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("pass:"+passCount,true);
		Reporter.log("pass:"+failCount,true);
		Reporter.log("pass:"+skipCount,true);
		Utility.writeResultToXL("./result/Summary.xlsx", passCount, failCount, skipCount);
		
	}
 
}
