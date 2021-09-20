package com.page;

import com.Utils.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SignInPage extends BasePage {

	//page locators
	
	private By email = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='passwd']");
	private By signin_btn = By.xpath("//button[@id='SubmitLogin']");
	
	private By email_create_acc = By.xpath("//input[@id='email_create']");
	private By create_acc_btn = By.xpath("//button[@id='SubmitCreate']");
	
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getEmail() {
		return getElement(email);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getSignin_btn() {
		return getElement(signin_btn);
	}

	public String getSignInPageTitle()
	{
		return getpageTitle();
	}
	
	
	public WebElement getEmail_create_acc() {
		return getElement(email_create_acc);
	}

	public WebElement getCreate_acc_btn() {
		return getElement(create_acc_btn);
	}

	public HomePage doLogin(String emailid , String pwd)
	{
		getEmail().sendKeys(emailid);
		getPassword().sendKeys(pwd);
		getSignin_btn().click();
		
		return getInstance(HomePage.class);
		
	}
	
	
	
	
	public CreateAccountPage clickCreateAccount() {
		System.out.println("create acc .........................");
		waitForelementpresent(email_create_acc);
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sneha\\Downloads\\CreateAccountNew.xls");
		int rowCount = reader.getRowCount("EmailAddress");
		
		for(int rowNum=2 ; rowNum<=rowCount ; rowNum++)
		{
			String email_id = reader.getCellData("EmailAddress", "emailID", rowNum);
			System.out.println(email_id);
			getEmail_create_acc().clear();
			getEmail_create_acc().sendKeys(email_id);
		}
		
		
		getCreate_acc_btn().click();
		
		return getInstance(CreateAccountPage.class);
	}
	
	
	
}
