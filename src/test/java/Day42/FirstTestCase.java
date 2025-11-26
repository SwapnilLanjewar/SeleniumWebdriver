package Day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	@Test(priority = 1)
	void Openapp() {
		System.out.println("Open the application");
	}

	@Test(priority = 2)
	void Login() {
		System.out.println("Login into the application");
	}

	@Test(priority = 3)
	void Logout() {
		System.out.println("Logout the application");
	}

}
