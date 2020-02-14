package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.pages.*;
import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	//Links WebElement - Objects Repository
	@FindBy(xpath="//span[@class=\"item-text\"]")
	WebElement homePageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Calendar')]")
	WebElement calendarPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Contacts')]")
	WebElement contactsPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Companies')]")
	WebElement CompaniesPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Deals')]")
	WebElement dealsPageLink;
	
	@FindBy(xpath = "//span[contains(text(), 'Tasks')]")
	WebElement tasksPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Cases')]")
	WebElement CasesPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Calls')]")
	WebElement callsPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Documents')]")
	WebElement documentsPageLink;
		
	@FindBy(xpath="//span[contains(text(), 'Email')]")
	WebElement emailPageLink;
	
	@FindBy(xpath="//span[contains(text(), 'Campaigns')]")
	WebElement campaignsPageLink;

	@FindBy(xpath="//span[contains(text(), 'Forms')]")
	WebElement formsPageLink;
	
	//other things
	@FindBy(xpath="//span[@class=\"user-display\"]")
	WebElement profileName;
	
	
	
	//constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() {
		contactsPageLink.click();
		return new ContactsPage();
	}
	
	public TasksPage clickOnTasksPage() {
		tasksPageLink.click();
		return new TasksPage();
	}
	public DealsPage clickOnDealsLink() {
		dealsPageLink.click();
		return new DealsPage();
	}
	
	public TasksPage clickOnTasksLink() {
		tasksPageLink.click();
		return new TasksPage();
	} 
	
	public TasksPage clickOnCasesLink() {
		CasesPageLink.click();
		return new TasksPage();
	}
	
	public TasksPage clickOnCallsLink() {
		callsPageLink.click();
		return new TasksPage();
	}
	
	public DocumentsPage clickOnDocumentsLink() {
		documentsPageLink.click();
		return new DocumentsPage();
	}
	
	public EmailPage clickOnEmailLink() {
		emailPageLink.click();
		return new EmailPage();
	}
	
	public CampaignsPage clickOnCampaignsLink() {
		campaignsPageLink.click();
		return new CampaignsPage();
	}
	
	public FormsPage clickOnFormsLink() {
		formsPageLink.click();
		return new FormsPage();

	}
}
