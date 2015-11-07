package com.lordandTaylor.testsripts;

import org.testng.annotations.Test;

import com.paxotech.qa.lord.ScriptsBase;





public class LoginBaseFanctionality extends ScriptsBase{
		@Test
	public void vlaidUerLogin(){
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().loginPage().EmailAddress("molla@gmail.com");
		lordandTaylor().loginPage().Password("molla1234");
		lordandTaylor().loginPage().SignInButton();	
		lordandTaylor().loginPage().Wellcomemsg("Welcome, Muhammad");
	}
	@Test
	public void invlaidUerLogin(){
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().loginPage().EmailAddress("arif_s211@gmail");
		lordandTaylor().loginPage().Password("mmmolla1234");
		lordandTaylor().loginPage().SignInButton();	
		lordandTaylor().loginPage().ivalidEamil("[It appears that either the email address or password entered is incorrect. Please re-enter and submit the information.]");

	}
	@Test
	public void emtyInfologin(){
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().loginPage().EmailAddress("");
		lordandTaylor().loginPage().Password("");
		lordandTaylor().loginPage().SignInButton();	
		lordandTaylor().loginPage().ivalidEamil("[It appears that either the email address or password entered is incorrect. Please re-enter and submit the information.]");

	}
	@Test
	public void boundaryInfo(){
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().loginPage().EmailAddress("arif_s211@gmail.com");
		lordandTaylor().loginPage().Password("molla1234222222222222222");
		lordandTaylor().loginPage().SignInButton();		
		lordandTaylor().loginPage().ivalidEamil("It appears that either the email address or password entered is incorrect. Please re-enter and submit the information.");

	}
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
	@Test
	public void verifyhomepagefaunctionality(){
		lordandTaylor().homePage().showSearchBox("Boot");
		lordandTaylor().homePage().SearchLink();
		lordandTaylor().homePage().veryfiySearchresult("Search Results for: Boot");
		lordandTaylor().homePage().GotoHomepage();
		lordandTaylor().homePage().veriftyTitle("Lord and Taylor: Designer Clothing, Shoes, Handbags, Accessories & More");
		lordandTaylor().homePage().verifyAccountinfovasiablity();
		lordandTaylor().homePage().verifyAdvertisment();
		lordandTaylor().homePage().verifyallImag();
		lordandTaylor().homePage().verifybotomDisplay();
		lordandTaylor().homePage().verifyContentTitle("");
		lordandTaylor().homePage().verifyFooter();
		lordandTaylor().homePage().verifyGlobalpromoLinkvasiablity();
		lordandTaylor().homePage().verifyHeadertopisDisplay();
		lordandTaylor().homePage().verifyPagesource("LordAndTaylor");
		lordandTaylor().homePage().verifySearchLinkvasiablity();
				
	}

	
	@Test
	public void SmSAlart(){
		lordandTaylor().homePage().TextAlart();
		lordandTaylor().homePage().FristName("Muhmmad");
		lordandTaylor().homePage().LastName("Molla");
		lordandTaylor().homePage().EmailAddress("molla@yahoo.com");
		lordandTaylor().homePage().ZipCode("10472");
		lordandTaylor().homePage().PhoneNumber("6463633788");
		lordandTaylor().homePage().AreUCardHolderOrnot();
		lordandTaylor().homePage().SubMit();
	}

	
}