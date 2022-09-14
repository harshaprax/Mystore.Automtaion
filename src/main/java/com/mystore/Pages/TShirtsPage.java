package com.mystore.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.Driver.DriverManager;

public class TShirtsPage extends DriverManager {

	//@FindBy(xpath=".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
	//private WebElement imgProduct;
    
	@FindBy(xpath ="//a[contains(text(),'T-shirts')] ")
     private WebElement imgProduct;

	@FindBy(xpath="//img[@title='Faded Short Sleeves T-shirt']")
	private WebElement clickonimg;
	
     @FindBy(xpath=".//*[@id='add_to_cart']/button")
     private WebElement btnAddtoCart;
     
    // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='demoaut']"));
		//driver.switchTo().frame(iframe);

    
     @FindBy(xpath = "//select[@id='group_1']") WebElement selsize;
		 
    // selsize = new Select(size);
	//	selmonth.selectByVisibleText("Jan");
		//Thread.sleep(1000);
		
		 //select[@id='group_1']

      public TShirtsPage()
     {
      PageFactory.initElements(driver, this);
      }

      public void clickonimg()
  	{
  		clickonimg.click();
  	}
   
      
      public void AddToCart()
        {
            imgProduct.click();
            //btnAddtoCart.click();
        }
      public void tshirtsize()
      {
        selsize.click();
      }
	
}
