package com.equifax2.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public WebDriver driver;

	@BeforeClass
    public  void setUpWebDriver() {
        WebDriverManager.chromedriver().setup();    
       
    }

}
