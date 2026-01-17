package PracticeDemo2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestScrollingMain {

	WebDriver driver;
	JavascriptExecutor js;

	TestScrollingMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//*[text()=\"Netherlands\"]")
	WebElement target;

	/*
	 * public void scrollmethod() throws InterruptedException { Thread.sleep(5000);
	 * js.executeScript("window.scrollBy(0,3000)", ""); }
	 */

	public void scrollmethod() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", target);
		Thread.sleep(5000);


	}
}
