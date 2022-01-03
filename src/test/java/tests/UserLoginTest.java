package tests;

import org.testng.annotations.Test;

import pages.BaseLinePage;
import pages.LoginPage;
import pages.TestPage;

public class UserLoginTest extends TestBase {

	BaseLinePage basePageObject;
	LoginPage loginObject;
	TestPage testobject;
	
	@Test
	public void UserCanLoginSuccessfully()
	{
		loginObject = new LoginPage(driver);
		loginObject.userLogin("admin", "BaseLine12345");	
		testobject= new TestPage(driver);
		testobject.scrollFun();
		
	}

}
