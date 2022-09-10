package Base;

import java.io.File;
import java.lang.System.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Testbase {
	
	

	public static WebDriver driver;
	public static Properties prop;
	
	public static Logger logger;
	
	
	
	
//	public Testbase()
//	{
//		
//		
//	}
	
	//initialization
	
	public static void initialization() throws MalformedURLException
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
		driver=new AppiumDriver(url,cap);
		
		System.out.println("Application Started...");

				
	}
	
	
	
	
	
	
	
	
	
	

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	
	}
	public static void takeScreenShot(String filename) throws Throwable
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("C:/Users/paramdeep/git/eyenus_BroadBand/eyenus/ScreenShots/"+filename+".jpg"));
		
	}
	
	public static WebElement waitForElementToBeVisible(WebDriver driver, WebElement webElement, int seconds )
	{
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement element = wait.until(ExpectedConditions.visibilityOf(webElement));
		return element;
	}
	public static String getTextvalue(WebElement element)
	{
		String text = element.getText();
		return text;
	}

}
 