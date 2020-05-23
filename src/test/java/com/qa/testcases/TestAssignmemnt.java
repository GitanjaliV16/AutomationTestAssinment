package com.qa.testcases;

import org.testng.annotations.Test;
import com.qa.BaseClass.BaseClass;
import com.qa.pages.CreateAccount;
import com.qa.pages.LoginPage;
import com.qa.pages.OrderHistory;
import com.qa.pages.PaymentFlow;
import com.qa.pages.Shopping;

public class TestAssignmemnt extends BaseClass{
	

	@Test(priority=1)
	public void RegisterTest() throws InterruptedException{
		CreateAccount ac = new CreateAccount(driver);
		System.out.println("Registarion Test: -----------");
		ac.UserRegistaration();
		ac.SignOut();
	}
	
	@Test(priority=2)
	public void LoginPageTest(){
		LoginPage login = new LoginPage(driver);
		login.SignIn();
	}
	
	@Test(priority=3)
	public void shoppingTest(){
		Shopping sp = new Shopping(driver);
		sp.ShopItem();
		sp.chkAddress();
		sp.chkShipping();
	}
	
	@Test(priority=4)
	public void PaymentTest(){
		PaymentFlow p = new PaymentFlow(driver);
		p.Pay();
	}
	
	@Test(priority=5)
	public void OrderHistoryTest(){
		OrderHistory os = new OrderHistory(driver);
		os.chkOrderHistory();
	}
}
