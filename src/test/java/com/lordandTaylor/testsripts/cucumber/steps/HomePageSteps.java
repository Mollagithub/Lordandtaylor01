package com.lordandTaylor.testsripts.cucumber.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps extends StepBase {


	@Then("^Broadlief home page should show$")
	public void broadlief_home_page_should_show() throws Throwable {
		lordandTaylor.homePage().showlogingpage();

	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		lordandTaylor.loginPage().Signountlink();
	  
	}

}
