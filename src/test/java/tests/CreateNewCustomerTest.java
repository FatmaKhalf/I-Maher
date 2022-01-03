package tests;

import org.testng.annotations.Test;

import pages.AddCustomerPage;
import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CustomersManagmentPage;
import pages.LoginPage;

public class CreateNewCustomerTest extends TestBase {
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	CustomersManagmentPage CSTmanagmentObject;
	AddCustomerPage AddCstObject;

	String organizationName  = "Automate Orgnization";
	String region  = "Egypt";
	String sectionName  = "Automation Test";
	String address  = "6th of October"; 
	String branchName  = "ASGATech";
	String branchAddress  = "Elmotamiz";
	

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
	}
	@Test(priority = 3)
	public void UserCanCreateCST() throws InterruptedException
	{
		CSTmanagmentObject = new CustomersManagmentPage(driver);
		CSTmanagmentObject.addCstBtn.click();
		Thread.sleep(6000);
		AddCstObject = new AddCustomerPage(driver);
		AddCstObject.createCustomer(organizationName, region, sectionName, address, branchName, branchAddress);	
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void MakeSureThaCustomerAdded() throws InterruptedException
	{
		CSTmanagmentObject = new CustomersManagmentPage(driver);
		CSTmanagmentObject.searchForCustomer(organizationName);
	}

}
