package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CreateCustomerRequestPage;
import pages.CreateWorkOrderPage;
import pages.CreateWorkOrderfromCustomerRequestPage;
import pages.EditCustomerRequestPage;
import pages.EngineerWorkOrdersPage;
import pages.LoginPage;
import pages.OperateWorkOrderPage;
import pages.WorkOrdersPage;
import pages.WorkRequestDetailsPage;
import pages.WorkRequestsPage;

public class CreateWorkRequestTest extends TestBase{
	
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage dashbordObject;
	WorkOrdersPage workOrderObject;
	CreateWorkOrderPage createWOObject;
	String customerName = "مستشفى أبوعريش العام";
	String description = "This is an automated test script";
	EngineerWorkOrdersPage EngworkOrderObject;
	OperateWorkOrderPage operateWorkOrderObject;
	WorkRequestsPage WorkRequestsObject;
	CreateCustomerRequestPage createCustomerRequestObject;
	WorkRequestDetailsPage WorkRequestDetailsObject;
	CreateWorkOrderfromCustomerRequestPage CreateWorkOrderObject;
	EditCustomerRequestPage EditCustomerRequestObject;


	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("AbuArishUser", "AbuArish@user2021");
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void UserCanOpenCreateWorkRequestPage() throws InterruptedException
	{
		Thread.sleep(3000);
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.openMaintainance();
		Thread.sleep(4000);
		dashbordObject.workRequestsLink.click();
		Thread.sleep(4000);
		WorkRequestsObject = new WorkRequestsPage(driver);
		WorkRequestsObject.CreateCustomerRequestBtn.click();
		Thread.sleep(4000);	
	}
	@Test(priority = 3)
	public void UserCanCreateWorkRequest() throws InterruptedException
	{
		createCustomerRequestObject = new CreateCustomerRequestPage(driver);
		createCustomerRequestObject.createWorkRequest();
		Thread.sleep(6000);
		//LogOut from Client Account 
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.logOut();
	}
	
	@Test(priority = 4)
	public void AdminCanOpenCustomerRequests() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");
		Thread.sleep(3000);
		Thread.sleep(3000);
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.openMaintainance();
		Thread.sleep(3000);
		dashbordObject.workRequestsLink.click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 5)
	public void AdminCanWorkonCustomerRequests() throws InterruptedException
	{
		WorkRequestsObject = new WorkRequestsPage(driver);
		Thread.sleep(3000);
		WorkRequestsObject.openRequestDetailsBtn.click();
		Thread.sleep(3000);
		WorkRequestDetailsObject = new WorkRequestDetailsPage(driver);
		WorkRequestDetailsObject.CreateWorkOrderBtn.click();
		Thread.sleep(3000);
		CreateWorkOrderObject = new CreateWorkOrderfromCustomerRequestPage(driver);
		CreateWorkOrderObject.createWorkOrder();
		Thread.sleep(3000);
		WorkRequestDetailsObject.SaveBtn.click();
		Thread.sleep(5000);
	}
	@Test(priority = 6)
	public void LoginEngineerAccount() throws InterruptedException
	{
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.logOut();
		Thread.sleep(6000);
		loginObject = new LoginPage(driver);
		loginObject.userLogin("abuarishengineer", "AbuArish@eng2021");
		Thread.sleep(6000);
	}

	@Test(priority = 7)
	public void EngineerApprovingAndWorkOnOrder() throws InterruptedException
	{
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.openMaintainance();
		Thread.sleep(6000);	
		dashbordObject.WorkOrderEmloyeeList.click();
		EngworkOrderObject = new EngineerWorkOrdersPage(driver);
		EngworkOrderObject.OpenOperateWorkOrderPage();
		Thread.sleep(6000);
		operateWorkOrderObject = new OperateWorkOrderPage(driver);
		operateWorkOrderObject.ApproveOrder();
		Thread.sleep(6000);
		operateWorkOrderObject.FixingTheassetProcess();	
		Thread.sleep(6000);
		EngworkOrderObject.OpenOperateWorkOrderPage();
		Thread.sleep(6000);
		operateWorkOrderObject.confirmOrderComplete();
		Thread.sleep(6000);
		
	}
	
	@Test(priority = 8)
	public void CustomerConfirmTHatRequestDone() throws InterruptedException
	{
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.logOut();
		Thread.sleep(6000);
		loginObject = new LoginPage(driver);
		loginObject.userLogin("AbuArishUser", "AbuArish@user2021");
		Thread.sleep(6000);
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.openMaintainance();
		Thread.sleep(4000);
		dashbordObject.workRequestsLink.click();
		Thread.sleep(4000);
		WorkRequestsObject = new WorkRequestsPage(driver);
		Thread.sleep(3000);
		WorkRequestsObject.EditCustomerRequestBtn.click();
		EditCustomerRequestObject = new EditCustomerRequestPage(driver);
		EditCustomerRequestObject.closeRequestFromCustomerSide();
		
		
	}
	
	
	

}
