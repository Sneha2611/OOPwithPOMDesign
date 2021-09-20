package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CustomerAccPage extends BasePage {

	public CustomerAccPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By accuserlink = By.xpath("//a[@title='View my customer account']");
	private By dresseslink = By.xpath("//div[@id='block_top_menu']/child::ul/child::li[2]");
	private By eveningdress = By.xpath("//div[@id='block_top_menu']/child::ul/child::li[2]/child::ul/child::li[2]");
	
	
	public WebElement getAccuserlink() {
		return getElement(accuserlink);
	}
	public WebElement getDresseslink() {
		return getElement(dresseslink);
	}
	public WebElement getEveningdress() {
		return getElement(eveningdress);
	}
	
	
	public EveningDressesPage clickOnDresses()
	{
		Actions action = new Actions(driver);
		action.moveToElement(getDresseslink()).build().perform();
		action.moveToElement(getEveningdress()).build().perform();
		getEveningdress().click();
		
		return getInstance(EveningDressesPage.class);
	}
	
}
