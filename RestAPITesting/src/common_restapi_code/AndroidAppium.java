package common_restapi_code;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidAppium {
private static AppiumDriver driver;
	

	@Test
	public static void testAPI(String Appiumurl) throws InterruptedException  {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Samsung");

		capabilities.setCapability("platformVersion", "5.0.1");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.expensemanager");
		capabilities.setCapability("appActivity","com.expensemanager.ExpenseManager");
		
    try {
		driver = new AndroidDriver(new URL(Appiumurl), capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
		e.printStackTrace();
		
	}
	
   
	Thread.sleep(9000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.name("Add New Expense")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.expensemanager:id/expenseAmountInput']")).sendKeys("80");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.expensemanager:id/payee']")).sendKeys("BOFA");
  	driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.expensemanager:id/editCategory']")).click();
  	driver.findElement(By.name("Loans")).click();
  	driver.findElement(By.name("Auto")).click();
  	driver.findElement(By.name("OK")).click();
    
    
	}

}
