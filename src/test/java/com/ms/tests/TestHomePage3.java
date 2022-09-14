package com.ms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestHomePage3 extends Testbase {

	@Test(priority=1)
	public void testVerifyHomePageElements1()
	{
		logger = report.createTest("Verifiying Home Page Elements");
		String title = hp1.Verifyhomepagetitle();
		Assert.assertEquals("My Store", title);
		logger.pass("Home Page Title Verified");
		Assert.assertTrue(hp1.verifyyourLogo());
		logger.pass("My Store Logo");
		
		Assert.assertTrue(hp1.verifyWomensTab());
		logger.pass("DressesTab Verified");
		Assert.assertTrue(hp1.verifyDressesTab());
		Assert.assertTrue(hp1.verifySearchBox());
		Assert.assertTrue(hp1.verifyTShirtsTab());
		
		
	}	
	
}
