package pack1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utility.JavascriptMethods;
import utility.PropertyReader;

public class ActionsClass3
{
	static int index = 0;  // 1
	
	
	public void selectValue()
	{
		

		
		Select sel =new Select(null);
		
		index = getRandomNum(0, 248);
		
		sel.selectByIndex(index);
		
		
	}
	
	public int getRandomNum(int start, int end)
	{
		int ans = 9;
//		 start = 0  
//		 end : list.size() - 1
		
		
		
		
		
		return ans;
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		
		
		 List<WebElement> list = driver.findElements(By.xpath("//select//option"));

		 list.size();
		
		 

	}

}
