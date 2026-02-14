package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(3000);

		WebElement textBoxFName = driver.findElement(By.xpath("//input[@name='firstname']"));
		textBoxFName.sendKeys("ABC");
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB)
			.sendKeys("PQR")
			.build().perform();
		
		
		Thread.sleep(3000);
		
//		act.sendKeys(Keys.TAB).build().perform();
//		act.sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys(Keys.TAB)
			.sendKeys(Keys.TAB)
			.sendKeys(Keys.ARROW_DOWN)
			.sendKeys(Keys.ARROW_DOWN)
			.build()
			.perform();
		
		
	}

}
