package Udemy.Appium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import Base.Testbase;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPress extends Testbase{
	
	@FindBy(xpath = "//android.widget.TextView[@text='Views']")
	WebElement Views;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
	WebElement ExpandableLists;
	
	@FindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
	WebElement  CustomAdapter;
	
	@FindBy(xpath = "//android.widget.TextView[@text='People Names']")
	WebElement PeopleNames;
	

	
	
	
	public LongPress()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void performLongPress() throws Throwable
	{	
		Views.click(); 
		System.out.println(" Views");
		ExpandableLists.click();
		System.out.println(" Expandable list");
		CustomAdapter.click();
		System.out.println(" CustomAdapter");
		
		Thread.sleep(3000);
		//LONG PRESS CODE
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId",((RemoteWebElement)PeopleNames).getId(),"duration",2000));
		
//		TouchActions touch = new TouchActions(driver);
//		action.longPress(PeopleNames).release().perform();
//		
//		
//		LongPressOptions longpressOption = new LongPressOptions();
//		longpressOption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(PeopleNames));
//		touch.longPress(PeopleNames).release().perform();
		
		
//		TouchActions action = new TouchActions(driver);
//		action.longPress(PeopleNames);
//		action.perform();


	}
	

}
