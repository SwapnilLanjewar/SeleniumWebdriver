package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2_BeforeAfterClass {

	@BeforeClass
	void login() {
		System.out.println("This is Login");
	}

	@Test(priority=1)
	void search() {
		System.out.println("This is search");
	}

	@Test(priority=2)
	void advancesearch() {
		System.out.println("This is advance search");
	}

	@AfterClass
	void logout() {
		System.out.println("This is Logout");
	}
}
