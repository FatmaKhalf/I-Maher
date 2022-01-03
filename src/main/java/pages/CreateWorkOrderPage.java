package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateWorkOrderPage extends PageBase{

	public CreateWorkOrderPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "//*[@id=\"FG_entity_partyId\"]/div/ng-select/div/div/div[3]/input")
	WebElement openCustomerList;	
	@FindBy(xpath = "//*[@id=\"a75b03fb3916\"]/div") 
	List<WebElement> customerList;
	@FindBy(xpath  = "//*[@id=\"Tree\"]/div[2]/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/tree-node-expander")
	WebElement toggleChildren;	
	@FindBy(css = "span.ng-option-label.ng-star-inserted")
	WebElement CSTSelect;
	@FindBy(xpath = "//*[@id=\"WorkOrder__entity__workOrderTypeId\"]/div/label")
	WebElement serviceTypeLable;
	@FindBy(xpath = "//*[@id=\"Tree\"]/div[2]/div/div[2]/tree-root/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-children/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/div/tree-node-content/span")
	WebElement medicalMaintaince;
	@FindBy(xpath = "/html/body/app/div[1]/selectworkordertypemodal/p-dialog/div/div[3]/p-footer/div/div/button[2]")
	WebElement okBtn;
	@FindBy(xpath = "//*[@id=\"FG_entity_description\"]/div/textarea")
	WebElement DescriptionTxt;
	@FindBy(xpath = "//*[@id=\"FG_entity_priority\"]/div/div/label[1]")
	WebElement urgentImprtanceLbl;
	
	//Assign Assets
	@FindBy(xpath = "//*[@id=\"DeviceSelectOpener\"]/div/label")
	WebElement assignAssetsLbl;
	@FindBy(xpath = "/html/body/app/div[1]/itemsearchmodal/p-dialog/div/div[2]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[1]/label/span")
	WebElement deviceRadiobutton;
	@FindBy(xpath = "//button[@class='buttonGra buttonGraPerp']")
	WebElement assetsSearchOkBtn;
	@FindBy(xpath = "//*[@id=\"FG_entity_dueDate\"]/div/div/div/angular2-date-picker/div/div[1]")
	WebElement endDateLbl;
	@FindBy(xpath = "//*[@id=\"FG_entity_dueDate\"]/div/div/div/angular2-date-picker/div/div[2]/table[2]/tbody/tr[5]/td[5]/span")
	WebElement date30;
	@FindBy(xpath = "//*[@id=\"collapse6\"]/div[1]/div[1]/div/input")
	WebElement employeeLbl;
	@FindBy(xpath = "/html/body/app/div[1]/selectagentsmodal/p-dialog/div/div[2]/div[2]/table/tbody/tr[1]/td[1]/label/span")
	WebElement sabyaEngCheckbox;
	@FindBy(xpath = "//button[@class='buttonGra buttonGraOrange']")
	WebElement chooseEmployessOkBtn;
	@FindBy(xpath = "//label[@class='form-control']")
	WebElement engineerToolsLbl;
	@FindBy(xpath = "/html/body/app/div[1]/equipmenttypeselect/p-dialog/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/label/span\r\n")
	WebElement commnToolsCheckbox;
	@FindBy(xpath = "//button[@class='buttonGra buttonGraOrange']")
	WebElement chooseToolsOkBtn;
	@FindBy(xpath = "//button[@class='buttonGra buttonGraGreen buttonGra buttonGraOrange']")
	WebElement saveBtn;

	
	public void createWorkOrder(String customerName, String description) throws InterruptedException
	{
		Thread.sleep(6000);
		clickBtn(openCustomerList);
		Thread.sleep(6000);
		setTextElementTxt(openCustomerList, customerName);
		Thread.sleep(6000);
		clickBtn(CSTSelect);
		Thread.sleep(6000);
		clickBtn(serviceTypeLable);
		Thread.sleep(6000);
		clickBtn(toggleChildren);
		Thread.sleep(6000);
		clickBtn(medicalMaintaince);
		Thread.sleep(6000);
		clickBtn(okBtn);
		Thread.sleep(6000);
		setTextElementTxt(DescriptionTxt, description);
		Thread.sleep(6000);
		clickBtn(urgentImprtanceLbl);
		Thread.sleep(6000);
		scrollMiddle();
		Thread.sleep(6000);
		clickBtn(assignAssetsLbl);
		Thread.sleep(6000);
		clickBtn(deviceRadiobutton);
		Thread.sleep(6000);
		clickBtn(assetsSearchOkBtn);
		Thread.sleep(6000);
		clickBtn(endDateLbl);
		clickBtn(date30);
		Thread.sleep(6000);
		clickBtn(employeeLbl);
		Thread.sleep(6000);
		clickBtn(sabyaEngCheckbox);
		Thread.sleep(6000);
		clickBtn(chooseEmployessOkBtn);
		Thread.sleep(6000);
		scrollBottom();
		clickBtn(engineerToolsLbl);
		Thread.sleep(6000);
		clickBtn(commnToolsCheckbox);
		Thread.sleep(6000);
		clickBtn(chooseToolsOkBtn);
		Thread.sleep(6000);
		clickBtn(saveBtn);
	}

}
