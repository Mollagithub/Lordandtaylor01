package com.paxotech.qa.lord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import bsh.commands.dir;

public class HomeBasePage extends PageBase{

	public HomeBasePage(WebDriver driver) {
		super(driver);
	}

	
	public void SignInLink(){		
		WebElement SiginLink=driver.findElement(By.xpath(".//*[@id='WC_LogonLogoffLink_header']"));
		SiginLink.click();
		
	}
	public void RegistrationLink(){
		WebElement RegistrationLink =driver.findElement(By.cssSelector("#WC_AccountDisplay_links_3"));
		RegistrationLink.click();
	}
	public void showAlltagProduct(String Textproduct){
		WebElement product=driver.findElement(By.xpath(".//*[@id='main_nav']//*[text()=\""+Textproduct+"\"]"));
		product.click();
	}
	public void showProshoe(){
		WebElement product=driver.findElement(By.xpath(".//*[@id='main_nav']/li[2]/a"));
		product.click();
	}
	public void remove(){
		WebElement product=driver.findElement(By.xpath(".//*[@id='main_nav']/li[2]/a"));
		product.click();
	}

  public void ShowAlltab(){
	  List<WebElement> list = driver.findElements(By.xpath(".//*[@id='main_nav']/li/a"));
		int count = list.size();
		
		String[] tabNamesActual = new String[count];
		for(int i = 0; i < count; i++){
			WebElement item = list.get(i);
			String text = item.getText();
			tabNamesActual[i] = text;
		}
		
	}
	public WebElement WoMenClothing(){
		WebElement WoMenClothing=driver.findElement(By.xpath(".//*[@id='main_nav']/li[1]/a"));
		highlightElement(WoMenClothing);
		WoMenClothing.click();
		return WoMenClothing;
	}


	public void TextAlart(){
		WebElement SMsAlart=driver.findElement(By.xpath("//*[@id='sms_container']/a/span"));
		highlightElement(SMsAlart);
		SMsAlart.click();
		windowHandler();
	}
	
	public void FristName(String fname){
		WebElement FName= driver.findElement(By.xpath("//*[@id='sign_up_first_name']"));
		FName.sendKeys(fname);
	}
	public void LastName(String lastname){
		WebElement LastName= driver.findElement((By.xpath("//*[@id='sign_up_last_name']")));
		LastName.sendKeys(lastname);
	}
	public void EmailAddress(String email){
		WebElement EmailAdd= driver.findElement(By.xpath("//*[@id='sign_up_email']"));
		EmailAdd.sendKeys(email);
	}
	public void ZipCode(String zipcode){
		WebElement ZipCode= driver.findElement((By.xpath("//*[@id='sign_up_postal_code']")));
		ZipCode.sendKeys(zipcode);
	}
	
	public void PhoneNumber(String phone){
		WebElement PhoneNumber= driver.findElement(By.xpath("//*[@id='sign_up_mdn']"));
		PhoneNumber.sendKeys(phone);
	}
	public void AreUCardHolderOrnot(){
		List<WebElement> AreUCardHolderOrnot = driver.findElements(By.xpath("//*[@id='sign_up_cardholder_true']"));
		for(WebElement element : AreUCardHolderOrnot){
		if(!element.isSelected()){
		    element.click();
		}
	}
		}
	
		public void AllTabs(String Tabs){
		WebElement AllTabes=driver.findElement(By.xpath("//*[@id='main_nav']//li/*[Text()=\""+ Tabs +"\"]"));
		AllTabes.click();
		}
	
	public void SubMit(){
		WebElement SubMit= driver.findElement(By.xpath("//*[@id='enter-form']/div[8]/input"));
		SubMit.click();
	}
	
	public void showlogingpage(){
		driver.findElement(By.xpath(".//*[@id='WC_LogonLogoffLink_header']")).click();
	}
	public void showSearchBox(String productname){
		driver.findElement(By.xpath(".//*[@id='SimpleSearchForm_SearchTerm']")).sendKeys(productname);
	
	}
	public void SearchLink(){
		driver.findElement(By.xpath(".//*[@id='header-search']/div/a/input")).click();	
	}
	public void veryfiySearchresult(String Actual){
		WebElement text=driver.findElement(By.xpath(".//*[@id='right_con']/h1"));
		String gettext=text.getText();
		System.out.println(gettext);
		Assert.assertEquals(Actual, gettext);
		
	}
	public void GotoHomepage(){
		driver.findElement(By.xpath(".//*[@id='WC_ContentAreaESpot_links_7_1']/img")).click();
	
	}

	public WebElement addTagname(String tagnameHome){
		WebElement Tagname=driver.findElement(By.xpath("//*[@id='main_nav']//*[text()=\""+tagnameHome+"\"]"));
		highlightElement(Tagname);
		Tagname.click();
		return Tagname;
			}	

	public void verifyContentTitle(String expected){
		WebElement showImage=driver.findElement(By.xpath(".//*[@id='WC_ContentAreaESpot_links_7_1']/img"));
		boolean actual = showImage.isDisplayed();
		Assert.assertTrue(actual,expected);
	}
	public void veriftyTitle(String Actualtitle){
		String titel=driver.getTitle();
		System.out.println(titel);
		Assert.assertEquals(Actualtitle, titel);	
	}
   public void verifyAccountinfovasiablity(){
	   if( driver.findElement(By.id("account")).isDisplayed()){
		System.out.println("Accountinformation link:   Element is Visible");
		}else{
		System.out.println("Element is InVisible");
		}
			}
	public void verifyHeadertopisDisplay(){
		WebElement showHeader=driver.findElement(By.xpath(".//*[@id='header_top_tool']"));
		String text=showHeader.getText();
		System.out.println("All are Header Top is**********"+text);
	    Assert.assertEquals(true,showHeader.isDisplayed());
	}
	public void verifyPagesource(String expected){
	if(driver.getPageSource().contains(expected)){
		System.out.println("PageSource Text is present");
		}else{
		System.out.println("Text is absent");
		}
	}
	public void verifybagItems(String expected){
	String Shopingbage=driver.findElement(By.id("bagItems")).getText();
	Assert.assertEquals(expected,Shopingbage);
			if(	driver.findElements(By.id("bagItems")).size() != 0){
		System.out.println(Shopingbage+   "Element is Present");
		}else{
		System.out.println("Element is Absent");
		}
	}
	public void verifyCheckoutLinkvasiablity(){
		   if( driver.findElement(By.xpath(".//*[@id='headerSearchSubwarp']/div/a")).isDisplayed()){
			System.out.println("Checkoutn link:  Element is Visible");
			}else{
			System.out.println("Element is InVisible");
			}
				}
	public void verifySearchLinkvasiablity(){
		   if( driver.findElement(By.xpath(".//*[@id='SimpleSearchForm_SearchTerm']")).isDisplayed()){
			System.out.println("Search link:  Element is Visible");
			}else{
			System.out.println("Element is InVisible");
			}
	     }
	public void verifyGlobalpromoLinkvasiablity(){
			if(driver.findElement(By.xpath(".//*[@id='global_promo_container']"))!= null){
				System.out.println("Global promo : Element is Present");
				}else{
				System.out.println("Element is Absent");
				}
	}
	public void verifyallImag(){
		 if( driver.findElement(By.xpath(".//*[@id='content_wrapper_box']//img")).isDisplayed()){
				System.out.println("All Image :  Element is Visible");
				}else{
				System.out.println("Element is InVisible");
				}
		     }
	public void verifyAdvertisment(){
		String text=driver.findElement(By.xpath(".//*[@id='ad_10824']")).getText();
		 if( driver.findElement(By.xpath(".//*[@id='ad_10824']")).isDisplayed()){
				System.out.println("All ADD :  Element is Visible  that is :"   +text);
				}else{
				System.out.println("Element is InVisible");
				}
		     }
	public void verifyFooter(){
		List<WebElement> list = driver.findElements(By.xpath(".//*[@class='ad']/div/ul/li/h2"));
		int count = list.size();
		for (int i = 0; i < count; i++) {
			WebElement item = list.get(i);
			item.click();
			String text = item.getText();
			highlightElement(item);
			System.out.println(text);
	}
	}
	public void verifybotomDisplay(){
		WebElement showFooter=driver.findElement(By.xpath(".//*[@class='footer_container']"));
		String text=showFooter.getText();
		System.out.println("All are Footer Bottom is      "+text);
	    Assert.assertEquals(true,showFooter.isDisplayed());
	}
	
	public void FooterSignUP(){
		 if( driver.findElement(By.xpath(".//*[@id='footer_form_signupemail']")).isDisplayed()){
				System.out.println("Footer SignUP :  Element is Visible");
				}else{
				System.out.println("Element is InVisible");
				}
		     }
	public void SocialLink(){
		driver.findElement(By.xpath(".//*[@id='social_icons_container']/a[1]/span")).click();
		windowHandler();
	}

}

	



	

