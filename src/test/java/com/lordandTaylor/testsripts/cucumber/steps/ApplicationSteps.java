package com.lordandTaylor.testsripts.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ApplicationSteps extends StepBase{

	@Given("^As a not validated user$")
	public void as_a_not_validated_user() throws Throwable {
	   
	}

	@When("^Browse to the application$")
	public void browse_to_the_application() throws Throwable {
		driver.get("http://www.lordandtaylor.com/");

	  	}

	}
