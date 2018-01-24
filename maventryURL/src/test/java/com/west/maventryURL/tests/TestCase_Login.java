package com.west.maventryURL.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.west.maventryURL.pageObjects.Home_PG_POF;
import com.west.maventryURL.pageObjects.LogIn_PG_POF;

public class TestCase_Login {
	WebDriver driver;
	Home_PG_POF HomePage; //should be instance variable
	LogIn_PG_POF LoginPage;
	  @BeforeMethod
	  public void beforeTest() {
		  System.setProperty("webdriver.gecko.driver","C:\\003_RunningEnvironment\\02_GeckoDriver16\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://www.store.demoqa.com");
		  //Nice to initialize 2 pages before methods
	      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
	      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
		  System.out.println("Start to test--LoginTestCase");
	  }
	  @Test
	  public void testGoogleURL() throws InterruptedException {
		  //driver.get("http://www.store.demoqa.com");
			// This is to Instantiate Home Page and LogIn Page class  
			//Home_PG_POF HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
			//LogIn_PG_POF LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
			// Once both classes Initialised, use their Web Element Objects
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Thread.sleep(2000);
		  	LoginPage.LogIn_Action("testuser_12345678", "Test@123");
			//Thread.sleep(2000);
			//LoginPage.txtbx_UserName.sendKeys("testuser_12345678");
			//Thread.sleep(2000);
			//LoginPage.txtbx_Password.sendKeys("Test@123");
			//Thread.sleep(2000);
			LoginPage.btn_Login.click();
			//Thread.sleep(2000);
			System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
			HomePage.lnk_LogOut.click();
			//Thread.sleep(2000);
	  }
	  @AfterMethod
	  public void afterTest() {
		  
		  System.out.println("Finised-Test case login");
		  driver.quit();
	  }

}
