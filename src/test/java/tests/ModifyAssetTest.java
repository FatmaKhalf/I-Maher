package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.BaseLinePage;
import pages.EditAssetPage;
import pages.LoginPage;

public class ModifyAssetTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	EditAssetPage editAssetObject;
	String code = "TESTAUTOMATION";
	String serial = "1231::1234::4321::3241";
	String note = "This is an automated test script to test the edit function for the assets";
	
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
	public void UserCanEditAsset() throws InterruptedException
	{
		Thread.sleep(6000);	
		AssetsObject = new AssetsPage(driver);
		Thread.sleep(6000);	
		AssetsObject.chooseCustomer();
		Thread.sleep(7000);
		AssetsObject.automatedBranch.click();
		Thread.sleep(6000);
		AssetsObject.searchInCstAssetsList(code);
		Thread.sleep(6000);
		AssetsObject.editAssetBtn.click();
		Thread.sleep(6000);
		editAssetObject = new EditAssetPage(driver);
		editAssetObject.editAsset(serial, note);
		Thread.sleep(6000);
	
	}

}
