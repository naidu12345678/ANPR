package testCases;



import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_HomeTest extends BaseClass {
	
	@Test(groups= {"sanity","regression"})
	public void verify_liveview() {
		
		logger.info("**** starting TC_002_HomeTest  *****");
		LoginPage lp=new LoginPage(driver);
		lp.enterusername(p.getProperty("superadmin_username"));
		lp.enterpassword(p.getProperty("password"));
		lp.clickLogin();
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLiveview();
		hp.verifyCurrentDate();
		hp.verifyCurrentTime();
		hp.vehicleDetectedText();
		logger.info("**** finished TC_002_HomeTest  *****");
	}
}
