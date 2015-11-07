package com.paxotech.qa.lord;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;




public class PageBase {

	protected WebDriver driver=null;
	private String textToWait;
	
	

	 public void highlightElement(WebElement element) {
        for (int i = 0; i < 5; i++) {
          WrapsDriver wrappedElement = (WrapsDriver) element;
          JavascriptExecutor driver = (JavascriptExecutor)
          wrappedElement.getWrappedDriver();
          driver.executeScript("arguments[0].setAttribute('style',arguments[1]);",
                    element, "color: yellow; border: 7px solid green;");
          driver.executeScript("arguments[0].setAttribute('style',arguments[1]);",element, "");
        }
}
	 public void delayforElement(){
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 }
	 public void windowHandler(){
		 
		 for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);
			}

		 String winHandleCurent = driver.getWindowHandle();
	     driver.switchTo().window(winHandleCurent);

		 String winHandleBefore = driver.getWindowHandle();
	     driver.switchTo().window(winHandleBefore);
	     
	    // Parent window

	     String parentWindow = driver.getWindowHandle();
	     Set<String> handles =  driver.getWindowHandles();
	        for(String windowHandle  : handles)
	            {
	            if(!windowHandle.equals(parentWindow))
	               {
	               driver.switchTo().window(windowHandle);
	             // <!--Perform your operation here for new window-->
	              driver.close(); //closing child window
	              driver.switchTo().window(parentWindow); //cntrl to parent window
	               }
	            }

	 }
	 public void mouseOver(WebElement element){
		 Actions action=new Actions(driver);
		 System.out.println(action);
		 
		 
	 }
	 //All Selenium FluentWait:
	 
	 
	 public WebElement waitForElement(final By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(500, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					return driver.findElement(locator);
				}
			});
			return foo;
		}
		
		public WebElement waitForElementDisplayed(final By locator,int timeToWaitInSec) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(timeToWaitInSec, TimeUnit.SECONDS)
					.pollingEvery(100, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);
			
			//Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
			//((FluentWait<WebDriver>) wait).withTimeout(timeToWaitInSec, TimeUnit.SECONDS);
			//((FluentWait<WebDriver>) wait).pollingEvery(100, TimeUnit.MILLISECONDS);
			//((FluentWait<WebDriver>) wait).ignoring(NoSuchElementException.class);
			
			

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(locator);
					if (element.isDisplayed()) {
						return element;
					}
					return null;
				}
			});
			return foo;
		}
		
		public WebElement waitForElementDisplayed(final By locator) {
			return waitForElementDisplayed(locator,60);
		}
		
		public WebElement waitForElementText(final By locator,String text) {
			textToWait = text;
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(60, TimeUnit.SECONDS)
					.pollingEvery(500, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(locator);
					if (element.getText().contentEquals(textToWait)) {
						return element;
					}
					return null;
				}
			});
			return foo;
		}
		
		public WebElement waitForElementNotDisplayed(final By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(500, TimeUnit.MILLISECONDS)
					.ignoring(NoSuchElementException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
				public WebElement apply(WebDriver driver) {
					WebElement element = driver.findElement(locator);
					if (element.isDisplayed()) {
						return null;
					}
					return element;
				}
			});
			return foo;
		}
		
	 public PageBase(WebDriver driver){
		 this.driver=driver;
		 
	 }

	
}
