package com.lordandTaylor.testsripts;

import org.testng.annotations.Test;

import com.paxotech.qa.lord.ScriptsBase;

public class ProductScripts extends ScriptsBase{
	@Test
	public void allprductandmanue(){
		lordandTaylor().homePage().showAlltagProduct("Shoes");
		lordandTaylor().shoesPage().selectShoe("Boots");
		lordandTaylor().shoesPage().showAllboots("FRANCO SARTO");
		lordandTaylor().shoesPage().shoeClour();
		lordandTaylor().shoesPage().shoeSizwe();
		lordandTaylor().shoesPage().shoequentity("3");
		
		
		lordandTaylor().homePage().showAlltagProduct("Sale");		
		lordandTaylor().shoesPage().showAllboots("MICHAEL MICHAEL KORS");
		lordandTaylor().homePage().showAlltagProduct("Beauty");
		
		lordandTaylor().shoesPage().showAllboots("ELIZABETH ARDEN");
		lordandTaylor().homePage().showAlltagProduct("Men's");
		
		lordandTaylor().shoesPage().showAllboots("POLO RALPH LAUREN");
		
	}

	@Test
	public void shoesSelect(){
		lordandTaylor().homePage().showAlltagProduct("Shoes");
		lordandTaylor().shoesPage().selectShoe("Boots");
		lordandTaylor().shoesPage().showAllboots("FRANCO SARTO");
		//lordandTaylor().shoppingpage().Size("8");
		//lordandTaylor().shoppingpage().quentity("4");
		lordandTaylor().shoppingpage().Shoping();
		lordandTaylor().shoppingpage().VerifyShopingMsg("The item has been successfully added to your shopping cart");
		//lordandTaylor().shoppingpage().VerifyTotalPrice("$228.00");
		lordandTaylor().checkout().Checkount();
		lordandTaylor().checkout().Promocode("1234567");
		//lordandTaylor().checkout().VerifyGrandTotal("$228.00");
		lordandTaylor().checkout().finalCheckout();
		lordandTaylor().checkout().RemoveProduct();
}
		
		
	
	@Test
	public void Salesproduct(){
		lordandTaylor().homePage().SignInLink();
		lordandTaylor().loginPage().EmailAddress("molla@gmail.com");
		lordandTaylor().loginPage().Password("molla1234");
		lordandTaylor().loginPage().SignInButton();	
		lordandTaylor().loginPage().Wellcomemsg("Welcome, Muhammad");
		lordandTaylor().homePage().showAlltagProduct("Sale");
		lordandTaylor().saleBase().showproduct("Kids'");
		lordandTaylor().saleBase().selectKinds("GUESS"); 
		//lordandTaylor().shoppingpage().zoomView();
		lordandTaylor().shoppingpage().quentity("4");
		lordandTaylor().shoppingpage().Shoping();
		lordandTaylor().shoppingpage().VerifyShopingMsg("The item has been successfully added to your shopping cart");
		//lordandTaylor().shoppingpage().VerifyTotalPrice("$83.96");
		lordandTaylor().checkout().Checkount();
		lordandTaylor().checkout().Promocode("1234567");
		//lordandTaylor().checkout().VerifyGrandTotal("$94.91");
		lordandTaylor().checkout().finalCheckout();
		lordandTaylor().checkout().RemoveProduct();
		//lordandTaylor().BillandSop().carde();
		//lordandTaylor().BillandSop().cardnme();
		lordandTaylor().BillandSop().FName("Arif");
		lordandTaylor().BillandSop().LName("Molla");
		lordandTaylor().BillandSop().Adress("1225 white");
		lordandTaylor().BillandSop().Address2("Newyourk");
		lordandTaylor().BillandSop().Country("United States");
		lordandTaylor().BillandSop().City("New York");
		lordandTaylor().BillandSop().ZipPost("10472");
		//lordandTaylor().BillandSop().Phone("666666666");
		

	}
}
