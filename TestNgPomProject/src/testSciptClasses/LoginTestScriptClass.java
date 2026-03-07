package testSciptClasses;

import pageClasses.LoginPage;

public class LoginTestScriptClass
{
	
	public void performLogin()
	{
//		to call method from page class
		
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}

}
