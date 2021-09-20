package com.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.CustomerAccPage;
import com.page.EveningDressesPage;
import com.page.HomePage;
import com.page.LandingPage;
import com.page.OrderConfirmationPage;
import com.page.OrderPage;
import com.page.PaymentPage;
import com.page.SignInPage;

public class TC001_End_To_End extends BaseTest {
	
	@Test
	public void  verifyTC001()
	{
		
		SignInPage signin = page.getInstance(LandingPage.class).clickOnSignIn();
		
		HomePage homepage = page.getInstance(SignInPage.class).doLogin("sneha123@yahoo.in", "sneha123");
		
		String homepagetitle = homepage.getHomePageTitle();
		System.out.println(homepagetitle);
		Assert.assertEquals(homepagetitle,"My account - My Store");
		
		String homepageheader = homepage.getHeader();
		System.out.println(homepageheader);
		Assert.assertEquals(homepageheader, "MY ACCOUNT");
		
		System.out.println(homepage.getOrderhistory().isDisplayed());
		
		System.out.println(homepage.getHomebtn().isDisplayed());
		
		homepage.clickHomeBtn();
		
		WebElement usracclink =  page.getInstance(CustomerAccPage.class).getAccuserlink();
		System.out.println(usracclink.toString());
		System.out.println(usracclink.isDisplayed());
		
		EveningDressesPage evedresspage =  page.getInstance(CustomerAccPage.class).clickOnDresses();
		//Evening Dresses - My Store
		
		String evedresstitle = page.getInstance(EveningDressesPage.class).getEveningDressPageTitle();
		System.out.println(evedresstitle);
		Assert.assertEquals(evedresstitle, "Evening Dresses - My Store");
		
		
		 OrderPage orderpage= page.getInstance(EveningDressesPage.class).clickProceedToCheckout();
		 
		 String ordertitle = page.getInstance(OrderPage.class).getOrderPageTitle();
		System.out.println(ordertitle);
		Assert.assertEquals(ordertitle,"Order - My Store");
		
		String orderheader = page.getInstance(OrderPage.class).getOrderPageHeader();
		System.out.println(orderheader);
		//Assert.assertEquals(orderheader,"SHOPPING-CART SUMMARY\r\n"
			//	+ "Your shopping cart contains: 1 Product");
		
		PaymentPage paymentpage= page.getInstance(OrderPage.class).clickpProceedtoCheckout();
		
		String paymentheader = page.getInstance(PaymentPage.class).getPaymentheader();
		System.out.println(paymentheader);
		Assert.assertEquals(paymentheader,"ORDER SUMMARY");
		
		String bankwireheader = page.getInstance(PaymentPage.class).getBankwireheader();
		System.out.println(bankwireheader);
		Assert.assertEquals(bankwireheader,"BANK-WIRE PAYMENT.");
		
		OrderConfirmationPage ocpage= page.getInstance(PaymentPage.class).clickOnConfirmOrder();
		
		
		String ocpagetitle = page.getInstance(OrderConfirmationPage.class).getOCPageTitle();
		System.out.println(ocpagetitle);
		Assert.assertEquals( ocpagetitle,"Order confirmation - My Store");
		
		
		String ocpageheader = page.getInstance(OrderConfirmationPage.class).getOcpageheader();
		System.out.println(ocpageheader);
		Assert.assertEquals( ocpageheader,"ORDER CONFIRMATION");
		
		String ocmessage = page.getInstance(OrderConfirmationPage.class).getOcmessage();
		System.out.println(ocmessage);
		Assert.assertEquals( ocmessage,"Your order on My Store is complete.");
		
		LandingPage lppage =  page.getInstance(OrderConfirmationPage.class).clickSignOut();
		
		
}	

}
