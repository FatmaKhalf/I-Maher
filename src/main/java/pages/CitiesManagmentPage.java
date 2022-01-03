package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiesManagmentPage extends PageBase{

	public CitiesManagmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[@class='buttonGra buttonGraGreen ng-star-inserted']")
	public WebElement addCityBtn;
	@FindBy(css  = "input[placeholder='البحث']")
	WebElement searchBar;
	@FindBy(css  = ".fa.fa-search")
	WebElement searchBtn;

	public void searchForCity (String cityname) throws InterruptedException
	{
		setTextElementTxt(searchBar, cityname);
		Thread.sleep(3000);
		clickBtn(searchBtn);
	}

}
