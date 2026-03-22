package stepDefinitions;

import java.io.IOException;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.HeaderPage;

public class ChangePasswordStepDefinitions
{
	HeaderPage headerPage = new HeaderPage(Hooks.driverLocal.get());
	
	@Given("user selects change password opion from profile icon")
	public void selectChangePassword()
	{
//		logic for step
		System.out.println("givenUserIsOnLoginPage");
		headerPage.selectChangePassword();
	}
	
	
	@When("user enters valid passwords")
	public void enterValidPasswords() throws IOException
	{
//		logic for step
		System.out.println("enterValidPasswords");
		headerPage.enterPasswords();
		
	}
	
	
	@And("hits update button")
	public void hitLoginButton()
	{
//		logic for step
		System.out.println("hitLoginButton");
		headerPage.hitUpdateButton();
	}
	
	
	@Then("password should be changed successfully")
	public void verifyLogin()
	{
//		logic for step
		System.out.println("verifyLogin");
		headerPage.verifyChangePassword();

		
	}
	

}
