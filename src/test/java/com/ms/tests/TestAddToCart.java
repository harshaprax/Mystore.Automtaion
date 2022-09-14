package com.ms.tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.Driver.DriverManager;

import com.mystore.Pages.HomePage1;
import com.mystore.Pages.TShirtsPage;
import com.mystore.Pages.TopsPage;
import com.mystore.Pages.WomensDressesPage;

public class TestAddToCart extends DriverManager {
	HomePage1 hp1;
	WomensDressesPage wp;
	TopsPage tp ;
	TShirtsPage tsp;
	
	public TestAddToCart()
	{
		super();
	}
	@BeforeMethod
	public void preCondition()
	{
		init_driver();
		 hp1 = new HomePage1();
		 wp = new WomensDressesPage();
		 tp = new TopsPage();
		 tsp = new TShirtsPage();
	}
	
	@Test
	public void testAddProcuctToCartFunctionality()
	{
	     hp1 = new HomePage1();
		
		 hp1.clickonwomenTab();
		 
	     wp.clickonTopsLink();
		
		 tp.clickonTshirts();
		 tsp.clickonimg();
		 tsp.tshirtsize();
		
			
		
		
		
		 //tsp.AddToCart();
	}	
		
	
	@AfterMethod
		public void teardown()
		{
		  // driver.close();
	    }
	
	
	
}
