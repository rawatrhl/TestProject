package com.crm.qa.webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPageElements extends TestBase{
	
	//Page Factory  - OR
		@FindBy(xpath = "//ul[@class='rd-navbar-nav']/a/span")
		public static WebElement loginButton;
		
		@FindBy(xpath = "//input[@name=\"email\"]")
		public static WebElement emailId;
		
		@FindBy(xpath = "//input[@name = 'password']")
		public static WebElement password; 
		
		@FindBy(xpath = "//div[text() = 'Login']")
		public static WebElement login;
		
		@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[1]/div/a/svg/image")
		public static WebElement crmLogo;
		
	//Constructor
		public LoginPageElements() {
			PageFactory.initElements(driver, this);
		}

}
