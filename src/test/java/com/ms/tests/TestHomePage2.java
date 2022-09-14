package com.ms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage2 extends Testbase{

	
	
	
	
	@Test(priority=1)
	public void testValidateWomensTab()
	{
		String title = hp1.validateWomenTab();
		Assert.assertEquals("Women", title);
	}

	
}
