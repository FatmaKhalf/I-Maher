package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OperateWorkOrderPage extends PageBase{

	public OperateWorkOrderPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//button[contains(@title,'قبول')]")
	WebElement acceptOrderBtn;
	@FindBy(xpath = "//button[contains(@title,'تم الإصلاح')]")
	WebElement assetsFixedBtn;
	@FindBy(xpath = "//*[@id=\"FG_faultType\"]/div/textarea")
	WebElement faultTypeTxt;
	@FindBy(xpath = "//*[@id=\"FG_actionTaken\"]/div/textarea")
	WebElement takenActionTxt;
	@FindBy(xpath = "//button[@class=' buttonGra buttonGraOrange ']")
	WebElement workOrderReportSaveBtn;
	@FindBy(xpath = "//button[contains(@title,'تم التنفيذ')]")
	WebElement orderCompletedBtn;
	@FindBy(xpath = "//button[contains(@title,'موافق')]")
	WebElement confirmBtn;


	public void ApproveOrder()
	{
		clickBtn(acceptOrderBtn);
	}

	public void FixingTheassetProcess() throws InterruptedException
	{
		scrollMiddle();
		Thread.sleep(6000);
		clickBtn(assetsFixedBtn);
		Thread.sleep(6000);
		setTextElementTxt(faultTypeTxt, "Fixed");
		Thread.sleep(6000);
		setTextElementTxt(takenActionTxt, "Fixed using the attached equbiments during the visit");
		Thread.sleep(6000);
		clickBtn(workOrderReportSaveBtn);
		Thread.sleep(6000);
		scrollUp();
		Thread.sleep(6000);
		clickBtn(orderCompletedBtn);
		Thread.sleep(6000);
		setTextElementTxt(takenActionTxt, "Fixed using the attached equbiments during the visit");
		Thread.sleep(3000);		
		clickBtn(workOrderReportSaveBtn);	
		Thread.sleep(6000);		
	}
	public void confirmOrderComplete() throws InterruptedException
	{			
		Thread.sleep(3000);
		clickBtn(confirmBtn);
		Thread.sleep(3000);
	}

}
