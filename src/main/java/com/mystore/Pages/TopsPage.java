package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;

public class TopsPage extends DriverManager{

	//@FindBy(xpath=".//*[@id='subcategories']/ul/li[1]/h5/a")
	//private WebElement imgTshirts;

	@FindBy(xpath="//ul[@class='dynamized']//a[normalize-space()='Tops']")
	private WebElement imgTshirts;

	
	public TopsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickonTshirts()
	{
		imgTshirts.click();
	}


	
	
}
