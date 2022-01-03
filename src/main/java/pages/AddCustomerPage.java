package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends PageBase{

	public AddCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css  = "input[placeholder='اسم المؤسسه']")
	WebElement organizationNameTXT ;
	@FindBy(css  = "input[placeholder='المنطقه']")
	WebElement regionTxt;
	@FindBy(css  = "input[placeholder='اسم القطاع']")
	WebElement sectionNameTxt;
	@FindBy(xpath  = "//select[@name='Form__organizationId']")
	WebElement organizationLbl;
	@FindBy(xpath = "//option[contains(text(),'وزارة الصحة')]")
	WebElement selectedOrganization;
	@FindBy(css  = "textarea[placeholder='العنوان']")
	WebElement addressTxt;
	@FindBy(css  = "div[class='row submit-buttons ng-star-inserted'] button[class='buttonGra buttonGraAmethyst']")
	WebElement saveBtn;

	//Branch Details 
	@FindBy(css  = "input[placeholder='الأسم']")
	WebElement branchNameTxt;
	@FindBy(css  = "textarea[placeholder='عنوان الفرع']")
	WebElement branchAddressTxt;
	@FindBy(xpath  = "//select[@name='Form__entity_cityId']")
	WebElement branchCityLbl;
	@FindBy(xpath  = "//option[contains(text(),'مصر الجديدة')]")
	WebElement selectBranchCity;
	
	public void createCustomer (String organizationName, String region, String sectionName,
			String address, String branchName, String branchAddress) throws InterruptedException
	{
		setTextElementTxt(organizationNameTXT, organizationName);
		setTextElementTxt(regionTxt, region);
		setTextElementTxt(sectionNameTxt, sectionName);
		Thread.sleep(3000);
		clickBtn(organizationLbl);
		Thread.sleep(3000);
		clickBtn(selectedOrganization);
		Thread.sleep(3000);
		setTextElementTxt(addressTxt, address);
		//setTextElementTxt(branchNameTxt, branchName);
		//setTextElementTxt(branchAddressTxt, branchAddress);
		clickBtn(branchCityLbl);
		Thread.sleep(3000);
		clickBtn(selectBranchCity);
		Thread.sleep(3000);
		clickBtn(saveBtn);
		Thread.sleep(3000);
	}

}
