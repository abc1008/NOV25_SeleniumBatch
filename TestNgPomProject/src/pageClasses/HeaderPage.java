package pageClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.PropertyResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ExplicitWait;
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
		dropdownProfile.click();
		optionLogout.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(textBoxEmailXpath)));
		
		ExplicitWait.waitUntilElementVisibleByLoactor(driver, By.xpath(textBoxEmailXpath));

		
		if(textBoxEmail.isDisplayed())
		{
			System.out.println("Logout Successful");
		}
		else
		{
			System.out.println("Logout Failed");
		}
	}
	
	public void changePassword() throws IOException
	{
		dropdownProfile.click();
		optionChangePassword.click();
		ExplicitWait.waitUntilElementClickableByLoactor(driver, By.xpath(textBoxEnterPasswordXpath));
		textBoxEnterPassword.sendKeys(PropertyReader.getProperty("Password"));
		textBoxConfirmPassword.sendKeys(PropertyReader.getProperty("Password"));
		buttonUpdate.click();
		
		if(msgSuccess.isDisplayed())
		{
			System.out.println("Password Changed");
		}
		else
		{
			System.out.println("Failed to Change Password");
		}
		
		ExplicitWait.waitUntilElementInvisibleByLoactor(driver, By.xpath(msgSuccessXpath));
			
	}
	
}
