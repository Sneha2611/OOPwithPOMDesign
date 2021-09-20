package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	private By header = By.className("page-heading");
	private By orderhistory = By.xpath("//a[@title='Orders']");
	private By homebtn = By.xpath("//a[@title='Home']");
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public String getHomePageTitle()
	{
		return getpageTitle();
	}


	public String getHeader() {
		return getPageHeader(header);
	}


	public WebElement getOrderhistory() {
		return getElement(orderhistory);
	}


	public WebElement getHomebtn() {
		return getElement(homebtn);
	}
	
    
	public LandingPage clickHomeBtn()
	{
		getHomebtn().click();
		return getInstance(LandingPage.class);
	}
	
	
}
