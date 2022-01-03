package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersManagmentPage extends PageBase{

	public CustomersManagmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css  = ".headBreadCrumb")
	public WebElement headBreadCrumb;
	@FindBy(css  = ".buttonGra.buttonGraGreen.ng-star-inserted")
	public WebElement addCstBtn;
	@FindBy(css  = "input[placeholder='البحث']")
	WebElement searchBar;
	@FindBy(css  = ".fa.fa-search")
	WebElement searchBtn;

	public void searchForCustomer (String organizationName)
	{
		setTextElementTxt(searchBar, organizationName);
		clickBtn(searchBtn);
	}

}
