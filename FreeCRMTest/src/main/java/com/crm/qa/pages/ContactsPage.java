package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;



public class ContactsPage extends TestBase{
	//Object Repository
	@FindBy(xpath = "//div[@class=\"ui header item mb5 light-black\"]")
	public WebElement contactHeader;
	
	@FindBy(xpath = "//button[contains(text(), 'New')]")
	WebElement newContactButton;
	
	@FindBy(xpath = "//button[contains(text(), 'Export')]")
	WebElement exportButton;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchBox;
	
	@FindBy(xpath = "")
	WebElement searchButton;
	
	@FindBy(xpath = "//div[@name = 'action']")
	WebElement actionDropdown;
	
	@FindBy(xpath = "//div[@class=\"ui basic icon left attached button\"]")
	WebElement actionButton;
	
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@name=\"middle_name\"]")
	WebElement middleName;
	
	@FindBy(xpath = "//input[@class =  \"search\"]")
	WebElement company;
	/*
	 * @FindBy(xpath = "") WebElement categoryButton;
	 */
	
	@FindBy(xpath = "//input[@name='address']")
	WebElement address ;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@name='zip']")
	 WebElement zip; 
	
	/*
	 * @FindBy(xpath = "") WebElement country;
	 * 
	 * @FindBy(xpath = "") WebElement country1;
	 */
	
	@FindBy(xpath = "//input[@placeholder=\"Number\"]")
	WebElement number;

	@FindBy(xpath = "//button[contains(text(), 'Save')]")
	WebElement saveButton;
	
	@FindBy(xpath = "//button[contains(text(), \"Cancel\")]")
	WebElement cancel;
	
	
	//Constructor
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Methods	
	public void clickOnNewContact() {
		newContactButton.click();
	}
	
	public void createNewContact(String firstName, String lastName, String middleName, String company, String address, String city, String state, String zip, String number) {
		
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.middleName.sendKeys(middleName);
		this.company.sendKeys(company);
		this.address.sendKeys(address);
		this.city.sendKeys(city);
		this.state.sendKeys(state);
		this.zip.sendKeys(zip);
		this.number.sendKeys(number);
		
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
		
		this.saveButton.click();
	}
	
}
