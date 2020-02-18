package com.crm.qa.webElements;

import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class CampaignsPageElements extends TestBase{
	
	//Objects Repository
	
	
	//Constructor
	public CampaignsPageElements() {
		PageFactory.initElements(driver,  this);
	}

}
