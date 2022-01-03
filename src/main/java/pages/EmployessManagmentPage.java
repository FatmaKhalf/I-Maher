package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployessManagmentPage extends PageBase {

	public EmployessManagmentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='buttonGra buttonGraGreen ng-star-inserted']")
	public WebElement createEmployeeBtn;
	@FindBy(css  = "input[placeholder='البحث']")
	 WebElement searchBar;
	@FindBy(css  = ".fa.fa-search")
	WebElement searchBtn;
	
	public void searchForEmployee (String employeeName)
	{
		setTextElementTxt(searchBar, employeeName);
		clickBtn(searchBtn);
	}
	

}
