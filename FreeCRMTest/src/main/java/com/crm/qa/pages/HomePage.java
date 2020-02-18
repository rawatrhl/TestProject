package com.crm.qa.pages;

import com.crm.qa.webElements.HomePageElements;

public class HomePage extends HomePageElements{
	
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
