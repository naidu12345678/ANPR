package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiveviewPage extends BasePage {
	
	WebDriver driver;
	
	public LiveviewPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Live View']")
	WebElement anprLiveviewSideTab;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 gridContainer css-76wze3']//div[@id='locationName']")
	WebElement clickOnLocation;
	
	@FindBy(xpath="//*[@id='locationName']//input")
	List<WebElement> selectLocationNames;
	 
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 gridContainer css-76wze3']//div[@id='camera']")
	WebElement clickOnCamera; 
	
	@FindBy(xpath="//*[@id='camera']//input")
	List<WebElement> selectCameras;
	

	public void clickOnLiveviewSideTab() {
		anprLiveviewSideTab.click();
	}
	
	public void clickOnLocationName() {
		clickOnLocation.click();
	
		
	}
	public void locationNames() {
		
		List<WebElement> locations=selectLocationNames /*driver.findElements(By.xpath("//*[@id='locationName']//input"))*/;
		System.out.println(locations.size());
		

		for(WebElement opt:locations) // Select locations
		{
			if(opt.getText().equals("Kochi"))
			{
				opt.click();
					break;
			}
		}
		
	}
	
	public void clickOnCameraName() {
		clickOnCamera.click();
	}
	
	public void cameraNames() {
		List<WebElement> cameras=selectCameras;
		
		System.out.println(cameras.size());
		
		for(WebElement opt:cameras) // Select cameras
		{
			
			if(opt.getText().equals("lpr_dc"))
			{	
				
				opt.click();
					break;
			}
		}
		
	}
	
}
