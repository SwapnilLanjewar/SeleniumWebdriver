package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActionExample1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");

		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Hello Java");
		driver.findElement(By.xpath("//textarea[@id='inputText2']")).sendKeys("Hello Java");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyDown(Keys.CONTROL).sendKeys("C").build().perform();
		act.keyDown(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").build().perform();
		driver.findElement(By.xpath("//div[@class='compareButtonText']")).click();
		
	}

}
