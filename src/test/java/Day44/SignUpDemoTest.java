package Day44;

import org.testng.annotations.Test;

public class SignUpDemoTest {

	@Test(priority = 1, groups = "Regression")
	void signupbyemail() {
		System.out.println("Signup by Email");
	}

	@Test(priority = 2, groups = "Regression")
	void signupbyFacebook() {
		System.out.println("signup by Facebook");
	}

	@Test(priority = 3, groups = "Regression")
	void signupbyWhatsapp() {
		System.out.println("signup by Whatsapp");
	}

	@Test(priority = 4, groups = "Regression")
	void signupbyTwitter() {
		System.out.println("signup by Twitter");
	}
}
