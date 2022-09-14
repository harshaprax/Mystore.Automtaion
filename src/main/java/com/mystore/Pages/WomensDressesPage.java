package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;

public class WomensDressesPage extends DriverManager {

	@FindBy(xpath="//a[@title='Women']")
    private WebElement linkTops;
	
	public WomensDressesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonTopsLink()
	{
		linkTops.click();
	}
	
	
	
}
