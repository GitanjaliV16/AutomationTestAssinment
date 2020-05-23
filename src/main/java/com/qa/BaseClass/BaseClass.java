package com.qa.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.util.TestUtils;

//import Listeners.WebEventListener;

public class BaseClass {
	
	public WebDriver driver;
	//public static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	@BeforeTest
	public void setBrowser(){
		
		String chromeExePath = "C:\\My_Folder\\SeleniumTest\\SeleniumPractice\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);	
		
		driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				
	}
	
//	@AfterTest
//	public void tearDown(){
//		
//		driver.close();
//	}
//	
}
