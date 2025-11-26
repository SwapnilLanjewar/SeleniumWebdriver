package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemoExample1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		Actions act = new Actions(driver);

		WebElement min = driver.findElement(By.xpath("//span[@style=\"left: 0%;\"]"));
		WebElement max = driver.findElement(By.xpath("//span[@style=\"left: 100%;\"]"));

		System.out.println(min.getLocation());
		System.out.println(max.getLocation());

		act.dragAndDropBy(min, 100, 150).perform();

	}

}
