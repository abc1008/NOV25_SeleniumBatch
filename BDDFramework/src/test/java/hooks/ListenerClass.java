package hooks;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import pageClasses.LoginPage;
import utility.ExtentReportHelper;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		try
		{
			String testCaseName = result.getName();
			ExtentReportHelper.startTest(testCaseName);
			LoginPage loginPage = new LoginPage(Hooks.driverLocal.get());

			loginPage.login();
		}
		catch (IOException e)
		{
			ExtentReportHelper.logFail("Exception in method onTestStart "+e.getMessage());
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
