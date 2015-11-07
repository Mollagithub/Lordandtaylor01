package com.lordandTaylor.testsripts;

import org.testng.annotations.Test;

import com.lordandTaylor.testsripts.cucumber.LordAndTaylorRunner;
import com.paxotech.qa.lord.ScriptsBase;

public class FuctionalTest extends ScriptsBase{
	
	@Test
	public void Fuctional(){
		lordandTaylor().homePage().showAlltagProduct("Sale");
		lordandTaylor().saleBase().showproduct("Kids'");
		lordandTaylor().saleBase().selectKinds("RALPH LAUREN CHILDRENSWEAR"); 
		lordandTaylor().shoppingpage().Shoping();
		lordandTaylor().checkout().Checkount();
		lordandTaylor().checkout().Promocode("1234567");
		lordandTaylor().checkout().finalCheckout();
		lordandTaylor().BillandSop().Gust();
		lordandTaylor().BillandSop().FName("Arif");
		lordandTaylor().BillandSop().LName("Molla");
		lordandTaylor().BillandSop().Adress("1225 white");
		lordandTaylor().BillandSop().Address2("");
		lordandTaylor().BillandSop().City("Bronx");
		lordandTaylor().BillandSop().Country("United States");
		lordandTaylor().BillandSop().State("New York");
		lordandTaylor().BillandSop().ZipPost("10472");
		lordandTaylor().BillandSop().Phone("666");
		lordandTaylor().BillandSop().Phone1("333");
		lordandTaylor().BillandSop().Phone3("3478");
		lordandTaylor().BillandSop().Eamil("molla@yahoo.com");
		lordandTaylor().BillandSop().SameAsBillingAddress();
		lordandTaylor().BillandSop().FName("Arif");
		lordandTaylor().BillandSop().LName("Molla");
		lordandTaylor().BillandSop().Adress("1225 white");
		lordandTaylor().BillandSop().Address2("");
		lordandTaylor().BillandSop().City("Bronx");
		lordandTaylor().BillandSop().Country("United States");
		lordandTaylor().BillandSop().State("New York");
		lordandTaylor().BillandSop().ZipPost("10472");
		lordandTaylor().BillandSop().Phone("666");
		lordandTaylor().BillandSop().Phone1("333");
		lordandTaylor().BillandSop().Phone3("3478");
		lordandTaylor().BillandSop().Eamil("molla@yahoo.com");
		lordandTaylor().BillandSop().Continue();
		System.out.println("click continue");
		
		
		
	}
	@Test
	public void mamuntest(){
		
	}

	

}
