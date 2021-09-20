package com.page;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	//reference of Webdriver and webdriverwait(explicit wait)
	
	WebDriver driver;
	WebDriverWait wait;
	
	//parameterized constructor to initialize the driver
	public Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;		//this is a reference variable that refers to the current object.
		wait = new WebDriverWait(this.driver, 15);
		System.out.println("Webdriver wait....................................................................");
	}
	
	//abstract methods
	public abstract String getpageTitle();
	
	public abstract String getPageHeader(By locator);
	public abstract void selectDropDown(WebElement element,String selectVisibleText);
	
	public abstract WebElement getElement(By locator);
	
	public abstract void  waitForelementpresent(By locator);
	
	public abstract void  waitForPageTitle(String title);
	
	
	
	//create a method with java generics and return a new page
		
		public <TPage extends BasePage> TPage  getInstance(Class<TPage> pageClass)
		{
			try {
				return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
				//newInstance methos will give object of that particular class eg:HOmePage class
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null; 
			}
			
		}
		
}	
	
	

