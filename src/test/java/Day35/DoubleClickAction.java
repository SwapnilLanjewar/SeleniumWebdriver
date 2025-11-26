package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		
		//Switch to frame
		driver.switchTo().frame("iframeResult");
		
		Actions act = new Actions(driver);
		WebElement firstclick = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		act.click(firstclick);
		
		WebElement doubleclickme = driver.findElement(By.xpath("//*[@ondblclick=\"myFunction()\"]"));
		act.doubleClick(doubleclickme).build().perform();
		
		String message = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		message.equals("Hello World");
		System.out.println("Testcase passed");
		
		
		driver.quit();
		
		
		
	}

}
