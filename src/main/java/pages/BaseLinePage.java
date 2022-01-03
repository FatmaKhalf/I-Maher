package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseLinePage extends PageBase {

	public BaseLinePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"null\"]/top-bar/div/div/nav/div[2]/ul/li[3]/a")
	WebElement loginLink;
	@FindBy(xpath = "//*[@id=\"wrapper\"]/top-bar/div/div/nav/div[2]/ul/li[3]/a")
	WebElement logoutlink;

	
	public void openLoginPage()
	{
		clickBtn(loginLink);
	}
	public void logOut()
	{
		clickBtn(logoutlink);
	}

}
