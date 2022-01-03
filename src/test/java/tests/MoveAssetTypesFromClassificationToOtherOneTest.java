package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.AssetsTypesPage;
import pages.BaseLinePage;
import pages.LoginPage;

public class MoveAssetTypesFromClassificationToOtherOneTest extends TestBase{

	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	AssetsTypesPage AssetsTypesObject;
	String code = "Auto12324548";

	
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		Thread.sleep(3000);
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");
		Thread.sleep(3000);		
	}
	@Test(priority = 2)
	public void UserCanOpenAssetsTypesPage() throws InterruptedException
	{	
		Thread.sleep(6000);	
		AdminDashObject = new AdminDashboardPage(driver);
		AdminDashObject.AssetsAndSparePartsMenu.click();
		Thread.sleep(3000);	
        AdminDashObject.assetsTypesLink.click();
		Thread.sleep(3000);		
	}
	@Test(priority = 3)
	public void UserCanAssetTypeBetweenClassifications() throws InterruptedException
	{
		AssetsTypesObject = new AssetsTypesPage(driver);
		AssetsTypesObject.underTestAssets.click();
		Thread.sleep(3000);
		AssetsTypesObject.searchInResourceTypeList(code);
		Thread.sleep(3000);
		AssetsTypesObject.moveType();
		Thread.sleep(3000);
		AssetsTypesObject.searchInResourceTypeList(code);
		
	
	
	}
	

}
