package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import utility.Screenshot;

public class Waits
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);   
		
		
		
		
//		locate webelement on UI using provided id 
		WebElement textBoxEmail = driver.findElement(By.name("username"));
		textBoxEmail.sendKeys("Admin");  // sending text on WebElement
		
//		Thread.sleep(3000);
		WebElement textBoxPassword = driver.findElement(By.name("password"));
		textBoxPassword.sendKeys("admin123");
		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
		
		Thread.sleep(5000);   // test case 
		
		
//		Coed to take screenshot
		
//		DateTimeStamp
//		String fileName = TestScreen + 21022026_103630;
		
//		TakesScreenshot screen = (TakesScreenshot)driver;   // type-casting
//		File screenShot = screen.getScreenshotAs(OutputType.FILE);  // capture screenshot and store in file format
//		File path = new File("D:\\TRAININGS\\NOV_25_BATCH\\Screenshots\\TestScreen.png");  // decide path 
//		Files.copy(screenShot, path);   // copy screenshot to given path
		
		
		Screenshot.printScreen(driver);
		
		
		
//		Logout
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		Screenshot.printScreen(driver);
		
	}

}
