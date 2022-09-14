package com.ms.tests;


import org.testng.annotations.Test;

public class TestValidateLoginfromExcel extends Testbase {
	@Test(dataProvider="actidata2")
	public void testLoginFunctioanlity(String Username, String Password)
	{
		hp1.clickOnSignIn();
		mslp.validateSignIn2(Username, Password);
	}	
	
}
