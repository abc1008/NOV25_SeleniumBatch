package testSciptClasses;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.LoginPage;

public class LoginTestScriptClass extends BaseClass
{
	
	public void performLogin() throws InterruptedException, IOException
	{
//		to call method from page class
		
		LoginPage loginPage = new LoginPage(driver);  // calling constructor
		loginPage.login();
	}

}
