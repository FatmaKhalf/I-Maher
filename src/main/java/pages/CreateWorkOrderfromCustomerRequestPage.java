package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateWorkOrderfromCustomerRequestPage extends PageBase{

	public CreateWorkOrderfromCustomerRequestPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//*[contains(@id,'collapse6')]//*[contains(@class,'form-control')]")
	WebElement employeeLbl;
	@FindBy(xpath = "/html/body/app/div[1]/selectagentsmodal/p-dialog/div/div[2]/div[2]/table/tbody/tr/td[1]/label/span")
	WebElement employeeSelectionCheck;
	@FindBy(xpath = "//*[contains(text(),'أوافق')]")
	WebElement okBtn ;
	@FindBy(xpath = "//*[contains(text(),' حفظ ')]")
	WebElement saveBtn ;

	public void createWorkOrder() throws InterruptedException
	{
		scrollMiddle();
		Thread.sleep(3000);
		clickBtn(employeeLbl);
		Thread.sleep(5000);
		clickBtn(employeeSelectionCheck);
		Thread.sleep(3000);
		clickBtn(okBtn);
		scrollBottom();
		Thread.sleep(4000);
		clickBtn(saveBtn);
		Thread.sleep(4000);
		scrollBottom();

	}
	
}
