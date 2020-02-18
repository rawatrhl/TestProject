package com.crm.qa.webElements;

import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class FormsPageElements extends TestBase{
	
	//Objects Repository
	
	
	//Constructor
	public FormsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
