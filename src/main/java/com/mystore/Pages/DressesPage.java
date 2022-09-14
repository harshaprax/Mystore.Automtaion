package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;

public class DressesPage extends DriverManager {
	
	//***********************Object Repository******************************//
	
			@FindBy(xpath="//a[@title='Dresses'][1]")
			private WebElement linkCasualDresses;
			
			//***********************Initialization******************************//
			
			public DressesPage()
			{
				PageFactory.initElements(driver, this);
			}
			
			//***********************Action******************************//
			
			public void clickOnCasualDresses()
			{
				linkCasualDresses.click();
			}
	

}
