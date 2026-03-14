package testSciptClasses;

import java.io.IOException;

import basePack.BaseClass;
import pageClasses.HeaderPage;
import utility.ExtentReportHelper;

public class HeaderTestScipt extends BaseClass
{
	
	public boolean performChangePassword() throws IOException
	{
		boolean isPasswordChanged = false;
		try
		{
			HeaderPage headerPage = new HeaderPage(driver.get());
			isPasswordChanged = headerPage.changePassword();
			
			if(isPasswordChanged == true)
			{
//				System.out.println("Password Changed successfully");
				ExtentReportHelper.logPass("Password Changed successfully");
			}
			else
			{
				System.out.println("Password Changed Failed");
				ExtentReportHelper.logFail("Password Changed Failed");
			}
		}
		catch (Exception e)
		{
//			System.out.println("Exception in method 'performChangePassword' : "+e.getMessage());
			ExtentReportHelper.logFail("Exception in method 'performChangePassword' : "+e.getMessage());
		}
		
		
		return isPasswordChanged;
			
		
		
		
	}

}
