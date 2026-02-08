package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioButtons
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qa-practice.com/elements/checkbox/mult_checkbox");
		Thread.sleep(3000);
		
		
		WebElement oneCheckbox = driver.findElement(By.xpath("//input[@id='id_checkboxes_0']"));
		oneCheckbox.click();
	
	
	}

}
