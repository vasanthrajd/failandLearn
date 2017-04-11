package common_restapi_code;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class iOSAppium {
	
	
	private static AppiumDriver driver;
	

	@Test
	public static void testAPI(String Appiumurl)  {
		
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("platformVersion", "9.2");
    capabilities.setCapability("deviceName", "iPhon6");
    capabilities.setCapability("platformName","iOS");
    //capabilities.setCapability("browserName", "safari");
    capabilities.setCapability("app", "http://tcportal21qasm.win.keynote.com/app/5446.ipa");
  
    try {
		driver = new IOSDriver(new URL(Appiumurl), capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
		e.printStackTrace();
		
	}
	
    
    
    /*driver.get("http://www.google.com");
	//screenshot("screenshot" + System.currentTimeMillis());
	driver.get("http://www.yahoo.com");
	//screenshot("screenshot" + System.currentTimeMillis());
	driver.get("http://www.bing.com");
	//screenshot("screenshot" + System.currentTimeMillis());
*/    
    
    driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[1]/UIAStaticText[1]")).click();
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[2]/UIATextField[1]")).sendKeys("Hello");
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]/UIATextField[1]")).sendKeys("Mytesting");
	driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[4]/UIATextField[1]")).sendKeys("777 Mariners island Blvd San Mateo");
	    	
    
	}

}
