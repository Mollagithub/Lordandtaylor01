package com.lordandTaylor.testsripts.cucumber;

import org.junit.runner.RunWith;
import com.lordandTaylor.testsripts.cucumber.steps.StepBase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		  //dryRun = false,
		  //strict = true,
		  monochrome = true,
		  tags = { "@debug" },
		  //tags = { "@functional","@smoke" }, /*AND*/
		  //tags = { "@functional,@smoke" }, /*OR*/
		  //tags = { "@functional,@debug","@debug" }, /*AND-OR*/
		  features = "src/test/resources/loradCucumber",
		  glue = {"com.lordandTaylor.testsripts.cucumber"},
		  plugin={
			 "pretty",
			 "html:target/test-report",
			 "json:target/test-report.json",
			 "json:target/cucumber-report.json",
			 "junit:target/test-report.xml"
		  	}
		)
public class LordAndTaylorRunner extends StepBase{
	
	
		

}
