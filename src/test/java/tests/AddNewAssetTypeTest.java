package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.AssetsTypesPage;
import pages.BaseLinePage;
import pages.LoginPage;

public class AddNewAssetTypeTest extends TestBase {
	
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	AssetsTypesPage AssetsTypesObject;
	String code = "Auto12324548";
	String model = "AutoTest";
	String details ="This is an automation script fro adding new asset type!!";
	String manufactor ="GAMBRO";
	String codeAtManufacturer ="MAN12524548";
	String year="2022";
	String cost= "1000";
	String country= "Egypt";
	
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
	public void UserCanCreateNewAssetType() throws InterruptedException
	{	
		Thread.sleep(3000);		
		AssetsTypesObject = new AssetsTypesPage(driver);
		AssetsTypesObject.OpenAddNewModelScreen();
		Thread.sleep(3000);	
		AssetsTypesObject.CreateNewModel(code ,model ,details ,manufactor,codeAtManufacturer,year,cost,country);
		Thread.sleep(3000);	
		AssetsTypesObject.lastPageInTable.click();
		Thread.sleep(3000);
		System.out.println(AssetsTypesObject.assetsTypesTable.getText());
	//AssetsTypesObject.scrollBottom();
	//	Assert.assertTrue(AssetsTypesObject.assetsTypesTable.getText().contains("Auto1232454"));
	//	Assert.assertTrue(AssetsTypesObject.cd.getText().contains(code));

	}

}
