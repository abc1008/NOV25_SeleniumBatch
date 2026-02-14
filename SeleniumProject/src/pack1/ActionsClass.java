package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);

		WebElement doubleClickEle = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

//		Scroll
//		JavascriptExecutor   --> Interface
		JavascriptExecutor js = (JavascriptExecutor) driver; // type-casting
		js.executeScript("arguments[0].scrollIntoView();", doubleClickEle);

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(doubleClickEle).build().perform();

		Thread.sleep(3000);
		WebElement rightClickEle = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightClickEle).build().perform();

		Thread.sleep(3000);
		WebElement clickEle = driver.findElement(By.xpath("//button[@id='oeUQd']"));
		act.click(clickEle).build().perform();

	}

}
