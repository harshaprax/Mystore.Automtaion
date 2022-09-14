package com.mystore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;
import com.mystore.utils.Helper;

public class HomePage1 extends DriverManager{

	@FindBy(xpath=".//*[@id='header_**']/a/img")
	private WebElement imgLogo;
	
	@FindBy(linkText="Women")
	private WebElement lnkWomenTab;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement linkDressesTab;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement linkTShirtsTab;
	
	@FindBy(id="search_query_top")
	private WebElement SearchTB;
	
	@FindBy(xpath="//a[contains(text(),'Sign')]")
	private WebElement linkSingIn;
	
	@FindBy(xpath=".//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement linkBlousesTab;
	
	public HomePage1()
	{
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void clickonwomenTab()
	{
		lnkWomenTab.click();
	}
	
	
	
	public boolean verifyyourLogo()
	{
		Helper.HighLightElement(imgLogo);
		return imgLogo.isDisplayed();
		
	}
	public void clickOnSignIn()
	{
		linkSingIn.click();
	}
	
	
	public boolean verifyWomensTab()
	{
	return lnkWomenTab.isDisplayed();
	}
		
		public boolean verifyDressesTab()
		{
			return linkDressesTab.isDisplayed();
		}
		
		public boolean verifyTShirtsTab()
		{
			return linkTShirtsTab.isDisplayed();
		}	
		
		public boolean verifySearchBox()
		{
			return SearchTB.isDisplayed();
		}
		
		
	
	public String Verifyhomepagetitle()
	{
	return driver.getTitle();
	}
	
	public String validateWomenTab()
	{
		Actions action = new Actions(driver);
		action.moveToElement(lnkWomenTab).perform();
		action.moveToElement(linkBlousesTab).perform();
		return linkBlousesTab.getAttribute("title");
	}
	
	
}
