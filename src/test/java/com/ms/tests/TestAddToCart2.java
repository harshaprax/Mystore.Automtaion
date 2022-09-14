package com.ms.tests;



import org.testng.annotations.Test;


import com.mystore.Pages.HomePage1;
import com.mystore.Pages.TShirtsPage;
import com.mystore.Pages.TopsPage;
import com.mystore.Pages.WomensDressesPage;

public class TestAddToCart2 extends Testbase{
	HomePage1 hp1;
	WomensDressesPage wp;
	TopsPage tp ;
	TShirtsPage tsp;
	
	
	
	
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
		
	
	
	
	
	
}
