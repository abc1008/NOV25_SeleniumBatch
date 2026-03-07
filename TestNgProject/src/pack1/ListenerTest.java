package pack1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(pack1.ListenerClass.class)
public class ListenerTest
{
	@Test
	public static void testCase6()
	{
		System.out.println("testCase6");
		Assert.fail();
	}
	
	
	@Test
	public static void testCase7()
	{
		System.out.println("testCase7");
	}
	
	@Test
	public static void testCase8()
	{
		System.out.println("testCase8");
	}
	
	@Test
	public static void testCase9()
	{
		System.out.println("testCase9");
	}
	
	@Test
	public static void testCase10()
	{
		System.out.println("testCase10");
	}
	
}
