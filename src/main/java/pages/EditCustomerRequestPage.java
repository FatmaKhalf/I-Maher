package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerRequestPage extends PageBase {

	public EditCustomerRequestPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath = "//*[contains(text(),'حالة الطلب')]")
	WebElement requestStatusBtn;
	@FindBy(xpath = "//*[contains(text(),' مغلق ')]")
	WebElement closedStatusBtn;
	@FindBy(xpath = "//*[@id=\"rate\"]/div/div/star-rating//div/span[4]")
	WebElement fiveStarsBtn;
	@FindBy(xpath = "//div[@class='col-sm-9']//textarea[@name='Form__reason']")
	WebElement commentTxt;
	@FindBy(xpath = "//button[contains(text(),' أوافق ')]")
	WebElement okBtn;
	
	public void closeRequestFromCustomerSide() throws InterruptedException
	{			
		scrollMiddle();
		Thread.sleep(5000);
		clickBtn(requestStatusBtn);
		Thread.sleep(5000);
		clickBtn(closedStatusBtn);
		Thread.sleep(3000);
		//clickBtn(fiveStarsBtn);
		Thread.sleep(3000);
		setTextElementTxt(commentTxt, "The Engineer had checked the device and now it works good");
		clickBtn(okBtn);
	}


}
