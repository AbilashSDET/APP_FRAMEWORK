package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage {
	
	@Given("User is on logout page")
	public void login()
	{
		System.out.println("Test for valid login is running");
	}
	
	@When("User enters valid credentials for logout")
	public void enter()
	{
		System.out.println("Test for user login is running");
	}
	
	@Then("User should be redirected to the homepage as expected")
	public void quit()
	{
		System.out.println("Test for user redirect is running");
	}


}
