package pack1;

import java.util.ArrayList;
import java.util.List;
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
		
		System.out.println();
		
		Set<String> allWins = driver.getWindowHandles();  // return window Handles/ids of all windows open
		
		for(String windowId : allWins)
		{
			System.out.println(windowId);
		}
		
		
//		driver.switchTo().window(windowHandleToSwitch);  	// switch focus of selenium from main window to another window
		
		List<String> list = new ArrayList<String>(allWins);  // conversion of Set into List
		String nextWinId = list.get(1);
		
		driver.switchTo().window(nextWinId);
		
		System.out.println("Switched to window : "+nextWinId);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='EmailHomePage']")).sendKeys("abc@gmail.com");
		

	}

}
