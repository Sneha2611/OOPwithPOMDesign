package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage{

	public OrderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	private By orderpageheadre = By.xpath("//div[@id='center_column']/child::h1");
	private By proceedtocheckout1 = By.xpath("//p[@class='cart_navigation clearfix']/child::a[@title='Proceed to checkout']");
	private By proceedtocheckout2 = By.xpath("//button[@name='processAddress']");
	private By checkbox = By.xpath("//input[@name='cgv']");
	private By proceedtocheckout3 = By.xpath("//button[@name='processCarrier']");
	private By paymentbywire = By.xpath("//a[@title='Pay by bank wire']");
	
	
	public String getOrderPageTitle()
	{
		return getpageTitle();
	}
	
	public String getOrderPageHeader()
	{
		return getPageHeader(orderpageheadre);
	}
	
	
	public WebElement getProceedtocheckout1() {
		return getElement(proceedtocheckout1);
	}

	
	public WebElement getProceedtocheckout2() {
		return getElement(proceedtocheckout2);
	}

	

	public WebElement getCheckbox() {
		return getElement(checkbox);
	}

	

	public WebElement getProceedtocheckout3() {
		return getElement(proceedtocheckout3);
	}

	

	public WebElement getPaymentbywire() {
		return getElement(paymentbywire);
	}

	

	public PaymentPage clickpProceedtoCheckout()
	{
		getProceedtocheckout1().click();
		getProceedtocheckout2().click();
		getCheckbox().click();
		getProceedtocheckout3().click();
		getPaymentbywire().click();
		return getInstance(PaymentPage.class);
	}
	
	
}
