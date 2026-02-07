package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOrangeHrm3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		
//		locate webelement on UI using provided id 
		WebElement textBoxEmail = driver.findElement(By.xpath("//input[@name='username' or @placeholder='username']"));
		textBoxEmail.sendKeys("Admin");  // sending text on WebElement
		
		Thread.sleep(3000);
		WebElement textBoxPassword = driver.findElement(By.name("password"));
		textBoxPassword.sendKeys("admin123");
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		
		Thread.sleep(5000);
		
		
//		Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

}
