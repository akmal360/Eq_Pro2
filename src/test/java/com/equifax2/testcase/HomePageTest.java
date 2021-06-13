package com.equifax2.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.equifax2.qa.base.BasePage;
import com.equifax2.qa.locators.HomePageLocator;
import com.equifax2.qa.pages.HomePage;
import com.equifax2.qa.pages.SearchPage;

public class HomePageTest extends BasePage {
	
	
	public  HomePage homePage;
	public HomePageLocator homePageLocators;
	public SearchPage serchPage;



	@BeforeMethod
	public void initialization() {
		driver=new ChromeDriver();
		homePage=new HomePage(driver);
		homePageLocators=new HomePageLocator();
		serchPage=new SearchPage(driver);


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	}

	@Test
	public void Test() throws InterruptedException  {
		this.homePage.getURL();
		this.homePage.searchKey();
		this.homePage.search();

		String  expectedPrice="$47.49";
		String  actualPrice= this.serchPage.priceAssertion();
		AssertJUnit.assertTrue(actualPrice.contains(expectedPrice));

		serchPage.clickFirstElement();
		serchPage.clickAddtoCart();


		expectedPrice="$47.49";
		actualPrice= this.serchPage.priceAssertion2();
		AssertJUnit.assertTrue(actualPrice.contains(expectedPrice));		
		serchPage.clickCheckOut();				

		
//		This is extra work. If user already login. 
//		expectedPrice="$47.49";
//		actualPrice= this.serchPage.priceAssertion3();
//		Assert.assertTrue(actualPrice.contains(expectedPrice));	

	}

	
	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
