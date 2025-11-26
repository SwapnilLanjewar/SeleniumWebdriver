package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement startingpoint = driver.findElement(By.xpath("//div[@name=\"rangeInput\"]//span[1]"));
		
		System.out.println("Location of the starting point:" + startingpoint.getLocation());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(startingpoint, 100, 30).perform();
		
		System.out.println("Location od the starting slider"+ startingpoint.getLocation());
		
		
		WebElement maximumpoint = driver.findElement(By.xpath("//div[@name=\"rangeInput\"]//span[2]"));
		act.dragAndDropBy(maximumpoint, -100, 249).perform();

	}

}
