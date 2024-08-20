package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("User is login page");			
	}

	@When("the user enters username and password")
	public void the_user_enters_username_and_password() {
	    System.out.println("User enters username and password");
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		
		System.out.println("User clicks on Login Button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("User Navigated to the Home Page");
	}


}
