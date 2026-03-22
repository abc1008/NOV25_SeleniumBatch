package hooks;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import pageClasses.HeaderPage;
import utility.ExtentReportHelper;
import utility.PropertyReader;

public class Hooks
{
//	public static WebDriver driver;

	public static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<WebDriver>();

	
	@BeforeAll
	public static void beforeAll() throws IOException, InterruptedException
	{
		String browserName = PropertyReader.getProperty("Browser");

		LocalDateTime localDate = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("ddMMyyhhmmss");
		String formattedDate = "_" + localDate.format(pattern);

		if (browserName.equalsIgnoreCase("CHROME"))
		{
			driverLocal.set(new ChromeDriver());
		}
		else if (browserName.equalsIgnoreCase("EDGE"))
		{
			driverLocal.set(new EdgeDriver());
		}

		driverLocal.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driverLocal.get().manage().window().maximize();
		driverLocal.get().get(PropertyReader.getProperty("TestSiteUrl"));
		ExtentReportHelper extentReportHelper = new ExtentReportHelper(formattedDate);

	}

	@AfterAll
	public static void after()
	{
		HeaderPage headerPage = new HeaderPage(driverLocal.get());
		headerPage.logout();
		ExtentReportHelper.endTest();
		driverLocal.get().quit();

	}

}
