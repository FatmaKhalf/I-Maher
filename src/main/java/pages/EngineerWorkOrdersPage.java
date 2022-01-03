package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EngineerWorkOrdersPage extends PageBase {

	public EngineerWorkOrdersPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@class='col-sm-3 text-last']//*[@class='buttonGra-group btnResponsive text-last']//*[@class='buttonGra buttonGraAmethyst buttonGra-sm ng-star-inserted']//*[@class='fa fa-copy']")
	WebElement copyIconForOpnWorkOrderDetails;
	
	public void OpenOperateWorkOrderPage() throws InterruptedException
	{
		Thread.sleep(3000);
		clickBtn(copyIconForOpnWorkOrderDetails);
	}
	
}
