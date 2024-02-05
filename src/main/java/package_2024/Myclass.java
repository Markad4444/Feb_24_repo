package package_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myclass {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(1000);
	driver.quit();
	
	}


}
