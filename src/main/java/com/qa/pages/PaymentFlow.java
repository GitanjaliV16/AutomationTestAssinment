package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BaseClass.BaseClass;

public class PaymentFlow extends BaseClass{
	
	@FindBy (id="step_end")
	WebElement PaymentTab;
	
	@FindBy (xpath="//a[@class='bankwire']")
	WebElement NetBanking;
	
	@FindBy (xpath="//a[@class='cheque']")
	WebElement ByCheque;
	
//	@FindBy (xpath="//h3[@class='page-subheading']")
//	WebElement BankWirePay;
	
	@FindBy (xpath="//div[@class='box cheque-box']/h3")
	WebElement BankWirePay;
	
	@FindBy (xpath="//p[@id='cart_navigation']/button")
	WebElement ConfirmOrder;
	
	@FindBy (xpath="//h3[@class='page-subheading']")
	WebElement checkPay;
	
	@FindBy (xpath="//h1[@class='page-heading']")
	WebElement oHeading;
	
	@FindBy (xpath="//div[@class='box']/p/strong")
	WebElement oMsg;
	
	
	public PaymentFlow(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Pay(){
		NetBanking.click();
		//System.out.println("You have chosen to pay by :"+BankWirePay.getText());
		ConfirmOrder.click();

		System.out.println(oHeading.getText());
		System.out.println(oMsg.getText());
		
	}
}
