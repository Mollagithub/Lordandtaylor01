package com.lordandTaylor.testsripts.cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.paxotech.qa.lord.Application;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberBDDtestSripts {


	protected WebDriver driver;
	private Application lordandTaylor= null;

	/*
	@Before
	public void beforClass(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		lordandTaylor = new Application(driver);
	}
	
	@After
	public void afterClass(){
		driver.close();
		driver.quit();
		lordandTaylor = null;
	}
	@Given("^As a not validated user$")
	public void as_a_not_validated_user() throws Throwable {
	   
	}

	@When("^Browse to the application$")
	public void browse_to_the_application() throws Throwable {
		driver.get("http://www.lordandtaylor.com/");

	  	}

	@Then("^Broadlief home page should show$")
	public void broadlief_home_page_should_show() throws Throwable {
		lordandTaylor.homePage().showlogingpage();

	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		lordandTaylor.loginPage().Signountlink();
	  
	}

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

//For SMS Alartinfo

@When("^User click SMS button$")
public void user_click_SMS_button() throws Throwable {	
	lordandTaylor.homePage().TextAlart();
	
   }

@When("^Enter \"(.*?)\" as firstname$")
public void enter_as_firstname(String Firstname) throws Throwable {
lordandTaylor.homePage().FristName(Firstname);
  }

@When("^Enter \"(.*?)\" as lastname$")
public void enter_as_lastname(String lastname) throws Throwable {
lordandTaylor.homePage().LastName(lastname);
	   }

@When("^Enter \"(.*?)\" as email$")
public void enter_as_email(String email) throws Throwable {
	lordandTaylor.homePage().EmailAddress(email);
	 }

@When("^Enter \"(.*?)\" as zipcode$")
public void enter_as_zipcode(String zipcode) throws Throwable {
	lordandTaylor.homePage().ZipCode(zipcode);
	   }

@When("^Enter \"(.*?)\" as Phone$")
public void enter_as_Phone(String phone) throws Throwable {
	lordandTaylor.homePage().PhoneNumber(phone);
	
  }

@When("^click carde holder yes or no$")
public void click_carde_holder_yes_or_no() throws Throwable {
	lordandTaylor.homePage().AreUCardHolderOrnot();
	  }

@When("^Click Submit$")
public void click_Submit() throws Throwable {
	lordandTaylor.homePage().SubMit();
	
  }

*/

}
