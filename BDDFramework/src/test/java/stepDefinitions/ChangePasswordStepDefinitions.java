package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangePasswordStepDefinitions
{
	
	@Given("user selects change password opion from profile icon")
	public void selectChangePassword()
	{
//		logic for step
		System.out.println("givenUserIsOnLoginPage");
//		headerPage.selectChangePassword();
	}
	
	
	@When("user enters valid passwords")
	public void enterValidPasswords()
	{
//		logic for step
		System.out.println("enterValidPasswords");
	}
	
	
	@And("hits update button")
	public void hitLoginButton()
	{
//		logic for step
		System.out.println("hitLoginButton");
	}
	
	
	@Then("password should be changed successfully")
	public void verifyLogin()
	{
//		logic for step
		System.out.println("verifyLogin");

		
	}
	

}
