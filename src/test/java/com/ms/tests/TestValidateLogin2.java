package com.ms.tests;

import org.testng.annotations.Test;

public class TestValidateLogin2 extends Testbase{

	@Test
	public void testLoginFunctioanlity()
	{
		hp1.clickOnSignIn();
     //   mslp.validateSignIn2("dummytest@gmail.com", "Pass@123");
		mslp.validateSignIn2(prop.getProperty("Username"), prop.getProperty("Password"));
	}

	
}
