package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement pointme = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		WebElement mouse = driver.findElement(By.xpath("//div[@class=\"dropdown-content\"]//a[contains(text(),\"Mobiles\")]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(pointme).moveToElement(mouse).build().perform();
		
		
		WebElement copybutton = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction1()\"]"));
		
		act.doubleClick(copybutton).build().perform();
		
		
		Thread.sleep(5000);
		String field2 = driver.findElement(By.xpath("//input[@id='field2']")).getText();
		System.out.println("Verify its equal" + field2.equals("Hello World!"));
		
	}

}
