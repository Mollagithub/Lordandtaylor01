package com.paxotech.qa.lord;

import java.awt.Desktop.Action;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoesBasePage extends PageBase{

	public ShoesBasePage(WebDriver driver) {
		super(driver);
	}
public void selectShoe(String productname){
	List<WebElement> producntName = driver.findElements(By.xpath(".//*[@id='men2']/div/ul/li/a"));
	int count=producntName.size();
    System.out.println(count);
	for(int i=0;i<count;i++){				
	WebElement tabName=producntName.get(i);
	String Text=tabName.getText();
	System.out.println(Text);
	highlightElement(tabName);
	if(Text.matches(productname)){
	tabName.click();
	break;
	}
	}
	}
	public void showAllboots(String ProductName){
		List<WebElement> producntName = driver.findElements(By.xpath(".//*[@id='totproductsList']/li/a"));
		int count=producntName.size();
	    System.out.println(count);
		for(int i=0;i<count;i++){				
		WebElement tabName=producntName.get(i);
		String Text=tabName.getText();
		System.out.println(Text);
		highlightElement(tabName);
		if(Text.matches(ProductName)){
		tabName.click();
		break;
		}
		}

	}
	public void shoeClour(){
		WebElement cloure=driver.findElement(By.xpath(".//*[@id='swatch_entitledItem_4563270_Black']"));
		cloure.click();
	}
	public void shoeSizwe(){
		WebElement Size=driver.findElement(By.xpath(".//*[@id='swatch_entitledItem_4563270_7.5']"));
		Size.click();
	}
	public void shoequentity(String quen){
		WebElement Quentity=driver.findElement(By.id("quantity"));
		Quentity.sendKeys(quen);
	}
	}
