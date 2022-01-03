package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage extends PageBase{

	public AdminDashboardPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "//*[contains(text(),'اعدادات النظام')]")
	public WebElement systemSettingsMenu;
	@FindBy(xpath = "//*[contains(text(),'الصيانة')]//img")
	WebElement maintainanceMenu;
	@FindBy(xpath = "//*[contains(text(),'الأجهزة وقطع الغيار')]")
	public WebElement AssetsAndSparePartsMenu;
	
	
	@FindBy(xpath = "//i[@class='glyphicon glyphicon-log-out']")
	WebElement logOutBtn;
	
	//Appear In The Admin dash-board Screen
	@FindBy(xpath = "//a[contains(text(),'إدارة الموظفين')]")
	public WebElement employessManagmentLink;
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/SiteManagment/ContactLocations/ContactListExtended')]")
	public WebElement cotactsLink;
	@FindBy(xpath = "//a[contains(text(),'إدارة العملاء')]")
	WebElement customersManagmentLink;
	@FindBy(xpath = "//*[contains(@href,'/BaseLine/Operations/WorkOrderListing/WorkOrderList')]")
	WebElement workOrdersLink;
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/SiteManagment/ItemLocations/ItemListTree')]")
	public WebElement assetsLink;
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/AssetListing/AssetTypes/ResourceTypeTabTree')]")
	public WebElement assetsTypesLink;
	@FindBy(xpath = "//a[contains(text(),'الفروع')]")
	public WebElement branchesLink;
	@FindBy(xpath = "//a[contains(text(),'إدارة المدن')]")
	public WebElement cityesManagmentLink;
	
	//Appear in Client User & admin Dash-board
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/Operations/CustomerService/')]")
	public WebElement workRequestsLink;
	
	
	
	//Appear in the Engineer Dash-board screen
	@FindBy(xpath = "//*[contains(@href,'/BaseLine/Operations/WorkOrderListing/WorkOrderEmloyeeList')]")
	public WebElement WorkOrderEmloyeeList;
	

	
	
	public void openSystemSettings()
	{	
		scrollBottom();
		clickBtn(systemSettingsMenu);
	}	
	public void openEmployesManagment()
	{
		clickBtn(employessManagmentLink);
	}	
	public void openContacts()
	{
		clickBtn(cotactsLink);
	}
	public void openCSTManagment()
	{
		clickBtn(customersManagmentLink);
	}
	public void openMaintainance()
	{
		clickBtn(maintainanceMenu);
	}
	public void openWorkOrders()
	{
		clickBtn(workOrdersLink);
	}
	
	public void logOut()
	{
		clickBtn(logOutBtn);
	}

}
