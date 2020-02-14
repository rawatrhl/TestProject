package com.crm.qa.testsCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;

public class EmailPageTest extends TestBase{

	
	
	//Constructor
	public EmailPageTest() {
		super();
	}
	
	@BeforeMethod	//Operations before Tests
	public void setUp(){
		initialization();
	}
	
	//Tests
	
	
	
	
	
	@AfterMethod	// Operations after the Tests
	public void tearDown(){
		driver.quit();
	}
}
