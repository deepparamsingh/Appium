package Udemy.Appium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Testbase;

public class HomePageTest extends Testbase {
	
	
	HomePage homepage;
	
//	public  HomePageTest() {
//			
//		super();
//		
//	}
//	
	@BeforeMethod
	   public void setup() throws Throwable
	   {
		   initialization();
		   homepage= new HomePage();
	   }
	
	
	@Test(enabled=true)
	public void validateh1HeadingTest() throws Throwable
	{
		homepage.openHomepage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
