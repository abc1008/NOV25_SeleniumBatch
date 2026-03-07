package pack1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(pack1.ListenerClass.class)
public class ListenerTestWithAnnotations
{
	@Test
	public static void loginTest()
	{
		System.out.println("loginTest");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Pre Conditions - beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Post Conditions - afterMethod");
	}
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	


}
