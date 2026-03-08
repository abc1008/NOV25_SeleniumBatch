package testSuites;

import java.io.IOException;
import org.testng.annotations.Test;

import testSciptClasses.LoginTestScriptClass;

public class LoginTestSuite
{
 

	@Test
	public void tc_123_loginTest() throws InterruptedException, IOException
	{
		LoginTestScriptClass testScriptClass = new LoginTestScriptClass();
		testScriptClass.performLogin();
		
	}
	

	
	
}
