package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.qa.BaseClass.BaseClass;

public class CreateAccount extends BaseClass {
	
	//Page Factory - OR
		@FindBy(xpath="//a[contains(@class,'login')]")
		WebElement SignIn;
		
		@FindBy(id="email_create")
		WebElement Email;
		
		@FindBy(id="SubmitCreate")
		WebElement CreateAcc;
		
		@FindBy(id="id_gender1")
		WebElement Mr;
		
		@FindBy(id="customer_firstname")
		WebElement Fname;
		
		@FindBy(id="customer_lastname")
		WebElement Lname;
		
		@FindBy(id="passwd")
		WebElement Pwd;
		
		@FindBy(id="days")
		WebElement Day;
		
		@FindBy(id="months")
		WebElement Month;
		
		@FindBy(id="years")
		WebElement Year;
		
		@FindBy(id="company")
		WebElement Company;
		
		@FindBy(id="address1")
		WebElement Address1;
		
		@FindBy(id="address2")
		WebElement Address2;
		
		@FindBy(id="city")
		WebElement City;
		
		@FindBy(id="id_state")
		WebElement State;
		
		@FindBy(id="postcode")
		WebElement Zip;
		
		@FindBy(id="id_country")
		WebElement Country;
		
		@FindBy(id="phone_mobile")
		WebElement Mobile;
		
		@FindBy(id="alias")
		WebElement Alias;
		
		@FindBy(id="submitAccount")
		WebElement Register;
		
		@FindBy(xpath="//a[@title='Log me out']")
		WebElement SignOut;
		
		@FindBy(id="//a[@title='View my customer account']/span")
		WebElement Title;
		
		
		public CreateAccount(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void UserRegistaration(){
			
			SignIn.click();
			Email.sendKeys("TestingMay2021@test.com");
			CreateAcc.click();
			Mr.click();
			Fname.sendKeys("Ram");
			Lname.sendKeys("Patil");
			Pwd.sendKeys("Password1");
			
			// Select date
			Select day = new Select(Day);
			day.selectByIndex(16);
			// Select Month
			Select month = new Select(Month);
			month.selectByIndex(5);
			// Select Month
			Select yr = new Select(Year);
			yr.selectByValue("2020");
			
			Company.sendKeys("CrossAsyst");
			Address1.sendKeys("High Street, BA133BN");
			Address2.sendKeys("Wellas Apartment, unit-104, 2nd sfloor");
			City.sendKeys("Houston");	
			Select state = new Select(State);
			state.selectByVisibleText("New York");
			Zip.sendKeys("00000");
			Select country = new Select(Country);
			country.selectByVisibleText("United States");
			Mobile.sendKeys("022-1002003004");
			Alias.sendKeys("Testing1");
			Register.click();
			
			//Assert.assertEquals(Title, "Ram Patil");
			System.out.println("User Registered Successfully");
		}
		
		public void SignOut(){
			SignOut.click();
			System.out.println("User Sign Out Successfully");
		}
		

}
