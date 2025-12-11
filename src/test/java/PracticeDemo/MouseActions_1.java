package PracticeDemo;

import java.net.DatagramSocketImplFactory;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions act = new Actions(driver);

		WebElement pointmebutton = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		act.moveToElement(pointmebutton).build().perform();
		System.out.println("Hover is passed");

		WebElement dropdowncontent = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]"));
		System.out.println(dropdowncontent.getText());

		Thread.sleep(5000);

		// Drag and Drop
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(source, target).build().perform();
		System.out.println("Drag and drop is successful");

		// Double Click
		String field1 = driver.findElement(By.xpath("//input[@id='field1']")).getText();
		WebElement copytextbutton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		act.doubleClick(copytextbutton).build().perform();

		String field2 = driver.findElement(By.xpath("//input[@id='field2']")).getText();

		if (field1.equals(field2)) {
			System.out.println("Both are equal test passed");
		} else {
			System.out.println("Both are not equal test failed");
		}

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Thread.sleep(5000);

		// Keyboard actions
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Apple");

		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		
		Thread.sleep(8000);
		System.out.println("Slider is done");
		
		Thread.sleep(5000);

		// Slider
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement startingpoint = driver.findElement(By.xpath("//div[@name=\"rangeInput\"]//span[1]"));

		System.out.println("Location of the starting point:" + startingpoint.getLocation());

		act.dragAndDropBy(startingpoint, 100, 30).perform();

		System.out.println("Location od the starting slider" + startingpoint.getLocation());

		WebElement maximumpoint = driver.findElement(By.xpath("//div[@name=\"rangeInput\"]//span[2]"));
		act.dragAndDropBy(maximumpoint, -100, 249).perform();

	}

}
