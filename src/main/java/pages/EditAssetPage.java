package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAssetPage extends PageBase {

	public EditAssetPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}


	@FindBy(css  = "input[placeholder='الرقم المسلسل']")
	WebElement serilaTxt;
	@FindBy(css  = "input[placeholder='ملاحظه']")
	WebElement noteTxt;
	@FindBy(css  = "select[name='Form__entity_warrantyStatus']")
	WebElement warrantyStatusLbl;
	@FindBy(xpath  = "//option[contains(text(),'سارية')]")
	WebElement selectwarantyAsAvailable;
	@FindBy(xpath  = "div[class='row submit-buttons ng-star-inserted'] button[class='buttonGra buttonGraAmethyst']")
	WebElement saveBtn;


	public void editAsset (String serial, String note) throws InterruptedException
	{
		Thread.sleep(6000);
		setTextElementTxt(serilaTxt, serial);
		setTextElementTxt(noteTxt, note);
		Thread.sleep(6000);
		clickBtn(warrantyStatusLbl);
		Thread.sleep(6000);
		clickBtn(selectwarantyAsAvailable);
		Thread.sleep(0006);
		scrollBottom();
		clickBtn(saveBtn);
	}

}
