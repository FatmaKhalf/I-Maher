package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAssetPage extends PageBase {

	public CreateAssetPage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath = "//*[@class='fa fa-lg fa-toggle-off grayColor']")
	WebElement automaticCodingBtn;
	@FindBy(xpath = "//*[@title='كود الجهاز']")
	WebElement assetCodeTxt;
	@FindBy(xpath = "//*[@id=\"cat_selector\"]/div")
	WebElement typeClassficationField;
	@FindBy(xpath = "//*[@id=\"FG_entity_resourceTypeId\"]/div/ng-select/div/div/div[2]/input")
	WebElement assetTypeField;
	@FindBy(css  = "span.ng-option-label.ng-star-inserted")
	WebElement assetTypeSelect;
	@FindBy(xpath = "//*[@id=\"FG_entity_partyId\"]/div/select")
	WebElement customerField;
	@FindBy(xpath = "//*[contains(text(),'مستشفي صبيا العام')]")
	WebElement selectSabyaHospitalAsACustomer;
	@FindBy(xpath = "//*[@id=\"location_selector\"]/div/label")
	WebElement locationField;
	@FindBy(xpath = "//*[@id=\"FG_entity_serialNo\"]/div/input")
	WebElement serialNoTxt;
	@FindBy(xpath = "//*[@id=\"FG_entity_warrantyStatus\"]/div/select")
	WebElement WarrantyStatusField;
	//Warranty status *
	@FindBy(xpath = "//*[contains(text(),'سارية')]")
	WebElement selectWarrantyStatusAsActive;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/itemscreate/div[2]/div/div[2]/button")
	WebElement saveBtn;
	
	//Choose Asset Type pop up
	@FindBy(xpath = "//*[contains(text(),' اجهزه طبية ')]")
	WebElement medicalEqyubmentSelection;
	@FindBy(xpath = "//*[contains(text(),' أوافق ')]")
	WebElement OkBtn;
	
	//Choose location Type pop up
	@FindBy(xpath = "//*[@id=\"Tree\"]/div[2]/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node[1]/div/tree-node-wrapper/div/tree-node-expander/span")
	WebElement toggleChildren1;
	@FindBy(xpath = "//*[contains(text(),' الارضي ')]")
	WebElement branch2GroundSelection;
	@FindBy(xpath = "//*[contains(text(),' مخزن التكهين ')]")
	WebElement makhzanEltakheenSelection;

	

	public void createAsset(String assetCode, String assetType, String serialNo) throws InterruptedException
	{
	//clickBtn(automaticCodingBtn);
	    Thread.sleep(3000);
		setTextElementTxt(assetCodeTxt, assetCode);
		Thread.sleep(6000);
		clickBtn(typeClassficationField);
		Thread.sleep(3000);
		clickBtn(typeClassficationField);
		Thread.sleep(6000);
		clickBtn(medicalEqyubmentSelection);
		clickBtn(OkBtn);
		Thread.sleep(4000);
		clickBtn(assetTypeField);
		Thread.sleep(4000);
		Thread.sleep(3000);
		setTextElementTxt(assetTypeField, assetType);
		Thread.sleep(3000);
		clickBtn(assetTypeSelect);
		clickBtn(customerField);
		Thread.sleep(3000);
		clickBtn(selectSabyaHospitalAsACustomer);
		Thread.sleep(3000);
		clickBtn(locationField);
		Thread.sleep(3000);
	//	clickBtn(toggleChildren1);
		Thread.sleep(3000);
	//	clickBtn(branch2GroundSelection);
		clickBtn(makhzanEltakheenSelection);
		Thread.sleep(3000);
		clickBtn(OkBtn);
		setTextElementTxt(serialNoTxt, serialNo);
		Thread.sleep(3000);
		clickBtn(WarrantyStatusField);
		Thread.sleep(3000);
		clickBtn(selectWarrantyStatusAsActive);
		Thread.sleep(3000);
		clickBtn(saveBtn);

	}
}
