package basePack;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pageClasses.HeaderPage;
import testSciptClasses.LoginTestScriptClass;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class BaseClass
{
//	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
//	@BeforeMethod
//	public void login() throws InterruptedException, IOException 
//	{
//		ExtentReportHelper.startTest("Test Case 1");
//		LoginTestScriptClass loginTestScriptClass = new LoginTestScriptClass();
//		loginTestScriptClass.performLogin();
//		
//	}
	
	
	@Parameters("browser")
	@BeforeMethod
	public void initBrowser(String browser) throws IOException, InterruptedException
	{
//		 String browserName = PropertyReader.getProperty("Browser");
		
		
		 LocalDateTime localDate = LocalDateTime.now();
		 DateTimeFormatter pattern = DateTimeFormatter.ofPattern("ddMMyyhhmmss");
		 String formattedDate = "_" + localDate.format(pattern);
		
		 if(browser.equalsIgnoreCase("CHROME"))
		 {
			 driver.set(new  ChromeDriver());
		 }
		 else if(browser.equalsIgnoreCase("EDGE"))
		 {
			 driver.set(new  EdgeDriver());
		 }

		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get().manage().window().maximize();
		driver.get().get(PropertyReader.getProperty("TestSiteUrl"));
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(formattedDate);
	
	}
	
	@AfterMethod
	public void logout()
	{
		HeaderPage headerPage = new HeaderPage(driver.get());
		headerPage.logout();
		ExtentReportHelper.endTest();
		driver.get().quit();
		
	}
	
//	@AfterSuite
//	public void closeBrowser()
//	{
//
//	}
	

}
