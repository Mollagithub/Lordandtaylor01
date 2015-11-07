package com.lordandTaylor.testsripts;

import org.testng.annotations.Test;

import com.paxotech.qa.lord.ScriptsBase;

public class RegistrationBaseScripts extends ScriptsBase{

	@Test
	public void newMemberRegistration(){
		
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().homePage().RegistrationLink();
		lordandTaylor().registrationPage().Fname("Muhammad");
		lordandTaylor().registrationPage().LastName("Molla");
		lordandTaylor().registrationPage().EmailAddress("molla@gmail.com");
		lordandTaylor().registrationPage().VerifyEmailAddress("molla@gmail.com");
		lordandTaylor().registrationPage().Password("molla1234");
		lordandTaylor().registrationPage().ConfirmPassword("molla1234");
		lordandTaylor().registrationPage().RegistrationButton();
		
	}
	@Test
	public void invalidRegistration(){
		
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().homePage().RegistrationLink();
		lordandTaylor().registrationPage().Fname("Muhammad");
		lordandTaylor().registrationPage().LastName("Molla");
		lordandTaylor().registrationPage().EmailAddress("Xmolla@gmail.com");
		lordandTaylor().registrationPage().VerifyEmailAddress("molla@gmail.com");
		lordandTaylor().registrationPage().Password("Xmolla123411111111111111111111111");
		lordandTaylor().registrationPage().ConfirmPassword("Xmolla123411111111111111111111111");
		lordandTaylor().registrationPage().RegistrationButton();
		lordandTaylor().registrationPage().verifyErrorMss("A character in your password occurs more consecutively than the allowed limit of 3. Please re-enter your password.");
		
	}
	@Test
	public void  invalidEmailAddforReg(){

		lordandTaylor().homePage().SignInLink();
		lordandTaylor().homePage().RegistrationLink();
		lordandTaylor().registrationPage().Fname("Muhammad");
		lordandTaylor().registrationPage().LastName("Molla");
		lordandTaylor().registrationPage().EmailAddress("X4wwttwmolla@gmail.com");
		lordandTaylor().registrationPage().VerifyEmailAddress("molla2@gmail.com");
		lordandTaylor().registrationPage().Password("molla1234");
		lordandTaylor().registrationPage().ConfirmPassword("molla1234");
		lordandTaylor().registrationPage().RegistrationButton();


	}

}
