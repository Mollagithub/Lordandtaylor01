package com.lordandTaylor.testsripts.cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends StepBase{


	@When("^Enter \"(.*?)\" as emaill address$")
	public void enter_as_emaill_address(String email) throws Throwable {
		lordandTaylor.loginPage().EmailAddress(email);
		}

	@When("^Enter \"(.*?)\" as password$")
	public void enter_as_password(String pass) throws Throwable {
		lordandTaylor.loginPage().Password(pass);
	 	}

	@When("^Click login$")
	public void click_login() throws Throwable {
		lordandTaylor.loginPage().SignInButton();
		}

	@Then("^Welcome message should display with \"(.*?)\"$")
	public void welcome_message_should_display_with(String Actual) throws Throwable {
		lordandTaylor.loginPage().Wellcomemsg(Actual);
	 	}

@Then("^Error message should display with \"(.*?)\"$")
public void error_message_should_display_with(String Actual) throws Throwable {
	lordandTaylor.loginPage().ivalidEamil(Actual);
   }

}
