package com.crm.qa.webElements;

import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class CasePageElements extends TestBase{

	//Objects Repository
	
	
	//Constructor
	public CasePageElements() {
		PageFactory.initElements(driver,  this);
	}
	
}
