package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CustomersManagmentPage;
import pages.LoginPage;

public class AccessCustomersManagementScreenTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	CustomersManagmentPage CSTmanagmentObject;


	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");		
	}


	@Test(priority = 2)
	public void UserCanOpenCSTmanagmentScreen() throws InterruptedException
	{

		AdminDashObject = new AdminDashboardPage(driver);	
		Thread.sleep(3000);
		AdminDashObject.openSystemSettings();
		Thread.sleep(3000);
		AdminDashObject.openCSTManagment();	
		Thread.sleep(3000);
		CSTmanagmentObject = new CustomersManagmentPage(driver);
		Assert.assertTrue(CSTmanagmentObject.headBreadCrumb.getText().contains("إدارة العملاء"));
		
	}

}
