package com.equifax2.qa.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPageLocator {

	@FindBy(how = How.XPATH,using = "//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span")
	@CacheLookup
	public WebElement firstElement;



	@FindBy(how = How.CSS,using = "#search > div.s-desktop-width-max.s-opposite-dir > div > div.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span:nth-child(4) > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(2) > div > span > div > div > div > div > div:nth-child(2) > div.sg-col.sg-col-4-of-12.sg-col-8-of-16.sg-col-12-of-20 > div > div.sg-row > div.sg-col.sg-col-4-of-12.sg-col-4-of-16.sg-col-4-of-20 > div > div.a-section.a-spacing-none.a-spacing-top-small > div:nth-child(2) > a > span:nth-child(1) > span:nth-child(2)")
	@CacheLookup
	public WebElement priceTag;


	@FindBy(how = How.ID,using = "add-to-cart-button")
	@CacheLookup
	public WebElement addToCart;



	@FindBy(how = How.CSS,using = "#hlb-subcart > div.a-row.a-spacing-micro > span > span.a-color-price.hlb-price.a-inline-block.a-text-bold")
	@CacheLookup
	public WebElement priceTag2;



	@FindBy(how = How.ID,using = "hlb-ptc-btn-native")
	@CacheLookup
	public WebElement checkout;


	@FindBy(how = How.CSS,using = "#subtotals-marketplace-table > tbody > tr:nth-child(1) > td.a-text-right.aok-nowrap.a-nowrap")
	@CacheLookup
	public WebElement priceTag3;

}
