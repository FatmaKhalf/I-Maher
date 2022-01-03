package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.BaseLinePage;
import pages.CreateAssetPage;
import pages.LoginPage;

public class CreateAssetLocationTotheCustomerBranchTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;
	CreateAssetPage creatassetObject;
	
	String locationName = "New Automated Location";



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
	public void UserCanCreateAssetsLocation() throws InterruptedException
	{	
		Thread.sleep(6000);	
		AssetsObject = new AssetsPage(driver);
		AssetsObject.chooseCustomer();
		Thread.sleep(3000);
		AssetsObject.createAssetsLocation(locationName);
	}

}
