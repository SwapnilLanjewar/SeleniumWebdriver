package Day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions_Example1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//*[@name=\"text1\"]")).sendKeys("Welcome to Java");
		
		Actions act = new Actions(driver);
	
		//Ctrl + A   --> Select text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).keyUp("A").perform();
		
		//Ctrl + C   --> Copy the text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).keyUp("C").perform();
		
		//Tab        --> Move to next tab
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl + V   --> Paste to next textbox
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).keyUp("V").perform();
		
		
		driver.findElement(By.xpath("//*[@class=\"compareButtonText\"]")).click();
		
		Thread.sleep(5000);
		
		String text = driver.findElement(By.xpath("//span[@class='messageForUser']")).getText();
		
		if(text.equals("The two texts are identical!")) 
		{
			System.out.println("Testcase is passed and identical");
		}
		else 
		{
			System.out.println("Testcase is failed and are not identical");
		}
	}

}
