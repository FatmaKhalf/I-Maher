package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateContactPage extends PageBase{

	public CreateContactPage(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath = "//*[@id=\"FG_partyId\"]/div/select")
	WebElement Customer;
	@FindBy(xpath = "//*[@id=\"FG_partyId\"]/div/select/option[3]")
	WebElement customerList;
	@FindBy(xpath = "//*[@id=\"FG_firstName\"]/div/div[1]/input")
	WebElement firstnameTxt;
	@FindBy(xpath = "//*[@id=\"FG_lastName\"]/div/div[1]/input")
	WebElement lastnameTxt;
	@FindBy(xpath = "//*[@id=\"FG_jobTitle\"]/div/div[1]/input")
	WebElement jobRoleTxt;
	@FindBy(xpath = "//*[@id=\"FG_email\"]/div/input")
	WebElement emailTxt;
	@FindBy(xpath = "//*[@id=\"FG_mobile\"]/div/input")
	WebElement mobileTxt;
	@FindBy(xpath = "//*[@id=\"FG_hasUser\"]/div/label/i")
	WebElement userAccountCheckmark;
	@FindBy(xpath = "//*[@id=\"FG_user_logonName\"]/div/input")
	WebElement logonNameTxt;
	@FindBy(xpath = "//*[@id=\"FG_user_password\"]/div/input")
	WebElement PasswordTxt;
	@FindBy(xpath = "//*[@id=\"FG_user_passwordConfim\"]/div/input")
	WebElement confirmPasswordTxt;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/contact_create/div[2]/div/div[2]/")
	//button
	public WebElement saveBtn;
	
	public void createContact(String firstname, String lastname, String jobrole, String mail, String mobile,
			String Logonname, String password) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		clickBtn(Customer);
		clickBtn(customerList);
		setTextElementTxt(firstnameTxt, firstname);
		setTextElementTxt(lastnameTxt, lastname);
		setTextElementTxt(jobRoleTxt, jobrole);
		setTextElementTxt(emailTxt, mail);
		setTextElementTxt(mobileTxt, mobile);
		clickBtn(userAccountCheckmark);
		setTextElementTxt(logonNameTxt, Logonname);
		setTextElementTxt(PasswordTxt, password);
		setTextElementTxt(confirmPasswordTxt, password);
		Thread.sleep(3000);
		clickBtn(saveBtn);
		Thread.sleep(3000);
	}

}
