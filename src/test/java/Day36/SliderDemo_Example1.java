package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo_Example1 {

	public static void main(String[] args) throws InterruptedException {		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");

		WebElement slider_min = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println(slider_min.getLocation()); // 59,257


		Actions ac = new Actions(driver);
		
		ac.dragAndDropBy(slider_min, 100, 257).perform();

	}

}
