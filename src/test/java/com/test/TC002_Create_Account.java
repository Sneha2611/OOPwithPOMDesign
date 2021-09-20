package com.test;

import org.testng.annotations.Test;

import com.page.CreateAccountPage;
import com.page.LandingPage;
import com.page.SignInPage;

public class TC002_Create_Account extends BaseTest {
	
	@Test
	
	public void verifyTC002()
	{
		SignInPage signin = page.getInstance(LandingPage.class).clickOnSignIn();
		
		CreateAccountPage createaccpage =  page.getInstance(SignInPage.class).clickCreateAccount();
		page.getInstance(CreateAccountPage.class).addCreateaccDetails();
		
	
	}

}
