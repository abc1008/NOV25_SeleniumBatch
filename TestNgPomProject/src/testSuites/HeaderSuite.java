package testSuites;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;
import testSciptClasses.HeaderTestScipt;

public class HeaderSuite extends BaseClass
{
	
	@Test
	public void tc_123_ChangePasswordTest() throws IOException
	{
		Assert.assertTrue(new HeaderTestScipt().performChangePassword());
	}
	
//	@Test
//	public void tc_124_ChangePasswordTest() throws IOException
//	{
//		HeaderTestScipt headerTestScipt = new HeaderTestScipt();
//		headerTestScipt.performChangePassword();
//	}
//	
//	
//	@Test
//	public void tc_125_ChangePasswordTest() throws IOException
//	{
//		HeaderTestScipt headerTestScipt = new HeaderTestScipt();
//		headerTestScipt.performChangePassword();
//	}

	
	
	
}
