package package_2024;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Feb_5_24 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();	
		 driver.findElement(By.name("firstname")).sendKeys("krishna");
		 driver.findElement(By.name("lastname")).sendKeys("bhosale");
		 driver.findElement(By.name("reg_email__")).sendKeys("9049004701");
		 driver.findElement(By.id("password_step_input")).sendKeys("Facebook@@3");
		WebElement dylist=driver.findElement(By.id("day"));
		Select s=new Select(dylist);
		
		s.selectByIndex(10);
		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> options=s.getOptions();
		List<String> l= new ArrayList<String>();
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.add(options.get(i).getText()));
	}
		 Thread.sleep(2000);
		 driver.quit();

	}

}
