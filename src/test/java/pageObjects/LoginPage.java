package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement enterusername;

	@FindBy(xpath = "//input[@name='password']")
	WebElement enterpassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement clickLogin;

	@FindBy(xpath = "//div[@class='reapop__container reapop__container--top-right']")
	WebElement loginSuccessMsg;

	@FindBy(xpath = "//img[@alt='logo']")
	WebElement verifyLogo;

	public void enterusername(String uname) {
		enterusername.sendKeys(uname);
	}

	public void enterpassword(String pwd) {
		enterpassword.sendKeys(pwd);
	}

	public void clickLogin() {
		clickLogin.click();
	}

	public void loginSuccessMsg() {
		String textmsg=loginSuccessMsg.getText();
		if(textmsg.contains("")) {
			System.out.println(textmsg);
		}
		else {
			System.out.println("login failed");
		}
		
	}

	public void verifyLogo() {
		String logo=verifyLogo.getText();
		if(logo.contains("")) {
			System.out.println(logo);
			
		}
		else {
			System.out.println("No logo");
		}
	
	}
}




