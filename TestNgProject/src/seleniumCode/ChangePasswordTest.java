package seleniumCode;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utility.PropertyReader;

public class ChangePasswordTest
{
	WebDriver driver; 
	
	@BeforeSuite
	public void initBrowser() throws IOException, InterruptedException
	{
		 String browserName = PropertyReader.getProperty("Browser");
		 
		 if(browserName.equalsIgnoreCase("CHROME"))
		 {
			 driver  = new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("EDGE"));
		 {
			 driver  = new EdgeDriver();
		 }

		
		driver.manage().window().maximize();
		driver.get(PropertyReader.getProperty("TestSiteUrl"));
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login Successful");
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logout Successful");
	}
	
	@Test
	public void changePasswordTest() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Password updated");
	}
	
	
}
