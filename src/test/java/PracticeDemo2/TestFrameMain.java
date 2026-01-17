package PracticeDemo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestFrameMain {

	WebDriver driver;

	TestFrameMain(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//frame[@src=\"frame_1.html\"]")
	WebElement frameone;
	@FindBy(xpath = "//input[@name='mytext1']")
	WebElement textframeone;

	public void set_frameonevalue(String frameonetext) {
		driver.switchTo().frame(frameone);
		textframeone.sendKeys(frameonetext);
	}

}
