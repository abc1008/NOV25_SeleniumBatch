package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);
		
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']//option"));
		
//		getText();   --> Return the text attached with webelement. 
		
		int count = 0;
		
		for( WebElement ele : allDays )
		{
			String text = ele.getText(); 
			System.out.println(text);
			
			if(text.equals("22"))
			{
				ele.click();
				break;
			}
			
			count++;
			System.out.println(count);
		}
		
		System.out.println("Completed");
		
		System.out.println();
		System.out.println("*** Using Select Class ***");
		System.out.println();
		
		Thread.sleep(3000);
		
		WebElement monthDrop = driver.findElement(By.xpath("//select[@id='month']"));
		Select select = new Select(monthDrop);
		select.selectByIndex(4);   // select May
		
		Thread.sleep(3000);
		select.selectByValue("10");   // Attribute 'value'
		
		Thread.sleep(3000);
		select.selectByVisibleText("Aug");
		
	
	}

}
