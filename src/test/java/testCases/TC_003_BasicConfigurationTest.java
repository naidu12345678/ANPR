package testCases;

import org.testng.annotations.Test;

import pageObjects.BasicConfigurationPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_003_BasicConfigurationTest extends BaseClass {
	
	@Test(groups= {"sanity","regression"})
	
	public void verify_basicConfigarationTab() {
		logger.info("**** starting TC_003_BasicConfigurationTest  *****");
		
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		
		BasicConfigurationPage bcp=new BasicConfigurationPage(driver);
		bcp.clickOnBasicConfigaration();
		bcp.clickOnVehicleRegistry();
		bcp.clickOnVehicleRegistryText();
		bcp.verifyVehicleRegistryTotalNoOfRecords();
		bcp.clickOnVehicleRegistryListView();
		bcp.verifyVehicleRegistryListViewRecords();
		
		logger.info("*** Finished TC_003_BasicConfigurationTest ***");
	}
}
