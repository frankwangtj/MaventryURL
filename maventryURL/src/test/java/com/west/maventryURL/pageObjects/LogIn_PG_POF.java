package com.west.maventryURL.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogIn_PG_POF {
	final WebDriver driver;
	@FindBy(how = How.ID, using = "log")
	public WebElement txtbx_UserName;
	@FindBy(how = How.ID, using = "pwd")
	public WebElement txtbx_Password;
	@FindBy(how = How.NAME, using = "submit")
	public WebElement btn_Login ;
	// This is a constructor, as every page need a base driver to find web elements
	public LogIn_PG_POF(WebDriver driver){ 
		this.driver = driver; 
    } 
	
	//This method will take two argutments (username and password)
	public void LogIn_Action(String sUserName, String sPassword){
		Home_PG_POF HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
		HomePage.lnk_MyAccount.click();
		txtbx_UserName.sendKeys(sUserName);
		txtbx_Password.sendKeys(sPassword);
		btn_Login.click();

	}
	
}
