package com.lordandTaylor.testsripts;


import org.junit.Test;



import org.junit.runner.RunWith;

import com.paxotech.qa.lord.ScriptsBase;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

@RunWith(DataProviderRunner.class)
public class DataTestProvider extends ScriptsBase{
	
	@Test 
	@UseDataProvider( "excelDataProvider" )
	public void DataTest(String Textproduct,String	productname,String	ProductName){
		lordandTaylor().homePage().PhoneNumber(Textproduct);
		lordandTaylor().shoesPage().showAllboots(productname);
		lordandTaylor().shoesPage().selectShoe(ProductName);
		
	}
	
	

	

}
