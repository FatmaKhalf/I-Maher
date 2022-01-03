package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CitiesManagmentPage;
import pages.CreateCityPage;
import pages.LoginPage;

public class CreateNewCityTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	CitiesManagmentPage citiesObject;
	CreateCityPage createcityObject;

	String cityname ="Automated City";
	
	
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
		AdminDashObject.cityesManagmentLink.click();	
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void UserCanAddNewBranch() throws InterruptedException
	{
		citiesObject = new CitiesManagmentPage(driver);
		citiesObject.addCityBtn.click();
		Thread.sleep(3000);
		createcityObject = new CreateCityPage(driver);
		createcityObject.CreateCity(cityname);
		Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void MakeSureThaCustomerAdded() throws InterruptedException
	{
		Thread.sleep(3000);
		citiesObject = new CitiesManagmentPage(driver);
		citiesObject.searchForCity(cityname);
	}
}
