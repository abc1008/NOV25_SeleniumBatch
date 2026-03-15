package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testSciptClasses.LoginTestScriptClass;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		try
		{
			String testCaseName = result.getName();
			ExtentReportHelper.startTest(testCaseName);
			LoginTestScriptClass loginTestScriptClass = new LoginTestScriptClass();
			loginTestScriptClass.performLogin();
		}
		catch (InterruptedException | IOException e)
		{
			ExtentReportHelper.logFail("Exception in method onTestStart : "+e.getMessage());
		}

	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("onTestFailure");
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("onFinish");
	}

}
