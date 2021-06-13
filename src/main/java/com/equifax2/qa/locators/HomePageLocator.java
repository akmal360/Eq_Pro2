package com.equifax2.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocator {

	@FindBy(how = How.ID,using = "twotabsearchtextbox")
	@CacheLookup
	public WebElement searchKey;
	
	@FindBy(how = How.ID,using = "nav-search-submit-button")
	@CacheLookup
	public WebElement search;
	
}
