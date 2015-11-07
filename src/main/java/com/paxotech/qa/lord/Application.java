package com.paxotech.qa.lord;

import org.openqa.selenium.WebDriver;


public class Application {
	
private WebDriver driver;

	private HomeBasePage homePage=null;
	private RegistrationBasePage registration=null;
	private LoginBasePage loginPage=null;
	private WomanClothBasePage womenClothing=null;
	private ShoesBasePage shoes=null;
	private HandsBags handBags=null;
	private JewelearysBasePage jeweleary=null;
	private SalesBasepage saleBase =null;
	private ShoppingPage shopping=null;
	private CheckoutPage checkout=null;
	private BeillingandShoppingAddres BillandSop=null;

	
	
			public RegistrationBasePage registrationPage(){
			if (registration==null){
			registration= new RegistrationBasePage(driver);
			}
			return registration;
	}
		public LoginBasePage loginPage(){
			if (loginPage==null){
				loginPage= new LoginBasePage(driver);
			}
			return loginPage;
	}
	public WomanClothBasePage womenClothing(){
		if(womenClothing==null){
			womenClothing=new WomanClothBasePage(driver);
		}
		return womenClothing;
	}
	
public ShoesBasePage shoesPage(){
	if(shoes==null){
		shoes=new ShoesBasePage(driver);
	}
	return shoes;
}
public HandsBags handBagPage(){
	if(handBags==null){
		handBags=new HandsBags(driver);
	}
	return handBags;
}
public JewelearysBasePage jeweleary(){
	if(jeweleary==null){
		jeweleary=new JewelearysBasePage(driver);
	}
	return jeweleary;
}
public HomeBasePage  homePage(){
	if(homePage==null){
		homePage=new HomeBasePage(driver);
	}
	return homePage;
}

public SalesBasepage   saleBase(){
	if(saleBase==null){
		saleBase=new SalesBasepage(driver);
	}
	return saleBase;
}

	
public ShoppingPage   shoppingpage(){
	if(shopping==null){
		shopping=new ShoppingPage(driver);
	}
	return shopping;
}
public CheckoutPage   checkout(){
	if(checkout==null){
		checkout=new CheckoutPage(driver);
	}
	return checkout;
}
public BeillingandShoppingAddres  BillandSop(){
	if(BillandSop==null){
		BillandSop=new BeillingandShoppingAddres(driver);
	}
	return BillandSop;
}


	public Application(WebDriver driver) {
		this.driver = driver;
		}
	
	
}
	

