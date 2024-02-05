package package_2024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Feb24 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//ChromeOptions option= new ChromeOptions();
		//option.addArguments("disable-notifications");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://ssc.nic.in/");
		/*WebElement id=driver.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("9049221706");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("8390510730");
		WebElement pbtn=driver.findElement(By.name("login"));
		pbtn.click();*/
		Thread.sleep(2000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\Desktop\\Eclipse_workspace\\Jan_20_2024\\screenshots\\sc.jpg");
		FileHandler.copy(source, dest);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
