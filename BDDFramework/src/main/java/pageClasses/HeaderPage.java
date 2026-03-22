package pageClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ExplicitWait;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class HeaderPage
{
//	Private Variables: 
	private WebDriver driver;
	private final static String dropdownProfileId = "page-header-user-dropdown";
	private final static String optionLogoutXpath = "//span[text()='Logout']";
	private final static String textBoxEmailXpath = "//input[@placeholder='Email']";
	private final static String optionChangePasswordXpath = "//span[text()='Change Password']";
	private final static String textBoxEnterPasswordXpath = "//input[@placeholder='Enter password']";
	private final static String textBoxConfirmPasswordXpath = "//input[@placeholder='Enter confirm password.']";
	private final static String buttonUpdateXpath = "//button[text()='Update']";
	
	private final static String msgSuccessXpath = "//span[@class='jconfirm-title' and text()='Success!']";
	
	
	@FindBy(xpath = msgSuccessXpath) 
	private WebElement msgSuccess;
	
	
	@FindBy(xpath = buttonUpdateXpath) 
	private WebElement buttonUpdate;
	
	@FindBy(xpath = textBoxConfirmPasswordXpath) 
	private WebElement textBoxConfirmPassword;
	
	@FindBy(xpath = textBoxEnterPasswordXpath) 
	private WebElement textBoxEnterPassword;
	
	@FindBy(xpath = optionChangePasswordXpath) 
	private WebElement optionChangePassword;
	
	@FindBy(xpath = textBoxEmailXpath) 
	private WebElement textBoxEmail;
	
	@FindBy(id = dropdownProfileId) 
	private WebElement dropdownProfile;
	
	@FindBy(xpath = optionLogoutXpath) 
	private WebElement optionLogout;
	
	
	
//	public constructor
	public HeaderPage(WebDriver driver)
	{
		this.driver = driver;
		// initialize variables
		PageFactory.initElements(driver, this);
	}
	
	
//	public methods
	
	public void logout()
	{
		try
		{
			dropdownProfile.click();
			optionLogout.click();
			
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(textBoxEmailXpath)));
			
			ExplicitWait.waitUntilElementVisibleByLoactor(driver, By.xpath(textBoxEmailXpath));

			
			if(textBoxEmail.isDisplayed())
			{
				System.out.println("Logout Successful");
				ExtentReportHelper.logPass("Logout Successful");
			}
			else
			{
				System.out.println("Logout Failed");
				ExtentReportHelper.logFail("Logout Failed");
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception in method 'logout' : "+e.getMessage());
		}
	}
	
//	public boolean changePassword() throws IOException
//	{
//		boolean testResult = false;
//		
//		try
//		{
//			dropdownProfile.click();
//			optionChangePassword.click();
//			ExtentReportHelper.logInfo("Selected change password option");
//			ExplicitWait.waitUntilElementClickableByLoactor(driver, By.xpath(textBoxEnterPasswordXpath));
//			textBoxEnterPassword.sendKeys(PropertyReader.getProperty("Password"));
//			textBoxConfirmPassword.sendKeys(PropertyReader.getProperty("Password"));
//			ExtentReportHelper.logInfo("Entered both passwords");
//			buttonUpdate.click();
//			ExtentReportHelper.logInfo("Clicked update button");
//			
//			if(msgSuccess.isDisplayed())
//			{
////				System.out.println("Password Changed");
//				ExtentReportHelper.logPass("Password Changed");
//				testResult = true;
//			}
//			else
//			{
////				System.out.println("Failed to Change Password");
//				ExtentReportHelper.logFail("Failed to Change Password");
//			}
//			
//			ExplicitWait.waitUntilElementInvisibleByLoactor(driver, By.xpath(msgSuccessXpath));
//		}
//		catch (Exception e)
//		{
////			System.out.println("Exception in method 'changePassword' : "+e.getMessage());
//			ExtentReportHelper.logFail("Exception in method 'changePassword' : "+e.getMessage());
//		}
//		
//		return testResult;
//			
//	}
	
	
	public void selectChangePassword()
	{
		dropdownProfile.click();
		optionChangePassword.click();
		ExtentReportHelper.logInfo("Selected change password option");
	}
	
	public void enterPasswords() throws IOException
	{
		ExplicitWait.waitUntilElementClickableByLoactor(driver, By.xpath(textBoxEnterPasswordXpath));
		textBoxEnterPassword.sendKeys(PropertyReader.getProperty("Password"));
		textBoxConfirmPassword.sendKeys(PropertyReader.getProperty("Password"));
		ExtentReportHelper.logInfo("Entered both passwords");
	}
	
	public void hitUpdateButton()
	{
		buttonUpdate.click();
		ExtentReportHelper.logInfo("Clicked update button");
	}
	
	public void verifyChangePassword()
	{
		if(msgSuccess.isDisplayed())
		{
//			System.out.println("Password Changed");
			ExtentReportHelper.logPass("Password Changed");
		}
		else
		{
//			System.out.println("Failed to Change Password");
			ExtentReportHelper.logFail("Failed to Change Password");
		}
		
		ExplicitWait.waitUntilElementInvisibleByLoactor(driver, By.xpath(msgSuccessXpath));
	}
	
}
