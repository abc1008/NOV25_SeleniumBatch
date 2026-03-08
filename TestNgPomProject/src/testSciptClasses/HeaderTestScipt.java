package testSciptClasses;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.HeaderPage;

public class HeaderTestScipt extends BaseClass
{
	
	public void performChangePassword() throws IOException
	{
		HeaderPage headerPage = new HeaderPage(driver);
		headerPage.changePassword();
	}

}
