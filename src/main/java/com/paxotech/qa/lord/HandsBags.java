package com.paxotech.qa.lord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HandsBags extends PageBase {

	public HandsBags(WebDriver driver) {
		super(driver);
	}

	public void HandBags(){
		WebElement Handbags=driver.findElement(By.xpath("//*[@id='main_nav']/li[3]/a"));
		Handbags.click();

	List<WebElement> list=driver.findElements(By.cssSelector(".first"));
	String[] listOption =new String[list.size()];
	int i=0;
	for(WebElement iteam: list){
		String listOptions=iteam.getText();
		System.out.println(listOptions);
		listOption[i ++] = listOptions;
	}
	}
	
}
