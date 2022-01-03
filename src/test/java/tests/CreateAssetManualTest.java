package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.BaseLinePage;
import pages.CreateAssetPage;
import pages.LoginPage;

public class CreateAssetManualTest extends TestBase{

	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	CreateAssetPage creatassetObject;
	
	String assetCode = "Test123";
	String assetType = "2051-UCI";
	String serialNo = "00239619723";


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
	public void UserCanOpenCreateAssets() throws InterruptedException
	{	
		Thread.sleep(6000);	
		AssetsObject = new AssetsPage(driver);
		AssetsObject.createAssetBtn.click();
		Thread.sleep(3000);	
	}
	@Test(priority = 4)

	public void UserCanCreateAssets() throws InterruptedException
	{	
		Thread.sleep(3000);	
		creatassetObject = new CreateAssetPage(driver);
		creatassetObject.createAsset(assetCode, assetType,serialNo);
		Thread.sleep(3000);	
	}
	@Test(priority = 5)

	public void MakeSureThatTheAssetCreatedSuccessfuly() throws InterruptedException
	{	
		Thread.sleep(6000);	
		AssetsObject = new AssetsPage(driver);
		AssetsObject.openCustomerAssetsListUnderbranch2Ground();
		Thread.sleep(6000);
		Thread.sleep(6000);
		AssetsObject.lastPageInTable.click();
		Thread.sleep(6000);
		System.out.println(AssetsObject.assetsTable.getText());
	//	Assert.assertTrue(AssetsObject.assetsTable.getText().contains("AB502"));
		Assert.assertTrue(AssetsObject.assetsTable.getText().contains(assetCode));		
	}




}
