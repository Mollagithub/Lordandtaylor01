package com.paxotech.qa.lord.Listener;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;



//@Listeners(SeleniumStarterListener.class)
public class TestNgListenerAndWebDriverListener {
 
    private Selenium selenium = null;
 
    @BeforeClass
    public void setup() {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");
        selenium.start();
    }
 
    @Test
    public void f() {
        selenium.open("http://www.facebook.com");
    }
 
    @AfterClass
    public void tearDown() {
        selenium.stop();
    }
}

