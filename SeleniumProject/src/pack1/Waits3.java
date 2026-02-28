package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waits3
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://devsite.testometer.co.in/login");

		WebElement textBoxEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		textBoxEmail.sendKeys("adityaganjkar88@gmail.com");  // sending text on WebElement
		
		WebElement textBoxPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		textBoxPassword.sendKeys("abcd@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("page-header-user-dropdown")).click();
		
		driver.findElement(By.xpath("//span[text()='Change Password']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("abcd@1234");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter confirm password.']")).sendKeys("abcd@1234");
		
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
		WebElement sucessMsgEle = driver.findElement(By.xpath("//span[@class='jconfirm-title']"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.invisibilityOf(sucessMsgEle));
		
//		FluentWait<T>  =  Type Of Variable On Which wait to be applied
		
		FluentWait<WebDriver> wait  = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))   // max waiting time
				.pollingEvery(Duration.ofMillis(250))    // new polling frequency
				.ignoring(ArrayIndexOutOfBoundsException.class);  // exception to be ignored
		
		wait.until(ExpectedConditions.invisibilityOf(sucessMsgEle));
		
		
		
		driver.findElement(By.id("page-header-user-dropdown")).click();
		
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		
		
		driver.quit();
		
		
	
	}

}
