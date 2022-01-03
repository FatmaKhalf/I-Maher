package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.AdminDashboardPage;
import pages.BaseLinePage;
import pages.ContactsPage;
import pages.CreateContactPage;
import pages.LoginPage;

public class CreateNewContactTest extends TestBase {

	BaseLinePage basePageObject;
	LoginPage loginObject;
	AdminDashboardPage AdminDashObject;
	ContactsPage contactsObject;
	CreateContactPage creatcontactObject;

	String fname = "AutomationTest";
	String lname = "TestAutomationForImaher";
	String pass = "123456789";
	String job = "SW Testing";
	String mail = "AutomationTestfinalIMaher11@2test.com";
	String phone = "050672831";
	String logonname = "AutomationTestfinaIMaher11";

	@Test(priority = 1)
	public void UserCanLoginSuccessfully() throws InterruptedException
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");		
	}


	@Test(priority = 2)
	public void UserCanCreateContact() throws InterruptedException
	{

		AdminDashObject = new AdminDashboardPage(driver);	
		Thread.sleep(3000);
		AdminDashObject.openSystemSettings();
		
		WebDriverWait w = new WebDriverWait(driver, 120);
		w.until(ExpectedConditions.titleContains("لوحة القيادة الرئيسية"));
		
		AdminDashObject.openContacts();		
/*
		WebDriverWait w = new WebDriverWait(driver, 120);
		w.until(ExpectedConditions.titleContains("تغيير الموقع"));
*/
		contactsObject = new ContactsPage(driver);
		contactsObject.openCreateContactPage();
		creatcontactObject = new CreateContactPage(driver);
		creatcontactObject.createContact(fname, lname, job, mail, phone, logonname, pass);
	}
	/*
	@Test(priority = 3)
	public void UsercanLoginWithTheCreatedAccount() throws InterruptedException
	{
		Thread.sleep(6000);
		basePageObject = new BaseLinePage(driver);
		basePageObject.logOut();
		Thread.sleep(6000);
		loginObject = new LoginPage(driver);
		loginObject.userLogin(logonname, pass);
		Thread.sleep(6000);
	}

	 */


}
