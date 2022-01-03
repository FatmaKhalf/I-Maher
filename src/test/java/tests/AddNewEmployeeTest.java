package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CreateEmployeePage;
import pages.EmployessManagmentPage;
import pages.LoginPage;

public class AddNewEmployeeTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	EmployessManagmentPage EmployessManagmentObject;
	CreateEmployeePage createEmpObject;

	String firstname ="Automated";
	String lastname ="Employee";
	String bithday ="2/3/1996"; 
	String mail ="Automated@test.com";
	String logonname ="AutomatedEngineer";
	String password= "123456";
	
	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");		
	}

	@Test(priority = 2)
	public void UserCanOpenEmployeesManagmentPage() throws InterruptedException
	{

		AdminDashObject = new AdminDashboardPage(driver);	
		Thread.sleep(3000);
		AdminDashObject.openSystemSettings();
		Thread.sleep(3000);
		AdminDashObject.employessManagmentLink.click();
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void UserCanAddNewEmployees() throws InterruptedException
	{
		EmployessManagmentObject = new EmployessManagmentPage(driver);
		EmployessManagmentObject.createEmployeeBtn.click();
		Thread.sleep(3000);
		createEmpObject = new CreateEmployeePage(driver);
		createEmpObject.createEmployee(firstname, lastname, bithday, mail, logonname, password);	
		Thread.sleep(3000);
	}
	@Test(priority = 4)
	public void MakeSureThaCustomerAdded() throws InterruptedException
	{
		EmployessManagmentObject = new EmployessManagmentPage(driver);
		EmployessManagmentObject.searchForEmployee(firstname+" "+lastname);
	}


}
