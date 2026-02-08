package pack1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String mainWindowId = driver.getWindowHandle();  // return window Handle/id of currently focused window
		System.out.println("mainWindowId : " + mainWindowId);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(3000);
		
		Set<String> allWins = driver.getWindowHandles();  // return window Handles/ids of all windows open
		
		for(String windowId : allWins)
		{
			System.out.println(windowId);
		}
		
		
//		driver.switchTo().window(null); // switch focus of selenium from main window to another window

	}

}
