package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page Factory - OR;
	@FindBy(xpath = "//*[@id='nav-link-accountList']/child::span[3]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//*[@id='nav-orders']/child::span[2]")
	WebElement orders;
	
	@FindBy(xpath = "//*[@id='nav-your-amazon-text']/child::span")
	WebElement myOrders;
	
	@FindBy(xpath = "//*[@id='nav-xshop']/child::a")
	WebElement history;
	public MyAmazonPage myAmazonPageCheck() {
		myOrders.click();
		return new MyAmazonPage();
	}
	
	public BrowsingHistory historyPageCheck() {
		history.click();
		history.click();
		return new BrowsingHistory();
	}
	
	
	
}
