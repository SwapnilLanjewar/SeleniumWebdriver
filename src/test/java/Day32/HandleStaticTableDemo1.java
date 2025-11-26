package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTableDemo1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		int columncount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		System.out.println("Column count is:" + columncount);

		int rowcount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		System.out.println("Column count is:" + rowcount);

		WebElement firstitem = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[2]//td[1]"));
		System.out.println("Firstitem is:" + firstitem.getText());

		for (int r = 2; r <= rowcount; r++) {
			for (int c = 1; c <=columncount; c++) {
				String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(value);
			}
		}

	}

}
