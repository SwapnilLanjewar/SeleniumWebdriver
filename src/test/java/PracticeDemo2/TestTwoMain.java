package PracticeDemo2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestTwoMain {

	WebDriver driver;
	WebDriverWait mywait;

	TestTwoMain(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id=\"name\"]")
	WebElement name;

	@FindBy(xpath = "//input[@id=\"male\"]")
	WebElement male;

	@FindBy(xpath = "//input[@id=\"tuesday\"]")
	WebElement week;

	public void setname(String namevalue) {
		name.sendKeys(namevalue);
	}

	public void geturl() {
		driver.getCurrentUrl();
	}

	public void gettitle() {
		mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String title = driver.getTitle();
		Boolean titlestatus = mywait.until(ExpectedConditions.titleContains(title));
		titlestatus.equals(title);

	}

	public void checkgenderbutton() {
		male.isDisplayed();
	}

	public void checkweekbutton() {
		week.click();
		week.isEnabled();
	}
}
