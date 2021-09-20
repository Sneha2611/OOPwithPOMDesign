package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderConfirmationPage extends BasePage {

	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By ocpageheader = By.xpath("//h1");
	private By ocmessage = By.xpath("//div[@class='box']/p/strong");
	private By signout = By.xpath("//a[@class='logout']");
	
	public String getOCPageTitle()
	{
		return getpageTitle();
	}
	
	public String getOcpageheader() {
		return getPageHeader(ocpageheader);
	}
	
	public String getOcmessage() {
		return getPageHeader(ocmessage);
	}

	public WebElement getSignout() {
		return getElement(signout);
	}
	
	public LandingPage clickSignOut()
	{
		getSignout().click();
		return getInstance(LandingPage.class);
	}
	
}
