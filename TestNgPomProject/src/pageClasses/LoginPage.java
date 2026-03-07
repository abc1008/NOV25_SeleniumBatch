package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	
//	Private Variables: 
	WebDriver driver;
	
	private final static String textBoxEmailXpath = "//input[@placeholder='Email']";
	private final static String textBoxPasswordXpath = "//input[@placeholder='Password']";
	private final static String buttonLoginXpath = "//button[@type='submit']";
	
	
	@FindBy(xpath = textBoxEmailXpath) 
	private WebElement textBoxEmail;
	
	@FindBy(xpath = textBoxPasswordXpath) 
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginXpath) 
	private WebElement buttonLogin;
	
	
//	public constructor
	public LoginPage()
	{
		// initialize variables
		PageFactory.initElements(driver, this);
	}
	
	
//	public methods
	
	public void login()
	{
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");
		textBoxPassword.sendKeys("abcd@1234");
		buttonLogin.click();
	}
	

}
