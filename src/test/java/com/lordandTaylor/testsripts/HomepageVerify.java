package com.lordandTaylor.testsripts;


import org.testng.annotations.Test;

import com.paxotech.qa.lord.ScriptsBase;

public class HomepageVerify extends ScriptsBase{
	
	@Test
	public void verifyhomepagefaunctionality(){
		lordandTaylor().homePage().showSearchBox("Boot");
		lordandTaylor().homePage().SearchLink();
		lordandTaylor().homePage().veryfiySearchresult("Search Results for: Boot");
		lordandTaylor().homePage().GotoHomepage();
		lordandTaylor().homePage().veriftyTitle("Lord and Taylor: Designer Clothing, Shoes, Handbags, Accessories & More");
		lordandTaylor().homePage().verifyAccountinfovasiablity();
		lordandTaylor().homePage().verifyAdvertisment();
		lordandTaylor().homePage().verifyallImag();
		lordandTaylor().homePage().verifybotomDisplay();
		lordandTaylor().homePage().verifyContentTitle("");
		lordandTaylor().homePage().verifyFooter();
		lordandTaylor().homePage().verifyGlobalpromoLinkvasiablity();
		lordandTaylor().homePage().verifyHeadertopisDisplay();
		lordandTaylor().homePage().verifyPagesource("LordAndTaylor");
		lordandTaylor().homePage().verifySearchLinkvasiablity();
				
	}

	
	@Test
	public void SmSAlart(){
		lordandTaylor().homePage().TextAlart();
		lordandTaylor().homePage().FristName("Muhmmad");
		lordandTaylor().homePage().LastName("Molla");
		lordandTaylor().homePage().EmailAddress("molla@yahoo.com");
		lordandTaylor().homePage().ZipCode("10472");
		lordandTaylor().homePage().PhoneNumber("6463633788");
		lordandTaylor().homePage().AreUCardHolderOrnot();
		lordandTaylor().homePage().SubMit();
	}
}
