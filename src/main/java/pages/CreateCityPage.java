package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCityPage extends PageBase{

	public CreateCityPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//input[@placeholder='أسم المدينه']")
	WebElement cityNameTxt;
	@FindBy(css = "select[name='Form__entity_countryId']")
	WebElement countryLbl;
	@FindBy(xpath = "//option[contains(text(),'مصر')]")
	WebElement countrySelectedEgypt;
	@FindBy(xpath = "//select[@name='Form__entity_regionId']")
	WebElement regionLbl;
	@FindBy(xpath = "//option[contains(text(),'واحة سيوة')]")
	WebElement regionSelectedSiwa;
	@FindBy(xpath = "//button[contains(text(),'حفظ')]")
	WebElement saveBtn;
	
	public void CreateCity(String cityname) throws InterruptedException
	{
		setTextElementTxt(cityNameTxt, cityname);
		Thread.sleep(3000);
		clickBtn(countryLbl);
		Thread.sleep(3000);
		clickBtn(countrySelectedEgypt);
		Thread.sleep(3000);
		clickBtn(regionLbl);
		Thread.sleep(3000);
		clickBtn(regionSelectedSiwa);
		Thread.sleep(3000);
		clickBtn(saveBtn);
	}


}
