package com.west.maventryURL.automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import com.west.maventryURL.pageObjects.*;


public class TestCase_POF {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\003_RunningEnvironment\\02_GeckoDriver16\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		// This is to Instantiate Home Page and LogIn Page class  
		Home_PG_POF HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
		LogIn_PG_POF LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
		// Once both classes Initialised, use their Web Element Objects
		HomePage.lnk_MyAccount.click();
		LoginPage.txtbx_UserName.sendKeys("testuser_12345678");
		LoginPage.txtbx_Password.sendKeys("Test@123");
		LoginPage.btn_Login.click();
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		HomePage.lnk_LogOut.click();
		System.out.println("Try git");
		driver.quit();
	}

}
