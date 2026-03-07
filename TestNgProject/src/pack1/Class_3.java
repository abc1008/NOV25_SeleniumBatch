package pack1;

import org.testng.annotations.Test;

public class Class_3
{
	@Test(groups = "REG")
	public static void testCase1()
	{
		System.out.println("testCase1");
	}
	
	
	@Test(groups = "SMOKE")
	public static void testCase2()
	{
		System.out.println("testCase2");
	}
	
	@Test(groups = "REG")
	public static void testCase3()
	{
		System.out.println("testCase3");
	}
	
	@Test(groups = "SMOKE")
	public static void testCase4()
	{
		System.out.println("testCase4");
	}
	
	@Test(groups = "REG")
	public static void testCase5()
	{
		System.out.println("testCase5");
	}
	
}
