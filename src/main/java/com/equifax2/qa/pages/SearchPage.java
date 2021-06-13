package com.equifax2.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.equifax2.qa.base.BasePage;
import com.equifax2.qa.locators.SearchPageLocator;

public class SearchPage extends BasePage{

	public SearchPageLocator serchPageLocators;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		serchPageLocators=new SearchPageLocator();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.serchPageLocators);	
	}
	
	
	public void clickFirstElement() {
		serchPageLocators.firstElement.click();
		
	}

	public String priceAssertion() {
		return serchPageLocators.priceTag.getAttribute("textContent");
	}


	public void clickAddtoCart() {
		serchPageLocators.addToCart.click();		
	}


	public String priceAssertion2() {
		
		return serchPageLocators.priceTag2.getText();
	}


	public void clickCheckOut() {
		serchPageLocators.checkout.click();
		
	}


	public String priceAssertion3() {
		return serchPageLocators.priceTag3.getAttribute("textContent");
	}



}
