package testCases;

import org.testng.annotations.Test;

import pageObjects.LiveviewPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_005_LiveviewTest extends BaseClass {
	
	@Test(groups= {"sanity","Regression"})
	
	public void verifyLiveviewTest() {
		
		logger.info("**** starting TC_005_LiveviewTest  *****");
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		
		LiveviewPage lvp=new LiveviewPage(driver);
		lvp.clickOnLiveviewSideTab();
		lvp.clickOnLocationName();
		lvp.locationNames();
		lvp.clickOnCameraName();
		lvp.cameraNames();
		
		
	
	
	
		
		
		logger.info("**** finished TC_005_LiveviewTest  *****");
		
	}
}
