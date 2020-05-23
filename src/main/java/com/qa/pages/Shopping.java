package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.BaseClass.BaseClass;

public class Shopping extends BaseClass{
	
	//Page Factory - OR
	@FindBy (xpath="//a[@title='Women']")
	WebElement Woman;

	@FindBy (xpath="//a[@title='Casual Dresses']")
	WebElement CasualDresses;
	
	@FindBy (xpath="//a[@class='icon-eye-open']")
	WebElement QuickView;
	
	@FindBy (xpath="//i[@class='icon-plus']")
	WebElement Quantity;

	@FindBy (xpath="//p[@id='add_to_cart']/button/span")
	WebElement AddToCart;
	
	@FindBy (xpath="//i[@class='icon-ok']")
	WebElement Ok;
	
	@FindBy (xpath="//a[@title='Proceed to checkout']/span")
	WebElement chkOut;
	
	@FindBy (xpath="//table/tbody/tr/td[2]/p")
	WebElement pDescription;
	
	@FindBy (xpath="//table/tbody/tr/td[4]/span")
	WebElement UnitPrice;
	
	@FindBy (xpath="//table/tbody/tr/td[5]/input[2]")
	WebElement Qty;
	
	@FindBy (id="total_product")
	WebElement TotalProductCost;
	
	@FindBy (id="total_shipping")
	WebElement TotalshippingCost;
	
	@FindBy (id="total_price_without_tax")
	WebElement total;
	
	@FindBy (id="total_tax")
	WebElement Tax;
	
	@FindBy (id="total_price")
	WebElement TOTAL;
	
	@FindBy (xpath="//p[@class='cart_navigation clearfix']/a/span")
	WebElement CheckOut;
	
	@FindBy (id="addressesAreEquals")
	WebElement AddressChkBox;
	
	@FindBy (xpath="//button[@name='processAddress']/span")
	WebElement processAddress;	
	
	@FindBy (id="cgv")
	WebElement cgv;
	
	@FindBy (xpath="//button[@name='processCarrier']/span")
	WebElement processCarrier;	
	
	public Shopping(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ShopItem(){
		
		Actions action= new Actions(driver);
		action.moveToElement(Woman).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
	
	//	action.moveToElement(driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']")));
	//	action.moveToElement(driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")));
		action.moveToElement(driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img"))).click().build().perform();
        js.executeScript("window.scrollBy(0,500)", "");
		
        WebElement frame = driver.findElement(By.xpath("//iframe[starts-with(@id,'fancybox-frame1590')]"));
        driver.switchTo().frame(frame);
        
//		QuickView.click();
        js.executeScript("window.scrollBy(0,500)", "");
		Quantity.click();
		AddToCart.click();
		
		
//		driver.findElement(By.xpath("//a[@title='Add to cart']")).click();
		chkOut.click();
		System.out.println("Description : "+pDescription.getText());
		System.out.println("Unit price : "+UnitPrice.getText());
		System.out.println("Qty : "+Qty.getText());
		System.out.println("Total products : "+TotalProductCost.getText());
		System.out.println("Total shipping : "+TotalshippingCost.getText());
		System.out.println("Total without Tax : "+total.getText());
		System.out.println("Tax : "+Tax.getText());
		System.out.println("Total : "+TOTAL.getText());
		CheckOut.click();

	}
	
	public void chkAddress(){
		
		if (AddressChkBox.isSelected()){
			processAddress.click();
		}
		else AddressChkBox.click();
//			processAddress.click();
	}
	
	public void chkShipping(){
		if (cgv.isSelected()){
			processCarrier.click();
		}
		else cgv.click();
		processCarrier.click();
		
	}
}
