package com.paxotech.qa.lord;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ScriptsBase extends ScriptBasemutliBrowser{

	protected WebDriver driver =null;
	private Application lordandTaylor= null;

	


	
	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.lordandtaylor.com/");
		
		
	
	}
		
		public Application lordandTaylor (){
			if(lordandTaylor == null){
				lordandTaylor = new Application(driver);
			}
			 return lordandTaylor;
		
			
	}

	@AfterMethod
	public void tearDown() throws Exception {
		lordandTaylor=null;
		//driver.close();
		//driver.quit();
	}
}