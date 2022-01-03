package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchesPage extends PageBase{

	public BranchesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "//a[@class='buttonGra buttonGraGreen ng-star-inserted']")
	public WebElement addBrancheBtn;
	@FindBy(css  = "input[placeholder='البحث']")
	WebElement searchBar;
	@FindBy(css  = ".fa.fa-search")
	WebElement searchBtn;

	public void searchForBranch (String branchName) throws InterruptedException
	{
		setTextElementTxt(searchBar, branchName);
		Thread.sleep(3000);
		clickBtn(searchBtn);
	}

}
