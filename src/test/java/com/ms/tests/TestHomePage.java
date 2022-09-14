package com.ms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class TestHomePage extends Testbase {

	@Test(priority=1)
	public void testVerifyHomePageElements1()
	{
		ExtentTest logger = report.createTest("Verifiying Home Page Elements");
		
		
		String title = hp1.Verifyhomepagetitle();
		Assert.assertEquals("My Store", title);
		logger.pass("Home Page Title Verified");
		
	    boolean logoflag =hp1.verifyyourLogo();
		Assert.assertTrue(logoflag);
		logger.pass("MyStorelogo");
		
		Assert.assertTrue(hp1.verifyWomensTab(),"Womens Tab not displayed");
		logger.pass("WomensTab Verified");
		
		boolean dressflag =hp1.verifyDressesTab();
		Assert.assertTrue(dressflag);
		logger.pass("DressesTab Verified");
		
		boolean tshirtsflag =hp1.verifyTShirtsTab();
		Assert.assertTrue(tshirtsflag);
		logger.pass("TshirtsTab Verified");
		
		boolean sbflag =hp1.verifySearchBox();
		Assert.assertTrue(sbflag);
		logger.pass("Search Box is Verified");
	}	

		@Test(priority=2)
	public void testValidateWomensTab()
	{
		String title = hp1.validateWomenTab();
		Assert.assertEquals("Women", title);
	}

}
