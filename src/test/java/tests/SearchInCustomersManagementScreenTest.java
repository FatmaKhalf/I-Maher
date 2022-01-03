package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CustomersManagmentPage;
import pages.LoginPage;

public class SearchInCustomersManagementScreenTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	CustomersManagmentPage CSTmanagmentObject;
	String organizationName  = "Test Orgnization";


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
		Thread.sleep(6000);
		CSTmanagmentObject = new CustomersManagmentPage(driver);
		Assert.assertTrue(CSTmanagmentObject.headBreadCrumb.getText().contains("إدارة العملاء"));		
		Thread.sleep(4000);

	}
	@Test(priority = 3)
	public void UserCanSearchInCSTmanagmentScreen() throws InterruptedException
	{

		CSTmanagmentObject = new CustomersManagmentPage(driver);
		CSTmanagmentObject.searchForCustomer(organizationName);
	}

}
