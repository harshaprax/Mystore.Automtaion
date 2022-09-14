package com.mystore.Driver;




import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class DriverManager {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public DriverManager() {
		
		try
		{
			prop = new Properties();
			fis = new FileInputStream("./src/test/resources/mystore/msconfig/config.properties ");
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.err.println("No File Found "+e.getMessage());
		}
	}
	

    public void init_driver()  {
		String browser = prop.getProperty("browser");

		if (browser.trim().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/mystore/msbrowsers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.trim().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/mystore/msbrowsers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.trim().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./src/test/resources/mystore/msbrowsers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.err.println("please check the properties file for supported browser types");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://automationpractice.multiformis.com/index.php");
		//driver.get(prop.getProperty("QAURL"));
		get_qaurl();
		//quit_browser();
		
	}

    
   public void get_qaurl() 
    {
		String url = prop.getProperty("QAURL");
		driver.get(url);
	}
   
	
    public static void quit_browser()
	{
	driver.close();
	}	
		
		
}
	
	
	

