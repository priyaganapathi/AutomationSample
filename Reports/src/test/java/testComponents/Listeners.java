package testComponents;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testNGListeners.extentReporterNG;

public class Listeners implements ITestListener{
	ExtentTest Test;
	ExtentReports extent=extentReporterNG.getReport();
	
	public void onTestStart(ITestResult result)
	{
		Test=extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		Test.log(Status.PASS,"Test Passed");
	}
	public void onTestFailure(ITestResult result)
	{
		Test.fail(result.getThrowable());
	}
	
}

	
	


