package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SimpleExtentReport
{
	
	public static void main(String[] args)
	{
		ExtentReports extentReports = new ExtentReports(); // main class
		
		String path = "D:\\TRAININGS\\NOV_25_BATCH\\Reports\\reportFle.hrml";
		
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		extentReports.attachReporter(spark); // to attach the report type to main report object
		
		
	 	ExtentTest extentTest = extentReports.createTest("MyFirstTest");  // create test case in the report or start point of test case
		
	 	extentTest.log(Status.PASS, "Test Case Pass");
	 	extentTest.log(Status.FAIL, "Test Case Fail");
	 	extentTest.log(Status.INFO, "Test Case Info");
		
		 
		extentReports.flush(); // end the report generation and created the .html file
	}

}
