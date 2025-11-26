package Day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_Example_2 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testmouse.com/mouse-click-test");
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[contains(text(),'Right Click Test')]"));	
				
		Actions act= new Actions(driver);
		
		act.contextClick(rightclickbutton).build().perform();
		
	}

}
