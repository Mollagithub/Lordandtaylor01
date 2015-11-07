package com.paxotech.qa.lord;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends PageBase {

	
	private WebElement RemoveProduct;
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	public void Checkount(){
		WebElement Check=driver.findElement(By.xpath("//*[@class='total_info']//*[@class='allbutton checkout_btn']"));
			highlightElement(Check);
			Check.click();
	}
	public void Promocode(String PromCode){
		WebElement Check=driver.findElement(By.id("promoCode"));
			highlightElement(Check);
			Check.sendKeys("PromCode");
		
	}
	public void ZipcodDelivery(String PromCode){
		WebElement Check=driver.findElement(By.id("postalCode"));
			highlightElement(Check);
			Check.sendKeys("PromCode");
		
	}

	public void VerifyGrandTotal(String Textprice){
		WebElement total=driver.findElement(By.id("estimateTotalCharges"));
		String text=total.getText();
			highlightElement(total);
			Assert.assertEquals(text, Textprice);
		
	}
	public void finalCheckout(){
		WebElement Checkoutfinal=driver.findElement(By.id("shopcartCheckout"));
			highlightElement(Checkoutfinal);
			Checkoutfinal.click();
		
	}

	
	public WebElement RemoveProduct(){
		List<WebElement>foundRows=driver.findElements(By.xpath(".//*[@id='cartMainSection']/div[@class='prodSection clearfix']"));
		int i =foundRows.size();
		while(i>0){
		if (i==0){
		break;
		}
		
		WebElement remove=driver.findElement(By.id("WC_OrderItemDetailsf_links_2_1"));
		remove.click();
	
		}
		return RemoveProduct;
	}
		
	
}
