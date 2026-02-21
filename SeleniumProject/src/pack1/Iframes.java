package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
		
		
		WebElement iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframe3); // switch focus to given iframe
		System.out.println("Swicthed focus to iframe3");
		

		WebElement textBoxFrame3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBoxFrame3.sendKeys("ABC");
		System.out.println("Handled textBoxFrame3");
		
		
		driver.switchTo().defaultContent(); // swicth focus to main webpage
		System.out.println("Swicthed focus to main webpage");
		
		Thread.sleep(3000);
		WebElement iframe4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(iframe4); // switch focus to given iframe
		System.out.println("Swicthed focus to iframe4");
		
		WebElement textBoxFrame4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		textBoxFrame4.sendKeys("PQR");
		System.out.println("Handled textBoxFrame4");
		
		
		
		driver.switchTo().defaultContent(); // swicth focus to main webpage
		System.out.println("Swicthed focus to main webpage");
		
		iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(iframe3); // switch focus to given iframe
		System.out.println("Swicthed focus to iframe3");
		
		Thread.sleep(3000);
		WebElement iframeInsideIframe = driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframeInsideIframe);
		
		driver.findElement(By.xpath("//span[text()='I am a human']")).click();
		System.out.println("Handled radio button");
		
//		driver.switchTo().defaultContent(); // swicth focus to main webpage
//		System.out.println("Swicthed focus to main webpage");
//		
//		iframe3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//		driver.switchTo().frame(iframe3); // switch focus to given iframe
//		System.out.println("Swicthed focus to iframe3");
//		
		
		driver.switchTo().parentFrame();  // swicth focus to immediate parent frame
		
		textBoxFrame3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
		textBoxFrame3.clear();
		textBoxFrame3.sendKeys("XYZ");
		System.out.println("Handled textBoxFrame3 2nd time");
		
		

	}

}
