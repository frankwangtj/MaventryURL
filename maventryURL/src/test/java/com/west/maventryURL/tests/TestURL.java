package com.west.maventryURL.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestURL {
	WebDriver driver;
  @Test
  public void testGoogleURL() {
	  driver.get("http://www.google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:\\003_RunningEnvironment\\02_GeckoDriver16\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  System.out.println("Start to test--testGoogleURL");
	  System.out.println("Try second commit");
	  System.out.println("Try third time commit");

  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
