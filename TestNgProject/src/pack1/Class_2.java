package pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class_2
{
	
//	@Test(priority = 100)
//	public static void testCase4()
//	{
//		System.out.println("testCase4");
//	}
//	
//	@Test
//	public static void testCase5()
//	{
//		System.out.println("testCase5");
//	}
//	
//	
//	@Test
//	public static void testCase6()
//	{
//		System.out.println("testCase6");
//	}
//	
	
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

}
