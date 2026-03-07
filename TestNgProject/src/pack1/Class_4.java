package pack1;

import org.testng.annotations.Test;

public class Class_4
{
	@Test(groups = {"SMOKE","REG"})
	public static void testCase6()
	{
		System.out.println("testCase6");
	}
	
	
	@Test(groups = "REG")
	public static void testCase7()
	{
		System.out.println("testCase7");
	}
	
	@Test(groups = "SMOKE")
	public static void testCase8()
	{
		System.out.println("testCase8");
	}
	
	@Test(groups = "REG")
	public static void testCase9()
	{
		System.out.println("testCase9");
	}
	
	@Test(groups = "SMOKE")
	public static void testCase10()
	{
		System.out.println("testCase10");
	}
	
}
