package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		Thread.sleep(3000);
		while (true)
		{
			WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String monthYearText = monthYear.getText();

			if (monthYearText.equals("August 2025"))
			{
				System.out.println("Found : "+monthYearText);
				break;
			}
			
			WebElement prevButton = driver.findElement(By.xpath("//a[@title='Prev']"));
			prevButton.click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='10']")).click();

	}

}
