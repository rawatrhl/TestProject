package com.crm.qa.testsCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.*;

public class CallsPageTest extends TestBase{

	
	
	//Constructor
	public CallsPageTest() {
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
