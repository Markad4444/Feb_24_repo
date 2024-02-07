package package_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Feb_5_24 {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		WebElement bmont=driver.findElement(By.id("month"));
		WebElement malebtn=driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		Select s=new Select(bmont);
		
		s.selectByIndex(10);
		System.out.println(s.getFirstSelectedOption().getText());
		List<WebElement> options=s.getOptions();
        System.out.println(options.size());
		List<String> l= new ArrayList<String>();
		System.out.println(l.size());
	for(int i=0;i<options.size();i++)
	{
		//System.out.println(l.add(options.get(i).getText()));
		System.out.println(options.get(i).getText());
		malebtn.click();
	}
	System.out.println("by text");
	System.out.println(driver.findElement(By.xpath("(//p[@class='_58mv'])[1]")).getText());
	System.out.println("By tagname");
	System.out.println(driver.findElement(By.xpath("(//p[@class='_58mv'])[1]")).getTagName());

	Thread.sleep(3000);
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String base64=((TakesScreenshot)dylist).getScreenshotAs(OutputType.BASE64);
	File d= new File("C:\\Users\\Admin\\Desktop\\Eclipse_workspace\\Jan_20_2024\\screenshots//scr.png");

	FileHandler.copy(file, d);
	Thread.sleep(1000);
		 driver.quit();

	}

}
