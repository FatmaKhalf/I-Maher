package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetsPage extends PageBase {

	public AssetsPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[contains(text(),' إضافة اجهزة العميل ')]")
	public WebElement createAssetBtn;
	@FindBy(xpath = "//*[contains(@class,'table table-striped informative itemsTable')]")
	public WebElement assetsTable;
	//*[@id="page-wrapper"]/itemlisttree/div[2]/div/div[2]/itemlistembedded/div[2]/div/div[2]/div/table/thead/tr/th[1]
	@FindBy(xpath = "//div[@class='text-left hidden-xs hidden-sm']//i[@class='fa fa-print']")
	public WebElement printAllAssetsBtn;
	@FindBy(css = "input[placeholder='البحث']")
	WebElement searchLl;
	@FindBy(css = ".fa.fa-search")
	WebElement searchBtn;
	@FindBy(xpath = "//td[1]")
	WebElement elementToSelect;
	@FindBy(css  = "div[class='text-left hidden-xs hidden-sm'] i[class='fa fa-arrows-alt']")
	WebElement moveBtn;
	@FindBy(xpath  = "//a[@class='buttonGra buttonGraAmethyst buttonGra-sm ng-star-inserted']")
	public WebElement editAssetBtn;
	

	//Locations right tap
	@FindBy(xpath = "//*[contains(@class,'toggle-children')]")
	WebElement toggleChildren1;
	@FindBy(xpath = "//*[contains(text(),' الارضي ')]//*[contains(@class,'ng-star-inserted')]")
	WebElement branch2GroundSelection;
	@FindBy(xpath = "//*[contains(text(),' فرع 2 ')]//*[contains(@class,'ng-star-inserted')]")
	WebElement branch2Selection;
	@FindBy(xpath = "//*[contains(text(),' مخزن التكهين ')]")
	WebElement makhzanEltakheenSelection;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/itemlisttree/div[2]/div/div[2]/itemlistembedded/div[2]/div/paginate[1]/div/div/nav/ul/li[14]/a")
	public WebElement lastPageInTable;
	@FindBy(xpath = "//i[@class='fa fa-folder-plus fa-lg']")
	WebElement addAssetsLocationsBtn;

	@FindBy(xpath = "//*[@class='col-md-12']//select")
	WebElement SelectPartyLbl;
	@FindBy(xpath = "//*[@value=\"2118153492000\"]")
	WebElement AbuArishCustomer;
	@FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'مستشفى أبوعريش العام')]")
	public WebElement AbuArishCustomerFromTree;
	@FindBy(css = "body > app:nth-child(6) > div:nth-child(3) > div:nth-child(3) > itemlisttree:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > locationtree:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > tree-root:nth-child(1) > tree-viewport:nth-child(1) > div:nth-child(1) > div:nth-child(1) > tree-node-collection:nth-child(1) > div:nth-child(1) > tree-node:nth-child(2) > div:nth-child(1) > tree-node-wrapper:nth-child(1) > div:nth-child(1) > div:nth-child(2) > tree-node-content:nth-child(1) > div:nth-child(1)")
	public WebElement automatedBranch;


	//Assets Locations Pop-Up
	@FindBy(css = "input[placeholder='الأسم']")
	WebElement nameBtn;
	@FindBy(xpath = "//button[contains(text(),'حفظ')]")
	WebElement saveBtn;

	//Asset  Locations Pop-Up
	@FindBy(xpath = "//div[@class='col-md-12']//span[contains(text(),'Automated Branch')]")
	WebElement automatedBranchOption;
	@FindBy(xpath = "//*[contains(text(),' أوافق ')]")
	WebElement okBtn;

	public void openCustomerAssetsListUnderbranch2Ground() throws InterruptedException
	{
		//clickBtn(toggleChildren1);
		Thread.sleep(3000);
		//clickBtn(branch2GroundSelection);
		clickBtn(makhzanEltakheenSelection);
	}

	public void chooseCustomer() throws InterruptedException
	{
		Thread.sleep(3000);
		clickBtn(SelectPartyLbl);
		Thread.sleep(3000);
		clickBtn(AbuArishCustomer);
		Thread.sleep(3000);
	}

	public void createAssetsLocation(String locationName) throws InterruptedException
	{
		clickBtn(addAssetsLocationsBtn);
		Thread.sleep(3000);
		setTextElementTxt(nameBtn, locationName);
		clickBtn(saveBtn);
	}
	public void searchInCstAssetsList(String searchWord) throws InterruptedException
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
		clickBtn(automatedBranchOption);
		Thread.sleep(3000);
		clickBtn(okBtn);
		Thread.sleep(3000);
		clearTxt(searchLl);
		Thread.sleep(3000);
		clickBtn(automatedBranch);
		Thread.sleep(6000);
	}
	
}


