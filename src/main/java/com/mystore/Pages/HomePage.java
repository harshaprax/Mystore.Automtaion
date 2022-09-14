package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;

public class HomePage extends DriverManager {

	@FindBy(xpath=".//*[@id='header_logo']/a/img")
	private WebElement imgLogo;

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public boolean verifyyourLogo()
	{
		return imgLogo.isDisplayed();
	}	
	
}
