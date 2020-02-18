package com.crm.qa.pages;

import com.crm.qa.webElements.ContactsPageElements;

public class ContactsPage extends ContactsPageElements{
	
	
	//Methods	
	public void clickOnNewContact() {
		newContactButton.click();
	}
	
	public void createNewContact(String firstName, String lastName, String middleName, String company, String address, String city, String state, String zip, String number) {
		
		ContactsPageElements.firstName.sendKeys(firstName);
		ContactsPageElements.lastName.sendKeys(lastName);
		ContactsPageElements.middleName.sendKeys(middleName);
		ContactsPageElements.company.sendKeys(company);
		ContactsPageElements.address.sendKeys(address);
		ContactsPageElements.city.sendKeys(city);
		ContactsPageElements.state.sendKeys(state);
		ContactsPageElements.zip.sendKeys(zip);
		ContactsPageElements.number.sendKeys(number);
		
		/*
		 * Select cat = new
		 * Select(driver.findElement(By.xpath("//div[@name='category']")));
		 * cat.selectByVisibleText(category);
		 * 
		 * Select select = new Select(driver.findElement(By.xpath(
		 * "//input[@name='zip']/parent::div/parent::div/following-sibling::div/div/input"
		 * ))); select.selectByVisibleText(country);
		 * 
		 * Select select1 = new
		 * Select(driver.findElement(By.xpath("//div[@class='four fields']/div/input")))
		 * ; select1.selectByVisibleText(country);
		 */
		
		ContactsPageElements.saveButton.click();
	}
	
}
