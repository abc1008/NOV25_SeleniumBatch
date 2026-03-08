package basePack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageClasses.HeaderPage;
import testSciptClasses.LoginTestScriptClass;
import utility.PropertyReader;

public class BaseClass
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void initBrowser() throws IOException, InterruptedException
	{
		 String browserName = PropertyReader.getProperty("Browser");
		 if(browserName.equalsIgnoreCase("CHROME"))
		 {
			 driver  = new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("EDGE"))
		 {
			 driver  = new EdgeDriver();
		 }

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(PropertyReader.getProperty("TestSiteUrl"));
		
		
		LoginTestScriptClass loginTestScriptClass = new LoginTestScriptClass();
		loginTestScriptClass.performLogin();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.logout();
		driver.quit();
	}
	
	
//	@BeforeMethod
//	public void login()
//	{
//		System.out.println("Login Successful");
//	}
//	
	
//	@AfterMethod
//	public void logout()
//	{
//		System.out.println("Logout Successful");
//	}
}
