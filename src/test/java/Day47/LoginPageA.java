package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageA {

	// Constructor
	WebDriver driver;

	LoginPageA(WebDriver driver) {
		this.driver = driver;
	}

	// Locators
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By login_button = By.xpath("//button[normalize-space()='Login']");

	// Action methods
	public void setusername(String user) {
		driver.findElement(txt_username_loc).sendKeys("Admin");
	}

	public void setpassword(String password) {
		driver.findElement(txt_password_loc).sendKeys("Admin123");
	}

	public void loginbutton() {
		driver.findElement(login_button).click();
	}
}
