package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAndRadioButtons2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://formstone.dev/components/checkbox/");
		Thread.sleep(3000);

		WebElement checkBox3 = driver.findElement(By.xpath("//input[@id='checkbox-3']"));

		boolean chkbx3Enabled = checkBox3.isEnabled();

		if (chkbx3Enabled == true)
		{
			System.out.println("checkBox3 - Enabled Checkbox");
		}
		else
		{
			System.out.println("Disabled Checkbox");
		}

		WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='checkbox-1']//..//div[@class='fs-checkbox-flag']"));

		if (checkBox1.isDisplayed() == true)
		{
			System.out.println("checkBox1 is displayed");
			
			if (checkBox1.isSelected() == true)
			{
				System.out.println("checkBox1 is already checked");
			}
			else
			{
				System.out.println("Checkbox not checked");
			}
		}
		else
		{
			System.out.println("checkBox1 is not displayed");
		}

	}

}
