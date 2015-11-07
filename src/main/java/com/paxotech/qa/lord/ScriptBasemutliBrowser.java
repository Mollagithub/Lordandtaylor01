package com.paxotech.qa.lord;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class ScriptBasemutliBrowser {
	protected  WebDriver driver = null;

	
	@Parameters({"browser"})
	@BeforeMethod
	public void beforeMethod(@Optional("ff")String browser) {
		
		if(browser.contentEquals("ff")){
			/*FirefoxProfile profile = new FirefoxProfile();
			profile.setEnableNativeEvents(true);
			
			profile.setPreference("browser.cache.disk.enable", false);
			//driver = new FirefoxDriver(profile);
*/			driver = new FirefoxDriver();
		}
		else if(browser.contentEquals("ie")){
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setJavascriptEnabled(true);
			capabilities.setBrowserName("internet explorer");
			capabilities.setCapability("requireWindowFocus",true);
			capabilities.setCapability("platform", "WIN8.0");
			capabilities.setCapability("version", "10");
	
			//File driverFile = new File("C:/MyDevelopments/EclipseRepository/SeleniumWebDriver05/drivers/IEDriverServer.exe");
			File driverFile = new File(System.getProperty("user.dir") +  "/driver/32/IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", driverFile.getAbsolutePath());
			driver = new InternetExplorerDriver(capabilities);
			//driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		
		}
		else if(browser.contentEquals("ch")){
			File chromeDriverFile = new File(System.getProperty("user.dir") +  "/driver/32/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
			driver = new ChromeDriver();
		}
		else if(browser.contentEquals("sa")){
			driver = new SafariDriver();
		}
		else if(browser.contentEquals("op")){
			DesiredCapabilities capabilities =  DesiredCapabilities.operaBlink();
			capabilities.setBrowserName("opera");
			capabilities.setPlatform(org.openqa.selenium.Platform.ANY);
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
			//capabilities.setCapability("opera.binary", "C:/Program Files (x86)/Opera/opera.exe");
			//capabilities.setCapability("opera.logging.level", Level.ALL);
			//capabilities.setCapability("opera.logging.file", "C:/MyDevelopments/opera.log");
			System.setProperty("os.name","windows");
			driver = new OperaDriver(capabilities);
		}
		else if(browser.contentEquals("htmlunit")){
			driver = new HtmlUnitDriver(true);
		}
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate()
				.to("http://www.lordandtaylor.com/");
		
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {

		driver.close();
		driver.quit();
	}
}
