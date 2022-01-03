package FMA.Automated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Elements {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void openURL()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://baseline.i-maher.com/BaseLine/Login");		
	
	}
	
	@Test
	public void login()
	{
		WebElement usrnameTxt = driver.findElement(By.xpath("//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[1]/input"));
		WebElement passTxt = driver.findElement(By.xpath("//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[2]/input"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[4]/button"));
		System.out.println(usrnameTxt.getTagName());
		
		usrnameTxt.sendKeys("admin");
		passTxt.sendKeys("BaseLine12345");
		loginBtn.click();
		
		
	}
	
	@AfterTest
	public void close()
	{
		//driver.quit();
	}

}
