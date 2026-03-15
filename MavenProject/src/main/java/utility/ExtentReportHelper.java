package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportHelper
{
	private static ExtentReports extentReports;
	private static  ExtentTest extentTest;
	
	public ExtentReportHelper(String dateTimeStamp)
	{
	    extentReports = new ExtentReports(); // main class
		String path = "D:\\TRAININGS\\NOV_25_BATCH\\Reports\\reportFile"+dateTimeStamp+".html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		extentReports.attachReporter(spark); // to attach the report type to main report object
	}
	
	public static void startTest(String testCaseName)
	{
		extentTest = extentReports.createTest(testCaseName);  // create test case in the report or start point of test case
	}
	
	public static void logPass(String message)
	{
		extentTest.log(Status.PASS, message);
	}
	
	public static void logFail(String message)
	{
		extentTest.log(Status.FAIL, message);
	}
	
	public static void logInfo(String message)
	{
		extentTest.log(Status.INFO, message);
	}
	
	public static void endTest()
	{
		extentReports.flush();    // end the report generation and created the .html file
	}

}
