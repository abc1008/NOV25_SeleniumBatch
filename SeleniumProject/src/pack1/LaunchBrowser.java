package pack1;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class LaunchBrowser
{
	public static void main(String[] args)
	{
		
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize browser (method chaining)
		
//		. = getting the reference variable of return type of previous method
		
		driver.get("https://www.facebook.com/");  // hit url
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().back(); 
		driver.navigate().refresh();
		driver.navigate().forward();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("google") == true)
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
		
		driver.quit();   // close entire browser
//		driver.close(); // close currently focused window
	}
}
