package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions
{
	
	WebDriver driver;
	
	@Given("user is on login page")
	public void givenUserIsOnLoginPage()
	{
//		logic for step
		System.out.println("givenUserIsOnLoginPage");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://devsite.testometer.co.in/login");
		
	}
	
	
	@When("user enters valid credentials")
	public void enterValidCredentials()
	{
//		logic for step
		System.out.println("enterValidCredentials");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("adityaganjkar88@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcd@1234");
	}
	
	
	@And("hits login button")
	public void hitLoginButton() throws InterruptedException
	{
//		logic for step
		System.out.println("hitLoginButton");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	
	@Then("user should be logged in successfully")
	public void verifyLogin()
	{
//		logic for step
		System.out.println("verifyLogin");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page-header-user-dropdown")));
		
		WebElement dropdownProfile = driver.findElement(By.id("page-header-user-dropdown"));
		
		if(dropdownProfile.isDisplayed())
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Login Failed");
		}
		
	}
	

}
