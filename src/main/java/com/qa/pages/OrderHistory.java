package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.BaseClass.BaseClass;

public class OrderHistory extends BaseClass{
	
//	@FindBy (xpath="//a[@title='Back to orders']")
//	WebElement BackToOrders;
	
	@FindBy (xpath="//a[@title='My orders']")
	WebElement BackToOrders;
	
	@FindBy (xpath="//h1[@class='page-heading bottom-indent']")
	WebElement Heading;
	
	@FindBy (xpath="//a[@class='color-myaccount']")
	WebElement OrderRef;

	@FindBy (xpath="//td[@class='history_date bold']")
	WebElement Date;
	
	@FindBy (xpath="//span[@class='price']")
	WebElement Price;
	
	@FindBy (xpath="//span[@class='label dark']")
	WebElement Status;
	
	
	public OrderHistory(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void chkOrderHistory(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		BackToOrders.click();
		 //Assert.assertEquals("ORDER HISTORY", Heading);
		 System.out.println(Heading.getText());
		 OrderRef.click();
		 System.out.println("Order reference :" +OrderRef.getText());
		 System.out.println("Date : "+Date.getText());
		 System.out.println("Total price : " +Price.getText());
		 System.out.println("Status : "+Status.getText());
	}
}
