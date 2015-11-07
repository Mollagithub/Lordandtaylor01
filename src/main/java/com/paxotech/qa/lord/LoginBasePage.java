package com.paxotech.qa.lord;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginBasePage extends PageBase{

	public LoginBasePage(WebDriver driver) {
		super(driver);
	}
	
	public void EmailAddress(String email){
		WebElement EmailAdd= driver.findElement(By.id("email1"));
		EmailAdd.sendKeys(email);
	}
		
	public void Password(String pass){
		WebElement Password= driver.findElement(By.id("Password"));
		Password.sendKeys(pass);
	}
	public void enterpassword(String Actual){
		WebElement InPass= driver.findElement(By.id("ErrorMessage_Password"));
		Assert.assertEquals(InPass, Actual);
	}

	public void SignInButton(){
		WebElement SignInButton= driver.findElement(By.id("submitButton_label"));
		SignInButton.click();
	}
	public void Wellcomemsg(String Actual){
		WebElement InPass= driver.findElement(By.id("welcome"));
		String text=InPass.getText();
		System.out.println(text);
		Assert.assertEquals(text, Actual);
	}
	public void ivalidEamil(String Actual){
		WebElement InEamil= driver.findElement(By.id("ErrorMessageText"));
		String text=InEamil.getText();
		System.out.println(text);
		Assert.assertEquals(text, Actual);
	}
	public void Signountlink(){
		WebElement SignoutButton= driver.findElement(By.id("WC_LogonLogoffLink_header"));
		SignoutButton.click();
	}


	
	
}
