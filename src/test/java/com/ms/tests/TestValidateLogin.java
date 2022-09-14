package com.ms.tests;

import org.testng.annotations.Test;



public class TestValidateLogin extends Testbase{

	@Test
	public void testLoginFunctioanlity()
	{
		hp1.clickOnSignIn();
		mslp.validateSignIn();
	}

	
	
	
	
}
