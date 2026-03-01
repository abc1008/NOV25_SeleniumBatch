package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_1
{
	@Test(priority = 100)
	public static void testCase1()
	{
		System.out.println("testCase1");
	}
	
	
//	@Test(priority = 8)
//	public static void testCase2()
//	{
//		System.out.println("testCase2");
//	}
//	
//	@Test(priority = 100, invocationCount = 5)
//	public static void testCase3()
//	{
//		System.out.println("testCase3");
//	}
	


	
	
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
