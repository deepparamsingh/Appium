package Udemy.Appium;

import java.net.URL;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HomePage {
	
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		
		try {
		openApp();
		}
		catch (Exception e) {
			
		}
	

	}
	
	public static void openApp() throws MalformedURLException
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("deviceName", "honor 7A");
		cap.setCapability("udid", "XUV3Y18823027827");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8.0.0");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability("autoAcceptAlerts", true);
		cap.setCapability("autoDismissAlerts", false);
	
		URL url= new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		
		System.out.println("Application Started...");
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Preference clicked...");
		driver.quit();
				
	}

}
