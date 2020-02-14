package com.crm.qa.testsCases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest1() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, prop.getProperty("title"));
	}
	
	@Test(priority = 2)
	public void loginTest() {
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
