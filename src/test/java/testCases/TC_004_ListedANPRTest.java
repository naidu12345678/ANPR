package testCases;

import org.testng.annotations.Test;

import pageObjects.ListedANPRPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_ListedANPRTest extends BaseClass {
	
	@Test(groups= {"sanity","regression"})
	
	public void verifyListedAnprTab() {
		logger.info("Staring TC_004_ListedANPRTest ");
		
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		
		ListedANPRPage lanprp=new ListedANPRPage(driver);
		lanprp.clickOnListedAnprTab();
		lanprp.verifyListedAnprBreadcrumb();
		
		logger.info("finshed TC_004_ListedANPRTest");
		
	}

}
