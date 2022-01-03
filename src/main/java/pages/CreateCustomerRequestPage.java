package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomerRequestPage extends PageBase {

	public CreateCustomerRequestPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "//*[contains(text(),'طلب صيانة')]")
	 WebElement MaintananceRequestBtn ;
	@FindBy(xpath = "//*[contains(text(),' الصيانة الطبية ')]")
	 WebElement medicalMaintanancetypeSelection ;
	@FindBy(xpath = "//*[contains(text(),' أوافق ')]")
	 WebElement okBtn ;
	@FindBy(xpath = "//div[contains(@id,'SelectDevices')]//*[contains(@class,'form-control input-control')]")
	 WebElement assignAssetsLbl ;
	
	
	@FindBy(xpath = "/html/body/app/div[1]/itemsearchcustomermodal/p-dialog/div/div[2]/div/div/div[3]/div[2]/table/tbody/tr[1]/td[1]/label/span")
	 WebElement deviceCheckBtn ;
	
	@FindBy(xpath = "//*[contains(@name,'Form__entity_details')]")
	 WebElement RequestDetailsTxt ;
	@FindBy(xpath = "//*[contains(text(),' حفظ ')]")
	 WebElement saveBtn ;
	
	public void createWorkRequest() throws InterruptedException
	{
		clickBtn(MaintananceRequestBtn);
		Thread.sleep(4000);
		clickBtn(medicalMaintanancetypeSelection);
		Thread.sleep(4000);
		clickBtn(okBtn);
		Thread.sleep(4000);
		scrollMiddle();
		Thread.sleep(4000);
		clickBtn(assignAssetsLbl);
		Thread.sleep(9000);
		clickBtn(deviceCheckBtn);
		Thread.sleep(7000);
		clickBtn(okBtn);
		setTextElementTxt(RequestDetailsTxt, "This is a test Request Automated by the SW testing team");
		scrollBottom();
		clickBtn(saveBtn);
	}

}
