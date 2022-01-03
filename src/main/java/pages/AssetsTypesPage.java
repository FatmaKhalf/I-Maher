package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetsTypesPage extends PageBase{

	public AssetsTypesPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}
	
	// Items in ResourceTypeTable
	@FindBy(xpath = "//*[@class='node-content-wrapper']//*[contains(text(),' اجهزة تحت الاختبار ')]")
	public WebElement underTestAssets;
	@FindBy(xpath = "//div[contains(text(),'اجهزه طبية')]")
	WebElement medicalAssets;
	
	
	//Items in ResourceTypeList
	@FindBy(xpath = "//*[contains(@title,'إضافة موديل جديد')]")
	WebElement AddNewModelBtn;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/resourcetypetabtree/div[2]/div[2]/div/resourcetypelist/div[2]/div/paginate[1]/div/div/nav/ul/li[6]/a")
	public WebElement lastPageInTable;
	@FindBy(xpath = "//*[contains(@class,'panel panel-default embedded body')]//*[contains(@class,'panel-body')]")
	public WebElement assetsTypesTable;
	@FindBy(xpath = "//*[contains(text(),'الكود')]")
	public WebElement cd;
	@FindBy(css = "input[placeholder='البحث']")
	WebElement searchLl;
	@FindBy(css = ".fa.fa-search")
	WebElement searchBtn;
	@FindBy(css = ".list-item.ng-star-inserted")
	WebElement elementToSelect;
	@FindBy(xpath = "//i[@class='fa fa-arrows-alt fa-lg']")
	WebElement moveBtn;
	
	
	//Create Asset Type Pop-Up
	@FindBy(xpath = "//*[contains(@title,'الكود')]")
	WebElement codeTxt;
	@FindBy(xpath = "//*[contains(@title,'موديل الجهاز')]")
	WebElement modelTxt;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_description')]")
	WebElement detailsTxt;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_brandName')]")
	WebElement Manufacturerlbl;
	@FindBy(xpath = "//*[contains(@id,'AC__Form__entity_brandName')]//*[contains(text(),'GAMBRO')]")
	WebElement gambroManufactorSelect;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_partNumber')]")
	WebElement codeAtManufacturerTxt;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_productionYear')]")
	WebElement productionYearTxt;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_price')]")
	WebElement priceTxt;
	@FindBy(xpath = "//*[contains(@name,'Form__entity_countryName')]")
	WebElement countryTxt;
	@FindBy(xpath = "//*[contains(text(),' حفظ ')]")
	WebElement saveBtn;
	
	//Asset Types Classifications Pop-Up
	@FindBy(xpath = "//div[@class='col-md-12']//div[@id='Tree']//div[contains(text(),'اجهزه طبية')]")
	WebElement medicalAssetsOption;
	@FindBy(xpath = "//*[contains(text(),' أوافق ')]")
	WebElement okBtn;
	
	
	public void OpenAddNewModelScreen() throws InterruptedException
	{	
		Thread.sleep(3000);
		clickBtn(underTestAssets);
		Thread.sleep(3000);
		clickBtn(AddNewModelBtn);
	}	
	
	public void CreateNewModel(String code, String model, String details, String manufactor, String codeAtManufacturer, String year, String cost, String country) throws InterruptedException
	{	
		Thread.sleep(3000);
		setTextElementTxt(codeTxt, code);
		setTextElementTxt(modelTxt, model);
		setTextElementTxt(detailsTxt, details);
		clickBtn(Manufacturerlbl);
		setTextElementTxt(Manufacturerlbl, manufactor);
		//clickBtn(gambroManufactorSelect);
		setTextElementTxt(codeAtManufacturerTxt, codeAtManufacturer);
		setTextElementTxt(productionYearTxt, year);
		setTextElementTxt(priceTxt, cost);
		setTextElementTxt(countryTxt, country);
		clickBtn(saveBtn);
		
	}	
	public void searchInResourceTypeList(String searchWord) throws InterruptedException
	{
		Thread.sleep(3000);
		setTextElementTxt(searchLl, searchWord);
		Thread.sleep(3000);
		clickBtn(searchBtn);	
	}
	
	public void moveType() throws InterruptedException
	{
		Thread.sleep(3000);
		clickBtn(elementToSelect);
		Thread.sleep(3000);
		clickBtn(moveBtn);
		Thread.sleep(3000);
		clickBtn(medicalAssetsOption);
		Thread.sleep(3000);
		clickBtn(okBtn);
		Thread.sleep(3000);
		clearTxt(searchLl);
		Thread.sleep(3000);
		clickBtn(medicalAssets);
		Thread.sleep(6000);
	}

}
