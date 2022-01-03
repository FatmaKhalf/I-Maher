package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkRequestDetailsPage extends PageBase {

	public WorkRequestDetailsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[contains(text(),' إضافة أمر عمل ')]")
	public WebElement  CreateWorkOrderBtn;
	@FindBy(xpath = "//*[contains(text(),' حفظ ')]")
	public WebElement  SaveBtn;

}
