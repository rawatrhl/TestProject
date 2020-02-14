package com.crm.qa.testsCases;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.*;
import com.crm.qa.util.TestUtil;

import org.testng.Assert;
import org.testng.annotations.*;

public class ContactsPageTest extends TestBase{
	String tableName = "xyz";
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage  = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = new HomePage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnContactsLink();
	}
	
	@DataProvider
	public Object[][] getCRMTestData()throws Exception{
		Object[][] data = TestUtil.getTestData(tableName);
		return data;
	}

	/*
	 * @Test(priority = 1 ) public void contactPageHeaderTest() {
	 * Assert.assertTrue(contactsPage.contactHeader.isDisplayed()); }
	 */
	@Test(priority = 2, dataProvider = "getCRMTestData")
	public void newContactTest(String firstName, String lastName, String middleName, String company, String address, String city, String state, String zip, String number) {
		contactsPage.clickOnNewContact();
		contactsPage.createNewContact(firstName, lastName, middleName, company, address, city, state, zip, number);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
