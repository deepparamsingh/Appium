package Udemy.Appium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;

public class ScrollToElementTest extends Testbase {
	

ScrollToElement scrollToElement;

	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   scrollToElement = new ScrollToElement();
		   
	   }
	
	
	@Test(enabled=true)
	public void validateLongPressTest() throws Throwable
	{
		scrollToElement.performScrollToElement();
	}
	
	

//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
