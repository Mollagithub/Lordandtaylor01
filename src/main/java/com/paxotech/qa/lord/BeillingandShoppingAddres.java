package com.paxotech.qa.lord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BeillingandShoppingAddres extends PageBase{
	private WebElement Carde;
	private WebElement Cardename;
	private WebElement Gustuser;
	private WebElement Firstname;
	private WebElement Lirstname;
	private WebElement Address;
	private WebElement Address2;
	private WebElement City;
	private WebElement Country;
	private WebElement State;
	private WebElement Postcode;
	private WebElement EmailAdd;
	private WebElement phone;
	private WebElement continuebutton;
	
	
	
	public WebElement carde(){
		Carde=waitForElement(By.xpath(".//*[@id='payMethodId_1']"));
		//Carde=driver.findElement(By.xpath(".//*[@id='payMethodId_1']"));
		delayforElement();
		Carde.click();
		return Carde;
	}
	public WebElement cardnme(){
		Cardename=driver.findElement(By.xpath(".//*[@id='payMethodId_1']"));
		Cardename.click();
		return Cardename;
		
	}
	public WebElement Gust(){
		Gustuser=driver.findElement(By.id("guestShopperContinue_label"));
		Gustuser.click();
		return Gustuser;
		
	}
	public WebElement FName(String TextNmae){
	Firstname=driver.findElement(By.id("fname"));
		Firstname.sendKeys(TextNmae);
		return Firstname;
	}
	public WebElement LName(String TextNmae){
		Lirstname=driver.findElement(By.id("lname"));
		Lirstname.sendKeys(TextNmae);
			return Lirstname;
		}
	public WebElement Adress(String TextNmae){
		Address=driver.findElement(By.id("address"));
		Address.sendKeys(TextNmae);
			return Address;
		}
	public WebElement Address2(String TextNmae){
		Address2=driver.findElement(By.id("address2"));
		Address2.sendKeys(TextNmae);
			return Address2;
		}
	public WebElement City(String TextNmae){
		City=driver.findElement(By.id("city"));
			City.sendKeys(TextNmae);
			return City;
		}
	public WebElement Country(String TextNmae){
		Country=driver.findElement(By.xpath(".//*[@id='_country_1']"));
		Country.sendKeys(TextNmae);
			return Country;
		}
	public WebElement State(String TextNmae){
		State=driver.findElement(By.id("WC__ShoppingCartAddressEntryForm_billing_address_form_state_1"));
			State.sendKeys(TextNmae);
			return State;
		}
	public WebElement ZipPost(String TextNmae){
		Postcode=driver.findElement(By.id("po"));
		Postcode.sendKeys(TextNmae);
			return Postcode;
		}
	public WebElement Eamil(String TextNmae){
		EmailAdd=driver.findElement(By.id("email"));
		EmailAdd.sendKeys(TextNmae);
			return EmailAdd;
		}
	public WebElement Phone(String TextNmae){
		phone=driver.findElement(By.id("bphone1"));
		phone.sendKeys(TextNmae);
		return phone;
	}
	public WebElement Phone1(String TextNmae){
		phone=driver.findElement(By.id("bphone2"));
		phone.sendKeys(TextNmae);
		return phone;
	}
	public WebElement Phone3(String TextNmae){
		phone=driver.findElement(By.id("bphone3"));
		phone.sendKeys(TextNmae);
			return phone;
		}
	public WebElement Continue(){
		continuebutton=driver.findElement(By.id("submitButton_label"));
		continuebutton.click();
			return continuebutton;
	}

	public BeillingandShoppingAddres(WebDriver driver) {
		super(driver);
		
	}
//Mamun
	
	public WebElement FristName (String fname){
		WebElement FristName= driver.findElement(By.id("fname"));
		FristName.sendKeys(fname);
		return FristName;
	}
	
	public WebElement LastName(String lname){
		WebElement LastName= driver.findElement(By.id("lname"));
		LastName.sendKeys(lname);
		return LastName;
	}
	
	public WebElement Address(String address){
		WebElement Address=driver.findElement(By.id("address"));
		Address.sendKeys(address);
		return Address;
	}
	
	public WebElement mCity(String city){
		WebElement City=driver.findElement(By.id("city"));
		City.sendKeys(city);
		return City;
	}
	public WebElement mCountry(String country){
		WebElement Country=driver.findElement(By.id("_country_1"));
		Country.sendKeys(country);
		return Country;
	}
	public WebElement mState(String state){
		WebElement State=driver.findElement(By.id("WC__ShoppingCartAddressEntryForm_billing_address_form_state_1"));
		State.sendKeys(state);
		return State;
	}
	public WebElement PostCode(String pocode){
		WebElement PostCode=driver.findElement(By.id("po1"));
		PostCode.sendKeys(pocode);
		return PostCode;
	}
	public WebElement PhoneNumber(String pocode){
		WebElement PhoneNumber=driver.findElement(By.id("ukphone"));
		PhoneNumber.sendKeys(pocode);
		return PhoneNumber;
	}

	public WebElement EmailAddress(String email){
		WebElement EmailAddress=driver.findElement(By.id("email"));
		EmailAddress.sendKeys(email);
		return EmailAddress;
	}
	public WebElement WantEmailNotification(){
		WebElement WantEmailNotification=driver.findElement(By.id("ifreceive"));
		WantEmailNotification.isSelected();
		System.out.println(WantEmailNotification);
		return WantEmailNotification;
	}
	public WebElement ContinueShopping(){
		//WebElement ContinueShopping=driver.findElement(By.id("ifreceive"));
		WebElement ContinueShopping=driver.findElement(By.id("submitButton_label"));
		
		highlightElement(ContinueShopping);
		ContinueShopping.click();
		System.out.println(ContinueShopping);
		return ContinueShopping;
	}
	
	public WebElement SameAsBillingAddress(){
		
		 WebElement SameAsBillingAddress = driver.findElement(By.id("lable-SameShippingAndBillingAddress"));
		 highlightElement(SameAsBillingAddress);
		 if (!SameAsBillingAddress.isSelected()){
			 SameAsBillingAddress.click();
		 }
		/*WebElement SameAsBillingAddress=driver.findElement(By.id("lable-SameShippingAndBillingAddress"));
		highlightElement(SameAsBillingAddress);
		SameAsBillingAddress.click();
		return SameAsBillingAddress;*/
		return SameAsBillingAddress;
	}
	public WebElement SelectPamentMethord(){
		WebElement SelectPamentMethord=driver.findElement(By.id("pay_pannel"));
		highlightElement(SelectPamentMethord);
		SelectPamentMethord.click();
		return SelectPamentMethord;
	}
	
	public WebElement SelectPamentMethordAsCreditCard(){
		WebElement SelectPamentMethordAsCreditCard=driver.findElement(By.id("PaybyCreditCard"));
		highlightElement(SelectPamentMethordAsCreditCard);
		SelectPamentMethordAsCreditCard.click();
		return SelectPamentMethordAsCreditCard;
	}
	public WebElement PamentMethord(String CardType){
		WebElement PamentMethord=driver.findElement(By.xpath("//*[@id='payMethodId_1']"));
		highlightElement(PamentMethord);
		PamentMethord.sendKeys(CardType);;
		return PamentMethord;
	}
	
	public WebElement FristNameShiping (String fname){
		WebElement FristName= driver.findElement(By.id("fname2"));
		FristName.sendKeys(fname);
		return FristName;
	}
	
	public WebElement LastNameShiping(String lname){
		WebElement LastName= driver.findElement(By.id("lname2"));
		LastName.sendKeys(lname);
		return LastName;
	}
	
	public WebElement AddressShiping(String address){
		WebElement Address=driver.findElement(By.id("address4"));
		Address.sendKeys(address);
		return Address;
	}
	
	public WebElement CityShiping(String city){
		WebElement City=driver.findElement(By.id("city2"));
		City.sendKeys(city);
		return City;
	}
	public WebElement CountryShiping(String country){
		WebElement Country=driver.findElement(By.id("country2"));
		Country.sendKeys(country);
		return Country;
	}
	public WebElement StateShiping(String state){
		WebElement State=driver.findElement(By.id("stateDiv2"));
		State.sendKeys(state);
		return State;
	}
	public WebElement PostCodeShiping(String pocode){
		WebElement PostCode=driver.findElement(By.id("po2"));
		PostCode.sendKeys(pocode);
		return PostCode;
	}
	public WebElement PhoneNumberShiping(String phonno){
		WebElement PhoneNumber=driver.findElement(By.id("bpphone1"));
		PhoneNumber.sendKeys(phonno);
		return PhoneNumber;
	}

	


			
	


	

}
