package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import utility.Screenshot;

public class Waits2
{
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		Thread.sleep(3000);    // 1 sec = 1000 milliseconds
		
							  //  0.5 sec = 500 milliseconds
		
		driver.findElement(By.id("btn1")).click();
		
//		SYNTAX EXPLICIT WAIT: 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));
		
		driver.findElement(By.id("txt1")).sendKeys("ABC");
		
		
		driver.findElement(By.id("btn2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		
		driver.findElement(By.id("txt2")).sendKeys("PQR");
		
		
	}

}
