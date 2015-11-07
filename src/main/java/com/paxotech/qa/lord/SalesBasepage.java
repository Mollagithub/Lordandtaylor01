package com.paxotech.qa.lord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesBasepage extends PageBase{

	public SalesBasepage(WebDriver driver) {
		super(driver);
	}
public void showproduct(String productnameText){
	WebElement productname=driver.findElement(By.xpath(".//*[@class='left_category']//*[text()=\""+productnameText+"\"]"));
	highlightElement(productname);
	productname.click();
}
public void Showmanu(String productnameText){
	WebElement productname=driver.findElement(By.xpath(".//*[@class='menuBar']//*[@class='sceondM']//*[text()=\""+productnameText+"\"]"));
	highlightElement(productname);
	productname.click();
}
public void selectKinds(String textprodname){
	List<WebElement> producntName = driver.findElements(By.xpath(".//*[@id='totproductsList']/li/a"));
	int count=producntName.size();
    System.out.println(count);
	for(int i=0;i<count;i++){				
	WebElement tabName=producntName.get(i);
	String Text=tabName.getText();
	System.out.println(Text);
	if(Text.matches(textprodname)){
	tabName.click();
	break;
	}
	}
	}

}
