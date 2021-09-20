package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EveningDressesPage extends BasePage {

	public EveningDressesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		
		
	}

	
	
	private By productlink = By.xpath("//img[@title='Printed Dress']");
	private By addtocart = By.xpath("//a[@title='Add to cart']");
	private By proceedtocheckout = By.xpath("//div[@id='layer_cart']/child::div/child::div[2]/child::div[4]/child::a");
	
	public String getEveningDressPageTitle()
	{
		return getpageTitle();	}

	public WebElement getProductlink() {
		return getElement(productlink);
	}

	public WebElement getAddtocart() {
		return getElement(addtocart);
	}
	
	public WebElement getProceedtocheckout() {
		return getElement(proceedtocheckout);
	}

	public void waitforProceedtoCheckout()
	{
		waitForelementpresent(proceedtocheckout);
	}
	
	
	public OrderPage clickProceedToCheckout()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", getProductlink());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(getProductlink()).build().perform();
		getAddtocart().click();
		System.out.println("Added to cart.................");
		waitforProceedtoCheckout();
		getProceedtocheckout().click();
		return getInstance(OrderPage.class);		
	}
	
	
	
	
	
	
}
