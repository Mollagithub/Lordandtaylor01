package com.lordandTaylor.testsripts.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import com.paxotech.qa.lord.Application;



public class StepBase {
	@Autowired
	protected WebDriver driver;
	@Autowired
	protected Application lordandTaylor;
	@Autowired
	protected Environment environment;
	
	
	
}
