package com.crm.qa.webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPageElements extends TestBase{
	
	//Object Repository
		@FindBy(xpath = "//div[@class=\"ui header item mb5 light-black\"]")
		public static WebElement contactHeader;
		
		@FindBy(xpath = "//button[contains(text(), 'New')]")
		public static WebElement newContactButton;
		
		@FindBy(xpath = "//button[contains(text(), 'Export')]")
		public static WebElement exportButton;
		
		@FindBy(xpath = "//input[@type='text']")
		public static WebElement searchBox;
		
		@FindBy(xpath = "")
		public static WebElement searchButton;
		
		@FindBy(xpath = "//div[@name = 'action']")
		public static WebElement actionDropdown;
		
		@FindBy(xpath = "//div[@class=\"ui basic icon left attached button\"]")
		public static WebElement actionButton;
		
		
		@FindBy(xpath="//input[@name='first_name']")
		public static WebElement firstName;
		
		@FindBy(xpath = "//input[@name='last_name']")
		public static WebElement lastName;
		
		@FindBy(xpath = "//input[@name=\"middle_name\"]")
		public static WebElement middleName;
		
		@FindBy(xpath = "//input[@class =  \"search\"]")
		public static WebElement company;
		/*
		 * @FindBy(xpath = "") WebElement categoryButton;
		 */
		
		@FindBy(xpath = "//input[@name='address']")
		public static WebElement address ;
		
		@FindBy(xpath = "//input[@name='city']")
		public static WebElement city;
		
		@FindBy(xpath = "//input[@name='state']")
		public static WebElement state;
		
		@FindBy(xpath = "//input[@name='zip']")
		public static WebElement zip; 
		
		/*
		 * @FindBy(xpath = "") WebElement country;
		 * 
		 * @FindBy(xpath = "") WebElement country1;
		 */
		
		@FindBy(xpath = "//input[@placeholder=\"Number\"]")
		public static WebElement number;

		@FindBy(xpath = "//button[contains(text(), 'Save')]")
		public static WebElement saveButton;
		
		@FindBy(xpath = "//button[contains(text(), \"Cancel\")]")
		public static WebElement cancel;
		
		
		//Constructor
		public ContactsPageElements() {
			PageFactory.initElements(driver, this);
		}
		

}
