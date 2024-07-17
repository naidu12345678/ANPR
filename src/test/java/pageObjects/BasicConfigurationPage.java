package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicConfigurationPage extends BasePage{
	WebDriver driver;
	
	public BasicConfigurationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[text()='Basic Configuration']")
	WebElement basicConfigaration;
	
	@FindBy(xpath="//*[text()='Vehicle Registry']")
	WebElement vehicleRegistry;
	
	@FindBy(xpath="//span[@class='MuiTypography-root MuiTypography-h5 MuiCardHeader-title css-t3vaa8']")
	WebElement vehicleRegistryText;
	
	@FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 css-1tlsp6h']")
	WebElement vehicleRegistryTotalRecords;
	
	@FindBy(xpath="//div[@class='MuiGrid-root MuiGrid-container css-9o9tp6']//button[@type='button'][2]")
	WebElement vehicleRegistryListView;
	
	@FindBy(xpath="//p[@class='MuiTypography-root MuiTypography-body1 css-1tlsp6h']")
	WebElement vehicleRegistryListViewRecords;
	
	public void clickOnBasicConfigaration() {
		basicConfigaration.click();
	}
	
	public void clickOnVehicleRegistry() {
		vehicleRegistry.click();
	}
	
	public void clickOnVehicleRegistryText() {
		String vehicleRegistrtytext=vehicleRegistryText.getText();
		if (vehicleRegistrtytext.contains("")) {
			System.out.println(vehicleRegistrtytext);
		}
		else {
			System.out.println("No vehicleRegistrtytext validate");
		}
	}
	public void verifyVehicleRegistryTotalNoOfRecords(){
		String totlanoofrecords=vehicleRegistryTotalRecords.getText();
		if(totlanoofrecords.contains("")) {
			System.out.println(totlanoofrecords);
			
		}
		else {
			System.out.println("No records found");
		}
	}
	
	public void clickOnVehicleRegistryListView() {
		vehicleRegistryListView.click();
		
	}
	
	public void verifyVehicleRegistryListViewRecords() {
		String TotalListviewRecords=vehicleRegistryListViewRecords.getText();
		if(TotalListviewRecords.contains("31")) {
			System.out.println(TotalListviewRecords);
			
		}
		else {
			System.out.println("No records found");
		}
	}

}
