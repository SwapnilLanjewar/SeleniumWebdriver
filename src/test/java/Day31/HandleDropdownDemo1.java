package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationcentral.com/demo/multi_select_dropdown.html");
		driver.findElement(By.xpath("//button[@id='dropdown-toggle']")).click();

		List<WebElement> alloptions = driver.findElements(By.xpath("//li[@onclick='toggleCheckbox(this)']"));

		for (WebElement op : alloptions) {

			driver.findElement(By.xpath("(//li[@onclick='toggleCheckbox(this)'])[2]")).click();
			System.out.println(op.getText());
		}

	}

}
