package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.BranchesPage;
import pages.CreateBranchPage;
import pages.LoginPage;

public class CreateNewBranchTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	BranchesPage brancheObject;
	CreateBranchPage createbranchObject;

	String branchname ="Automated Branch";
	String branchaddress  ="6th of October";
	
	
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");		
	}

	@Test(priority = 2)
	public void UserCanOpenBranchesPage() throws InterruptedException
	{
		AdminDashObject = new AdminDashboardPage(driver);	
		Thread.sleep(3000);
		AdminDashObject.openSystemSettings();
		Thread.sleep(3000);
		AdminDashObject.branchesLink.click();	
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void UserCanAddNewBranch() throws InterruptedException
	{
		Thread.sleep(3000);
		brancheObject = new BranchesPage(driver);
		brancheObject.addBrancheBtn.click();
		Thread.sleep(3000);
		createbranchObject = new CreateBranchPage(driver);
		createbranchObject.createBranch(branchname, branchaddress);	
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void MakeSureThaCustomerAdded() throws InterruptedException
	{
		Thread.sleep(3000);
		brancheObject = new BranchesPage(driver);
		brancheObject.searchForBranch(branchname);
	}
}
