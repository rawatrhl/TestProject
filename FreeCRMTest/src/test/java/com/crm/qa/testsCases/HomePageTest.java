package com.crm.qa.testsCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;

public class HomePageTest extends TestBase{

	
	
	//Constructor
	public HomePageTest() {
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
