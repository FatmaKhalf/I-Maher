package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBranchPage extends PageBase{

	public CreateBranchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@placeholder='الأسم']")
	WebElement branchNameTxt;
	@FindBy(css = "select[name='Form__entity_partyId']")
	WebElement customerList;
	@FindBy(xpath = "//option[@value='6: 2118153492000']")
	WebElement cstSelectionAsAbuArishHospital;
	@FindBy(xpath = "//textarea[@placeholder='عنوان الفرع']")
	WebElement branchAddressTxt;
	@FindBy(xpath = "//select[@name='Form__entity_cityId']")
	WebElement cityList;
	@FindBy(xpath = "//option[@value='9: 2128435197000']")
	WebElement citySelectionAsNewCairo;
	@FindBy(css = "div[class='row submit-buttons ng-star-inserted'] button[class='buttonGra buttonGraAmethyst']")
	WebElement saveBtn;
	
	
	public void createBranch(String branchname, String branchaddress) throws InterruptedException
	{
		setTextElementTxt(branchNameTxt, branchname);
		Thread.sleep(3000);
		clickBtn(customerList);
		Thread.sleep(3000);
		clickBtn(cstSelectionAsAbuArishHospital);
		Thread.sleep(3000);
		setTextElementTxt(branchAddressTxt, branchaddress);
		Thread.sleep(3000);
		clickBtn(cityList);
		Thread.sleep(3000);
		clickBtn(citySelectionAsNewCairo);
		Thread.sleep(3000);
		clickBtn(saveBtn);
	}
	
}
