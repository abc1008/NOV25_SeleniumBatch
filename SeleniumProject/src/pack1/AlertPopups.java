package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopups
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vinothqaacademy.com/alert-and-popup/");
		Thread.sleep(3000);

		WebElement button = driver.findElement(By.xpath("//button[@name='alertbox']"));

		button.click();
		
		
		Thread.sleep(3000);
		
//		driver.switchTo().alert().accept();
		
		Alert alertPopup = driver.switchTo().alert();
		
//		alertPopup.accept();   //  --> OK button
		alertPopup.dismiss();  // --> Cancel button
		
		Thread.sleep(3000);
		WebElement button2 = driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
		button2.click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
