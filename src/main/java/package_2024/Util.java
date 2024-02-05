package package_2024;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util {
	static WebDriver driver;
	
	public static void togetsceenshot() throws IOException
	{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Admin\\Desktop\\Eclipse_workspace\\Jan_20_2024\\screenshots\\sc.png");
	FileHandler.copy(source, dest);
		
	}

}
