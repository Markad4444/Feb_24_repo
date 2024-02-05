import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import package_2024.ToLogin;

public class Totestlogin {
	WebDriver driver;
	ToLogin tl;
	@BeforeClass
	public void beforeclass()
	{
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@BeforeMethod
	public void beforem()
	{
		tl=new ToLogin(driver);
		
		
	}
	@Test
	public void testmethod()
	{
		tl.entertheusername();
		tl.enterpass();
		tl.clickbutton();
	}
	@Test
	public void tm1()
	{
		
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("test case pass",true);
	}
	@AfterClass 
	public void afterclassmethod()
	{
		driver.quit();
	}

}
