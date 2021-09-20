package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage{

	//page locators
	
	private By signin_btn = By.xpath("//div[@class='header_user_info']");
	private By contactus_btn = By.xpath("//a[@title='Contact us']");
	private By search_txtfield = By.id("search_query_top");
	
	
	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//getters
	//accessing private variables of the class using public methods or getter methods

	public WebElement getSignin_btn() {
		return getElement(signin_btn);
	}


	public WebElement getContactus_btn() {
		return getElement(contactus_btn);
	}


	public WebElement getSearch_txtfield() {
		return getElement(search_txtfield);
	}
	
	public String getLandingPageTitle()
	{
		return getpageTitle();
	}
	
	
	public SignInPage clickOnSignIn()
	{
		getSignin_btn().click();
		
		return getInstance(SignInPage.class);
	}

}
