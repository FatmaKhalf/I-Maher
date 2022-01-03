package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends PageBase {

	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/Sales/Contacts/Contact_Create')]")
	public WebElement createCotact;
	
//	@SuppressWarnings("deprecation")
	public void openCreateContactPage()
	{
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		clickBtn(createCotact);
	}

}
