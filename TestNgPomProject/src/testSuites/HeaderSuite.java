package testSuites;

import java.io.IOException;

import org.testng.annotations.Test;

import basePack.BaseClass;
import testSciptClasses.HeaderTestScipt;

public class HeaderSuite extends BaseClass
{
	
	@Test
	public void tc_123_ChangePasswordTest() throws IOException
	{
		HeaderTestScipt headerTestScipt = new HeaderTestScipt();
		headerTestScipt.performChangePassword();
	}

	
	
	
}
