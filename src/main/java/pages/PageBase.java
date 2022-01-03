package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	
	
	protected WebDriver driver;
	public JavascriptExecutor js;
	public Select select;
	public Actions actions;
	
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	protected static void clickBtn(WebElement Button)
	{
		Button.click();
	}
	protected static void setTextElementTxt(WebElement txtElement, String value)
	{
		txtElement.sendKeys(value);
	}
	
	public void scrollBottom()
	{
		js.executeScript("window.scrollBy(0,25000)", "");
		
	}
	public void scrollMiddle()
	{
		js.executeScript("window.scrollBy(0,500)", "");
	}
	public void scrollUp()
	{
		js.executeScript("window.scrollBy(0,0)", "");
	}
	public void clearTxt(WebElement element)
	{
		element.clear();
	}
	

}
