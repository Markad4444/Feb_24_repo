package package_2024;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToLogin extends Util{
	WebDriver driver;
	@FindBy (xpath="//input[@id='email']")
	private WebElement username;
	@FindBy(xpath="//input[@id='pass']")
private WebElement passwordfield;
	@FindBy (xpath="//button[@name='login']")
	private WebElement buttonfield;
	
	 public ToLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	 }
		public void entertheusername()
		{ 
			username.sendKeys("8390510730");
			
		}
		public void enterpass()
		{
			passwordfield.sendKeys("9049221706");
		}
		 public void clickbutton()
		 {
			 passwordfield.click();
		 }
	public void totakesc() throws IOException
	{
		togetsceenshot();
	}

	}

	
