package com.ms.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mystore.Driver.DriverManager;
import com.mystore.Pages.HomePage1;
import com.mystore.Pages.LoginPage;
import com.mystore.Pages.TShirtsPage;
import com.mystore.Pages.TopsPage;
import com.mystore.Pages.WomensDressesPage;
import com.mystore.utils.ExcelLib;
import com.mystore.utils.Helper;

public class Testbase extends DriverManager {
	
	protected static ExtentReports report;
	protected static ExtentTest logger;
	
	LoginPage mslp;
	HomePage1 hp1;
	WomensDressesPage wp;
	TopsPage tp;
	TShirtsPage tsp;

	
	public Testbase() {
		super();
	}

	@BeforeSuite
	public void setupReport() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter("./msreports/index.html");
		report=new ExtentReports();
		report.attachReporter(extent);		
	}
	
	@BeforeMethod
	public void preCondition()

	{
		init_driver();
	
	     mslp = new LoginPage();
		 hp1 = new HomePage1();
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try {
				logger.fail("test failed",
				MediaEntityBuilder.createScreenCaptureFromPath(Helper.capturescreen(driver)).build());
								
								
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		 report.flush();
		 Helper.fn_sleep();
		 quit_browser();
	 }
	
	@DataProvider(name="actidata2")
	public Object[][] testData()
	{
		ExcelLib xl = new ExcelLib("./src/test/resources/mystore/msTestdata/actiData2.xlsx");
		int rows = xl.getRowCount(0);
		Object data[][] = new Object[rows][2];
		
		for(int i=0; i<rows;i++)
		{
			data[i][0]=xl.getCellData(0, i, 0);
			data[i][1]=xl.getCellData(0, i, 1);
		}
		
		return data;
	}

}
