package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadiobuttons {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement maleradiobutton = driver.findElement(By.xpath("//*[@id='male']"));
		maleradiobutton.click();

		if (maleradiobutton.isSelected()) {
			System.out.println("Button is selected");
		} 
		else 
		{
			System.out.println("Button not selected");
		}

	}

}
