package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BaseClass.BaseClass;

public class LoginPage extends BaseClass
{
	//Page Factory - OR
	@FindBy(xpath="//a[contains(@class,'login')]")
	WebElement lnkSignIn;
			
	@FindBy(id="email")
	WebElement EmailAddress; 
	
	@FindBy(id="passwd")
	WebElement PWD;
	
	@FindBy(id="SubmitLogin")
	WebElement btnSignIn;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SignIn(){
		
		lnkSignIn.click();
		EmailAddress.sendKeys("TestingMay2021@test.com");
		PWD.sendKeys("Password1");
		btnSignIn.click();
		System.out.println("Sign-In Successfully");
	}
}
