package com.crm.qa.webElements;

import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class CompaniesPageElements extends TestBase{
	
	//Object repository 
	
	
	//Constructor
	public CompaniesPageElements() {
		PageFactory.initElements(driver, this);
	}

}
