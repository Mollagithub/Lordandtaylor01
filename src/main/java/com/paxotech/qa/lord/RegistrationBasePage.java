package com.paxotech.qa.lord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.yaml.snakeyaml.emitter.Emitable;

public class RegistrationBasePage extends PageBase{

	public RegistrationBasePage(WebDriver driver) {
		super(driver);
	}
	
	public void	Fname(String fname){
	 WebElement Fname=driver.findElement(By.id("fname"));
	 Fname.sendKeys(fname);
	}
	public void LastName(String Lastname){
	 WebElement Lname=driver.findElement(By.id("lname"));
	 Lname.sendKeys(Lastname);
	 }
	public void EmailAddress(String Eamil){
	 WebElement Email=driver.findElement(By.id("email1"));
	 Email.sendKeys(Eamil);
	}
	public void VerifyEmailAddress(String VriEamil){
		 WebElement Email=driver.findElement(By.id("verifyemail"));
		 Email.sendKeys(VriEamil);
		}
	public void Password(String TextPassword){
	 WebElement Password=driver.findElement(By.id("Password"));
	 Password.sendKeys(TextPassword);
	}
	public void ConfirmPassword(String Passoword){
	 WebElement conpass=driver.findElement(By.id("verifypassword"));
	 conpass.sendKeys(Passoword);
	}
	
	
	public void	Address(String Addres){
		 WebElement NewAddress=driver.findElement(By.id("address1"));
		 NewAddress.sendKeys(Addres);
		}
	public void	Address2(String Addres2){
		 WebElement NewAddress=driver.findElement(By.id("address2"));
		 NewAddress.sendKeys(Addres2);
		}

		public void City(String Citytext){
		 WebElement City=driver.findElement(By.id("city"));
		 City.sendKeys(Citytext);
		 }
		public void Proven(String Protext){
			 WebElement poro=driver.findElement(By.id("WC__ShoppingCartAddressEntryForm_register-account_state_1"));
			 poro.sendKeys(Protext);
			 }
		
		public void Statename(String StateName){
		List<WebElement> options = driver.findElements(By.id("_country_1"));
		for (WebElement option : options) {
		    if(StateName.equals(option.getText()))
		        option.click();   
		}
		}
		public void Postcode(String post){
		 WebElement codpost=driver.findElement(By.id("po1"));
		 codpost.sendKeys(post);
		}
		public void TeleNom(String Tel,String Tel2,String Tel3,String Tel4){
			 driver.findElement(By.id("bphone1")).sendKeys(Tel);
			 driver.findElement(By.id("bphone2")).sendKeys(Tel2);
			 driver.findElement(By.id("bphone3")).sendKeys(Tel3);
			 driver.findElement(By.id("bphone4")).sendKeys(Tel4);

			}
    public void RegistrationButton(){
	WebElement SubMit= driver.findElement(By.id("submitButton_reg_label"));
	SubMit.click();

	}
    public void verifyErrorMss(String Actual){
    	WebElement text=driver.findElement(By.id("ErrorMessageText"));
    	String gtext=text.getText();
    	System.out.println(gtext);
    	Assert.assertEquals(Actual, gtext);
    	
    }

}
/*lordandTaylor().registrationPage().Address("1225 white plains road ");
lordandTaylor().registrationPage().Address2("1225 white plains road");
lordandTaylor().registrationPage().City("Bronx");
lordandTaylor().registrationPage().Proven("Just mesg me when have come some new discoutn ");
lordandTaylor().registrationPage().Statename("United States");
lordandTaylor().registrationPage().Postcode("10472");
lordandTaylor().registrationPage().TeleNom("646","363","3708","55");		
*/
