package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.AssetsTypesPage;
import pages.BaseLinePage;
import pages.LoginPage;

public class MoveAssetsFromLocationToOtherOneTest extends TestBase{

	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	AssetsTypesPage AssetsTypesObject;
	String code = "TESTAUTOMATION";

	
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		Thread.sleep(3000);
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");
		Thread.sleep(3000);		
	}
	@Test(priority = 2)
	public void UserCanOpenAssetsPage() throws InterruptedException
	{	
		Thread.sleep(6000);	
		AdminDashObject = new AdminDashboardPage(driver);
		AdminDashObject.AssetsAndSparePartsMenu.click();
		Thread.sleep(3000);	
		AdminDashObject.assetsLink.click();
		Thread.sleep(3000);		
	}
	@Test(priority = 3)
	public void UserCanMoveAssetBetweenLocations() throws InterruptedException
	{
		Thread.sleep(6000);	
		AssetsObject = new AssetsPage(driver);
		AssetsObject.chooseCustomer();
		Thread.sleep(3000);
		AssetsObject.AbuArishCustomerFromTree.click();
		Thread.sleep(3000);
		AssetsObject.searchInCstAssetsList(code);
		Thread.sleep(3000);
		AssetsObject.moveType();
		Thread.sleep(3000);
		AssetsObject.searchInCstAssetsList(code);
	
	}
	

}
