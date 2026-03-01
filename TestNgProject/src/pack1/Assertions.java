package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions
{
	
	@Test
	public static void testCase1()
	{
		System.out.println("testCase1");
		
//		Assert.fail("Test Case Failed");  // mark test case as failed
		
		
//		String msgFromUi = driver.findElement(Byte.xpath("")).getText();
		
		String msgFromUi = "Success!";
		
		
//		boolean actualTestResult = msgFromUi.equals("Success!");
		
		
//		Assert.assertEquals(actualTestResult, true, "Success msg did not match with expected value");
		
//		Assert.assertNotEquals(msgFromUi, "Success!");
		
		
//		Assert.assertTrue(msgFromUi.equals("Success!"), "msgFromUi did not match with expected msg.");
		
		Assert.assertFalse(msgFromUi.equals("Success!"));
		
		
		
		System.out.println("After assertion");
		
	}
	
	
	
	
	
	
	
	
	
//	@Test
//	public static void testCase2()
//	{
//		System.out.println("testCase2");
//		
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.fail();
//		System.out.println("After soft assertion");
//		
//		
//		softAssert.assertAll();  // used to apply result of assertion to the test case
//	
//		System.out.println("After assertAll");
//	
//	
//	}
//	

}
