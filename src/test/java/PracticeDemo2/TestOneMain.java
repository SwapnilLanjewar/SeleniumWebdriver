package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestOneMain {

	WebDriver driver;
	WebDriverWait wait;

	TestOneMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//textarea[@id='textarea']")
	WebElement address;
	@FindBy(xpath = "//input[@id='male']")
	WebElement gender;
	@FindBy(xpath = "//input[@id='sunday']")
	WebElement sunday;
	@FindBy(xpath = "//h1[normalize-space()='Automation Testing Practice']")
	WebElement pagetitle;

	public void set_name(String namevalue) {
		name.sendKeys(namevalue);
	}

	public void set_email(String emailvalue) {
		email.sendKeys(emailvalue);
	}

	public void set_phone(String phonevalue) {
		phone.sendKeys(phonevalue);
	}

	public void set_address(String addressvalue) {
		address.sendKeys(addressvalue);
	}

	public void set_gender() {
		wait.until(ExpectedConditions.elementToBeClickable(gender));
		gender.click();
	}

	public void set_week() {
		wait.until(ExpectedConditions.elementToBeClickable(sunday));
		sunday.click();

		sunday.isSelected();
	}

	public String get_title() {
		return driver.getTitle();
	}

	public String get_currenturl() {
		return driver.getCurrentUrl();
	}

	public boolean get_pagetitle() {
		return pagetitle.isDisplayed();
	}

}
