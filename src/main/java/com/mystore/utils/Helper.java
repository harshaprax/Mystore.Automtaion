package com.mystore.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mystore.Driver.DriverManager;

public class Helper extends DriverManager {

public static void fn_sleep( ) {
		
		try 
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static  String capturescreen(WebDriver driver) {
		
	TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);	
	
//File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	   String screenshotpath ="C:\\Workspace\\com.mystore.automationframework\\com.mystore.automation\\msreports\\Screens\\act.png";
	       try {
				
	    	 
	    	   org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotpath));
	    	  } catch (IOException e) {
				e.printStackTrace();
			}
			return screenshotpath;	
		}
	public static void HighLightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red;');",ele);
	}
	
	
	
}
