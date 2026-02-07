package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHrm2
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
//		Link Text:
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
//		Partial Link Text:
		driver.findElement(By.partialLinkText(", Inc")).click();
		
	}

}
