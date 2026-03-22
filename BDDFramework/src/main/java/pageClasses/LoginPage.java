package pageClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ExplicitWait;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class LoginPage
{
	
//	Private Variables: 
	private WebDriver driver;
	private final static String textBoxEmailXpath = "//input[@placeholder='Email']";
	private final static String textBoxPasswordXpath = "//input[@placeholder='Password']";
	private final static String buttonLoginXpath = "//button[@type='submit']";
	private final static String dropdownProfileId = "page-header-user-dropdown";
	
	
	@FindBy(id = dropdownProfileId) 
	private WebElement dropdownProfile;
	
	@FindBy(xpath = textBoxEmailXpath) 
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginXpath) 
	private WebElement buttonLogin;
	
	
//	public constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		// initialize variables
		PageFactory.initElements(driver, this);
	}
	
	
//	public methods
	
	public void login() throws IOException
	{
		textBoxEmail.sendKeys(PropertyReader.getProperty("UserId"));
		textBoxPassword.sendKeys(PropertyReader.getProperty("Password"));
		buttonLogin.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(dropdownProfileId)));
		
		ExplicitWait.waitUntilElementVisibleByLoactor(driver, By.id(dropdownProfileId));
		
		
		if(dropdownProfile.isDisplayed())
		{
//			System.out.println("Login Successful");
			ExtentReportHelper.logPass("Login Successful");
		}
		else
		{
//			System.out.println("Login Failed");
			ExtentReportHelper.logPass("Login Failed");
		}
	}
	

}
