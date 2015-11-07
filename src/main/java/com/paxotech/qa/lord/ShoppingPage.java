package com.paxotech.qa.lord;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingPage extends PageBase{

	public ShoppingPage(WebDriver driver) {
		super(driver);
	}
	public void zoomView(){
		WebElement zoom=driver.findElement(By.id("contflyzoom"));
		zoom.click();
	}
	public void Size(String StateName){
		List<WebElement> options = driver.findElements(By.xpath("//*[@class='sizeValue']"));
		int i=0;
		WebElement text=options.get(i);
		System.out.println(text);
		for (WebElement option : options) {
		    if(StateName.equals(option.getText()))
		    	highlightElement(text);
		        option.click();  

		}

}
	public void quentity(String quentityText){
		WebElement quti=driver.findElement(By.id("quantity"));
			highlightElement(quti);
			quti.sendKeys(quentityText);
		
	}
	
	public void Shoping(){
		WebElement quti=driver.findElement(By.id("addtobag"));
			highlightElement(quti);
			quti.click();
		
	}
	public void VerifyShopingMsg(String ErrorMsg){
		WebElement exceptsmsg=driver.findElement(By.id("ErrorMessageText"));
			highlightElement(exceptsmsg);
			String text=exceptsmsg.getText();
					System.out.println(text);
			//Assert.assertEquals(exceptsmsg, ErrorMsg);
		
	}
	public void VerifyTotalPrice(String ErrorMsg){
		WebElement total=driver.findElement(By.xpath("//*[@class='total_info']//*[@class='total']"));
		String text=total.getText();
			highlightElement(total);
			Assert.assertEquals(text, ErrorMsg);
		
	}
	


}
