package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends Page{
   
	
	public BasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getpageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		
		return getElement(locator).getText();
	
	}

	@Override
	public WebElement getElement(By locator) {
	
		WebElement element=null;
		
		try {
			element = driver.findElement(locator);
			return element;
		}
		catch(Exception e)
		{
			System.out.println("some error occured...."+locator.toString());
			e.printStackTrace();
		}
		
		return element;
		
	}

	@Override
	public void waitForelementpresent(By locator) {
		
		
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
		catch(Exception e)
		{
			System.out.println("some exception occured while waiting for element..."+locator.toString());
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
		
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			System.out.println("some exception occured while waiting for title..."+title);
		}
	}

	@Override
	public void selectDropDown(WebElement element,String selectValue) {
		// TODO Auto-generated method stub
		
		Select select = new Select(element);
		select.selectByVisibleText(selectValue);
		
	}
	
	
	
	
	
	
	
	

}
