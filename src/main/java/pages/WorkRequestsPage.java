package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkRequestsPage extends PageBase{

	public WorkRequestsPage(WebDriver driver) {
		super(driver);
	}

	//For client
	@FindBy(xpath = "//a[contains(@href,'/BaseLine/Operations/CustomerRequests/WorkRequestCreate')]")
	public WebElement CreateCustomerRequestBtn ;
	@FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[1]/div[1]/div/div/div[3]/div/a[1]")
	public WebElement EditCustomerRequestBtn ;
	

	//For Admin
	@FindBy(xpath = "//*[@id=\"tab-1\"]/div[2]/div[1]/div[1]/div/div/div[3]/div/a[1]")
	public WebElement openRequestDetailsBtn ;
	
	


	
}


