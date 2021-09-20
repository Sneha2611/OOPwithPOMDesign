package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By paymentheader = By.xpath("//h1");	//ORDER SUMMARY
	private By bankwireheader = By.xpath("//h3");	//BANK-WIRE PAYMENT.
	private By confirmorder = By.xpath("//button[@type='submit']/span/i");
	
	
	
	public String getPaymentheader() {
		return getPageHeader(paymentheader);
	}
	public String getBankwireheader() {
		return getPageHeader(bankwireheader);
	}
	public WebElement getConfirmorder() {
		return getElement(confirmorder);
	}
	
	public OrderConfirmationPage clickOnConfirmOrder()
	{
		getConfirmorder().click();
		
		return getInstance(OrderConfirmationPage.class);
	}
	
	
	
	
}
