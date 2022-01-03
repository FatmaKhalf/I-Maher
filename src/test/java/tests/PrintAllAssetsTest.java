package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.AssetsPage;
import pages.BaseLinePage;
import pages.LoginPage;

public class PrintAllAssetsTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	AssetsPage AssetsObject;


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

	public void UserCanPrintAllAssets() throws InterruptedException
	{
		Thread.sleep(3000);
		AssetsObject = new AssetsPage(driver);
		AssetsObject.printAllAssetsBtn.click();
		Thread.sleep(3000);

	}

}
