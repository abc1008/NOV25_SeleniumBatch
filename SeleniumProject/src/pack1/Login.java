package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		
		Thread.sleep(3000);
		
		
//		locate webelement on UI using provided id 
		WebElement textBoxEmail = driver.findElement(By.id("input-email"));
		textBoxEmail.sendKeys("ag89111@gmail.com");  // sending text on WebElement
		
		Thread.sleep(3000);
		WebElement textBoxPassword = driver.findElement(By.name("password"));
		textBoxPassword.sendKeys("Unlock@123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		
		
	}

}
