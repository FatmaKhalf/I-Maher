package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateEmployeePage extends PageBase{

	public CreateEmployeePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@placeholder='الأسم الأول']")
	WebElement firstnameTxt;
	@FindBy(css = "input[placeholder='أسم العائله']")
	WebElement lastnameTxt;
	@FindBy(xpath = "//select[@name='Form__entity_jobRoleId']")
	WebElement jobRuleList;
	@FindBy(xpath = "//select[@name='Form__entity_jobRoleId']//option[contains(text(),'مهندس')]")
	WebElement selectjobRuleAsEng;
	@FindBy(xpath = "//select[@name='Form__entity_departmentId']")
	WebElement departmentList;
	@FindBy(xpath = "//select[@name='Form__entity_departmentId']//option[contains(text(),'اختبار')]")
	WebElement selectdepartmentTest;
	@FindBy(css = "input[placeholder='تاريخ الميلاد']")
	WebElement birthDateTxt;
	@FindBy(xpath = "//select[@name='Form__entity_gender']")
	WebElement genderList;
	@FindBy(xpath = "//select[@name='Form__entity_gender']//option[contains(text(),'انثي')]")
	WebElement selectFemalegender;
	@FindBy(xpath = "//input[@placeholder='البريد الألكتروني']")
	WebElement mailTxt;
	@FindBy(css =  ".fa.fa-lg.fa-toggle-off.grayColor")
	WebElement userAccountActivation;
	@FindBy(xpath = "//input[@placeholder='اسم المرور']")
	WebElement logonNameTxt;
	@FindBy(css = "input[placeholder='كلمه المرور']")
	WebElement userPasswordTxt;
	@FindBy(xpath = "//input[@placeholder='تأكيد كلمه المرور']")
	WebElement confirmuserPasswordTxt;
	@FindBy(xpath = "//select[@name='Form__entity_tenantAppId']")
	WebElement tenantAppIdList;
	@FindBy(xpath = "//select[@name='Form__entity_tenantAppId']//option[contains(text(),'تطبيق المهندسين')]")
	WebElement selectEngineersAppId;
	@FindBy(xpath = "//select[@name='Form__countryId']")
	WebElement countryIdList;
	@FindBy(xpath = "//select[@name='Form__countryId']//option[contains(text(),'مصر')]")
	WebElement selectEgyptFromcountryIdList;
	@FindBy(xpath = "//select[@name='Form__regionId']")
	WebElement regionIdList;
	@FindBy(xpath = "//select[@name='Form__regionId']//option[contains(text(),'القاهرة')]")
	WebElement selectCairoFromRegionList;
	@FindBy(css =  "select[name='Form__entity_cityId']")
	WebElement cityIdList;
	@FindBy(xpath = "//select[@name='Form__entity_cityId']//option[contains(text(),'مصر الجديدة')]")
	WebElement selectNewCairoFromCityList;
	@FindBy(xpath = "//button[contains(text(),'حفظ')]")
	WebElement saveBtn;
	
	public void createEmployee(String firstname, String lastname, String bithday, String mail,
			String logonname, String password) throws InterruptedException
	{
		setTextElementTxt(firstnameTxt, firstname);
		setTextElementTxt(lastnameTxt, lastname);
		clickBtn(jobRuleList);
		Thread.sleep(3000);
		clickBtn(selectjobRuleAsEng);
		Thread.sleep(3000);
		clickBtn(departmentList);
		Thread.sleep(3000);
		clickBtn(selectdepartmentTest);
		Thread.sleep(3000);
		setTextElementTxt(birthDateTxt, bithday);
		clickBtn(genderList);
		Thread.sleep(3000);
		clickBtn(selectFemalegender);
		Thread.sleep(3000);
		setTextElementTxt(mailTxt, mail);
		clickBtn(userAccountActivation);
		Thread.sleep(3000);
		clickBtn(userAccountActivation);
		setTextElementTxt(logonNameTxt, logonname);
		setTextElementTxt(userPasswordTxt, password);
		setTextElementTxt(confirmuserPasswordTxt, password);
		clickBtn(tenantAppIdList);
		Thread.sleep(3000);
		clickBtn(selectEngineersAppId);
		Thread.sleep(3000);
		clickBtn(countryIdList);
		Thread.sleep(3000);
		clickBtn(selectEgyptFromcountryIdList);
		Thread.sleep(3000);
		clickBtn(regionIdList);
		Thread.sleep(3000);
		clickBtn(selectCairoFromRegionList);
		Thread.sleep(3000);
		clickBtn(cityIdList);
		Thread.sleep(3000);
		clickBtn(selectNewCairoFromCityList);
		Thread.sleep(3000);
		clickBtn(saveBtn);
		
	}
}
