package Udemy.Appium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;

public class LongPressTest extends Testbase {
	
	
	LongPress longPress;
	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   longPress = new LongPress();
		   
	   }
	
	
	@Test(enabled=true)
	public void validateLongPressTest() throws Throwable
	{
		longPress.performLongPress();
	}
	
	

//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}

}
