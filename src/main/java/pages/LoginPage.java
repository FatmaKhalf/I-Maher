package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	
	@FindBy(xpath = "//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[1]/input")
	WebElement usernameTxt;
	@FindBy(xpath = "//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[2]/input")
	WebElement passwordTxt;
	@FindBy(xpath = "//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[4]/button")
	public WebElement loginBtn;
	@FindBy(xpath = "//*[@id=\"null\"]/login/section/div/div/div[2]/form/a")
	WebElement forgotPassLink;
	@FindBy(xpath = "//*[@id=\"null\"]/login/section/div/div/div[2]/form/div[3]/div[1]/label/span")
	WebElement KeepLoggedRadioCheck;
	
	public void userLogin(String userName , String password)
	{
		setTextElementTxt(usernameTxt, userName);
		setTextElementTxt(passwordTxt, password);
		clickBtn(loginBtn);
	}

}
