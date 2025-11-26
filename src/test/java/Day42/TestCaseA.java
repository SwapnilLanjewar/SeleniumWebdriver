package Day42;

import org.testng.annotations.Test;

/*
 1. Open App
 2. Login
 3. Logout
 */
public class TestCaseA {
	@Test(priority = 1)
	void openapp() {
		System.out.println("Open application");
	}

	@Test(priority = 2)
	void login() {
		System.out.println("Login to application");
	}

	@Test(priority = 3)
	void logout() {
		System.out.println("Logout of application");
	}

}
