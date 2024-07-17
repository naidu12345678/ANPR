package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[text()='Live View'][1]")
	WebElement clickOnLiveview;
	
	@FindBy(xpath="//div[@class='MuiGrid-root css-3f1lk0'][1]")
	WebElement verifyCurrentDate;
	
	@FindBy(xpath="//div[@class='MuiGrid-root css-3f1lk0'][2]")
	WebElement verifyCurrentTime;
	
	@FindBy(xpath="//*[text()=' Vehicles Detected']")
	WebElement vehiclesDetectedText;
	
	public void clickOnLiveview() {
		clickOnLiveview.click();
	}
	
	public void verifyCurrentDate() {
		String textdate=verifyCurrentDate.getText();
		if(textdate.contains("")) {
			System.out.println(textdate);
		}
		else {
			System.out.println("No date");
		}
	}
	public void verifyCurrentTime() {
		String texttime= verifyCurrentTime.getText();
		if(texttime.contains("")) {
			System.out.println(texttime);
			
		}
		else {
			System.out.println("No time");
		}
	}
	public void vehicleDetectedText() {
		String text=vehiclesDetectedText.getText();
		if (text.contains(" ")) {
			System.out.println(text);
			
		}
		else {
			System.out.println("No text");
		}
	}
}
