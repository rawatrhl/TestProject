package com.crm.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase {
	public CompaniesPage() {
		PageFactory.initElements(driver,  this);
	}
}
