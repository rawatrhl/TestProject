package com.crm.qa.pages;

import com.crm.qa.webElements.LoginPageElements;

public class LoginPage extends LoginPageElements{
	
	//Methods
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String un, String pwd) {
		loginButton.click();
		emailId.sendKeys(un);
		password.sendKeys(pwd);
		login.click();	
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	
}
