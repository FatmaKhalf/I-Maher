package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {

	public static WebDriver driver;
	public static String downloadPath = System.getProperty("user.dir")+ "\\downloads";


	@BeforeSuite
	@Parameters({"browser"})
	public void openDriver(@Optional("chrome") String browserName) throws InterruptedException
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.navigate().to("http://BaseLine.i-maher.com/BaseLine/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 
	}

	@AfterSuite
	public void closeDriver()
	{
		//driver.quit();
	}
	
	@AfterMethod
	public void screenshootOnFailure(ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Faild");
			System.out.println("Taking Screenshot");
			Helper.captureScreenShot(driver, result.getName());
		}
	}

}
