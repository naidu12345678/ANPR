package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListedANPRPage extends BasePage {
	
	
	WebDriver driver;
	
	public ListedANPRPage(WebDriver driver) {
		
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@class='MuiGrid-root css-q6ni27']//*[text()='Listed ANPR']")
	WebElement ListedAnprSideTab;
	
	@FindBy(xpath="//li[@class='MuiBreadcrumbs-li']//*[text()='Listed ANPR']")
	WebElement ListedAnprBreadcrumb;
	
	
	public void clickOnListedAnprTab() {
		ListedAnprSideTab.click();
	}
	
	public void verifyListedAnprBreadcrumb() {
		String anprBreadcrumb=ListedAnprBreadcrumb.getText();
		
		if(anprBreadcrumb.contains("")) {
			System.out.println(anprBreadcrumb);
		}
		else {
			System.out.println("No Braedcrumb text");
		}
		
	}
}
