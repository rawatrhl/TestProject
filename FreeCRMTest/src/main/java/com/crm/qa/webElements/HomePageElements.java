package com.crm.qa.webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePageElements extends TestBase{
	
	//Links WebElement - Objects Repository
		@FindBy(xpath="//span[@class=\"item-text\"]")
		public static WebElement homePageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Calendar')]")
		public static WebElement calendarPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Contacts')]")
		public static WebElement contactsPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Companies')]")
		public static WebElement CompaniesPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Deals')]")
		public static WebElement dealsPageLink;
		
		@FindBy(xpath = "//span[contains(text(), 'Tasks')]")
		public static WebElement tasksPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Cases')]")
		public static WebElement CasesPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Calls')]")
		public static WebElement callsPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Documents')]")
		public static WebElement documentsPageLink;
			
		@FindBy(xpath="//span[contains(text(), 'Email')]")
		public static WebElement emailPageLink;
		
		@FindBy(xpath="//span[contains(text(), 'Campaigns')]")
		public static WebElement campaignsPageLink;

		@FindBy(xpath="//span[contains(text(), 'Forms')]")
		public static WebElement formsPageLink;
		
		//other things
		@FindBy(xpath="//span[@class=\"user-display\"]")
		public static WebElement profileName;
		
		//constructor
		public HomePageElements() {
			PageFactory.initElements(driver, this);
		}
		

}
