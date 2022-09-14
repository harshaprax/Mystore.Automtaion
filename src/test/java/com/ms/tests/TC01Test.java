package com.ms.tests;

import org.testng.annotations.Test;

import com.mystore.Driver.DriverManager;
import com.mystore.Pages.HomePage;

public class TC01Test extends DriverManager {

	public TC01Test()
	{
		super();
	}
	
	@Test
	public void testHomePage()
	{
	     init_driver();
	     HomePage homepage = new HomePage();
		 boolean flag = homepage.verifyyourLogo();
	     System.out.println(flag);
	     driver.close();
	}
	
}
