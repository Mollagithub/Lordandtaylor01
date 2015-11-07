package com.lordandTaylor.testsripts.Shikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WinFolderImage {

	protected WebDriver driver = null;
	protected Screen screen = null;
	
	@BeforeMethod
	public void setUp(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.cs.tut.fi/~jkorpela/forms/file.html");
		
		//Settings.setShowActions(true);
		//Settings.AutoWaitTimeout = 20;
		//Settings.WaitScanRate = 3;
		//Debug.setDebugLevel(3);
		
		screen = new Screen();
		ImagePath.add( System.getProperty("user.dir") + "/src/test/resources/images");
		
	}
	
	@Test
	public void fileUploadTest() throws FindFailed{
		WebElement chooseFileButton = driver.findElement(By.name("datafile"));
		chooseFileButton.click();
		
		screen.wait("FileName_Win.png");
		screen.mouseMove("FileName_Win.png");

		
		//screen.type("FileName_Win.png","C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
		screen.type("FileName_Win.png","C:\\Users\\Public\\Pictures\\Libraries\\Pictures.jpg");

		
		screen.click("OpenButton_Win.png");
		
		WebElement chooseFileButton2 = driver.findElement(By.name("datafile"));
		String value = chooseFileButton2.getAttribute("value");
		System.out.println(value);
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		
	}


}
