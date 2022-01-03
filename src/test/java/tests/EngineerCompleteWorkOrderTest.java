package tests;

import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.CreateWorkOrderPage;
import pages.EngineerWorkOrdersPage;
import pages.LoginPage;
import pages.OperateWorkOrderPage;
import pages.WorkOrdersPage;

public class EngineerCompleteWorkOrderTest extends TestBase{
	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage dashbordObject;
	WorkOrdersPage workOrderObject;
	CreateWorkOrderPage createWOObject;
	String customerName = "";
	String description = "This is an automated test script";
	EngineerWorkOrdersPage EngworkOrderObject;
	OperateWorkOrderPage operateWorkOrderObject;
	
	
	@Test(priority = 1)
	public void LogInEngineerAccount() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("abuarishengineer", "AbuArish@eng2021");
		Thread.sleep(6000);
	}
	@Test(priority = 2)
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
	
	/*
	@Test(priority = 3)
	public void LogOutFromEngineerAccount() throws InterruptedException
	{
		dashbordObject = new AdminDashboardPage(driver);
		dashbordObject.logOut();
		Thread.sleep(6000);
	}*/

}
