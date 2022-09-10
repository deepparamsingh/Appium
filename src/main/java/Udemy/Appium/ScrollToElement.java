package Udemy.Appium;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;
import io.appium.java_client.AppiumBy;

public class ScrollToElement extends Testbase {
	
	@FindBy(xpath = "//android.widget.TextView[@text='Views']")
	WebElement Views;
	
	@FindBy(xpath = "//android.widget.TextView[@text='WebView']")
	WebElement WebView;
	
	
	public ScrollToElement()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void performScrollToElement() throws Throwable
	{	
		Views.click(); 
		System.out.println(" Views");
		
		driver.findElement(AppiumBy.androidUIAutomator
				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		
		WebView.click();
		Thread.sleep(5000);
		System.out.println("Web View option Clicked ...");
		
	}

}
