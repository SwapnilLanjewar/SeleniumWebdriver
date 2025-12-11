package PracticeDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestMainPage {

	WebDriver driver;

	TestMainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement namefield;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfield;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonefield;
	@FindBy(xpath = "//textarea[@id='textarea']")
	WebElement addressfield;

	public void setname(String name) {
		addressfield.sendKeys(name);
	}

	public void setemail(String email) {
		emailfield.sendKeys(email);
	}

	public void setphone(String phone) {
		phonefield.sendKeys(phone);
	}

	public void setaddress(String address) {
		addressfield.sendKeys(address);
	}

}
