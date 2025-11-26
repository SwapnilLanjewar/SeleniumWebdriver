package Day47;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageANew {

	WebDriver driver;

	LoginPageANew(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginbutton;


	// Action methods
	public void setusername(String user) {
		txt_username.sendKeys(user);
	}

	public void setpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void loginbutton() {
		loginbutton.click();
	}
}
