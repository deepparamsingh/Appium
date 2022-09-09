package Udemy.Appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class HomePage extends Testbase {
	
	
	//PageFactory
		@FindBy(xpath = "//android.widget.TextView[@text='Preference']")
		WebElement preference;
	
		
		@FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
		WebElement preferenceDependencies;
		
		@FindBy(id = "android:id/checkbox")
		WebElement wifiCheckbox;
		
		@FindBy(xpath = "//android.widget.TextView[@text='WiFi settings']")
		WebElement wifiSettings;
		
		@FindBy(id = "android:id/edit")
		WebElement wifiSettingValue;
		
		
		@FindBy(xpath = "//android.widget.Button[@text='OK']")
		WebElement wifiSettingAccept;
		
		
	
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void openHomepage()
	{	
		
		//preference.click();
		clickOn(driver, preference, 5);
		System.out.println("Preference clicked...");
		clickOn(driver, preferenceDependencies, 5);		
		System.out.println("Preference Dependencies clicked...");
		clickOn(driver, wifiCheckbox, 5);
		System.out.println("Wifi CheckBox clicked...");
		clickOn(driver, wifiSettings, 5);
		System.out.println("WifiSettings TAB clicked...");
		clickOn(driver, wifiSettings, 5);
		System.out.println("Enter value in WifiSettings...");
		sendKeys(driver, wifiSettingValue, 5, "Paramdeep");
		System.out.println("WifiSettings value Entered...");
		clickOn(driver, wifiSettingAccept, 5);
		System.out.println("Wifisettings value ACCEPTED...");
	}
	

}
	
	

