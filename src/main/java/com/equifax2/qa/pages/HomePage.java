package com.equifax2.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.equifax2.qa.base.BasePage;
import com.equifax2.qa.locators.HomePageLocator;

public class HomePage extends BasePage{

	public HomePageLocator homePageLocators;

	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		this.homePageLocators=new HomePageLocator();
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.homePageLocators);		
	}

	public void getURL() {
		driver.get("https://www.amazon.com/");

	}

	public void searchKey() {
		homePageLocators.searchKey.sendKeys("qa testing for beginners");
	}

	public void search() {
		homePageLocators.search.click();
		
	}

	
	

}
