package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR
	@FindBy(xpath="//*[@id='ap_email']")
	WebElement userName;
	
	@FindBy(xpath="//span[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@id='ap_password']")
	WebElement passwordInput;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	WebElement signIn;
	
	@FindBy(id="createAccountSubmit")
	WebElement createAccount;
	
	@FindBy(xpath = "//i[contains(@class, 'a-icon a-icon-logo')]")
	WebElement logo;
	
	//Initializing the page Objects;
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateAmazonLogo() {
		return logo.isDisplayed();
	}
	
	public HomePage login(String username, String password) throws InterruptedException {
		Thread.sleep(2000);
		userName.sendKeys(username);
		Thread.sleep(2000);
		continueButton.click();
		
		Thread.sleep(2000);
		passwordInput.sendKeys(password);
		Thread.sleep(2000);
		signIn.click();
		return new HomePage();
	}
}
