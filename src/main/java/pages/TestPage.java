package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestPage extends PageBase {

	public TestPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;	}
	
	public void scrollFun()
	{
		scrollBottom();
	}
	

}
