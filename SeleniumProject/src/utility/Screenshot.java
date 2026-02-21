package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot
{
//	static WebDriver driver = new ChromeDriver();  // 2nd browser instance
	
	public static void printScreen(WebDriver driver) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver;   // type-casting
		File screenShot = screen.getScreenshotAs(OutputType.FILE);  // capture screenshot and store in file format
		File path = new File("D:\\TRAININGS\\NOV_25_BATCH\\Screenshots\\TestScreen.png");  // decide path 
		Files.copy(screenShot, path);   // copy screenshot to given path
	}

}
