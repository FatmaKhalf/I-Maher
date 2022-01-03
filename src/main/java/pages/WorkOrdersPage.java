package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkOrdersPage extends PageBase{

	public WorkOrdersPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css  = "a.buttonGra.buttonGraGreen.ng-star-inserted")
	WebElement createWorkOrderBtn;
	
	public void openCreateWorkOrderPage() throws InterruptedException
	{
		Thread.sleep(6000);
		clickBtn(createWorkOrderBtn);
	}	

}
