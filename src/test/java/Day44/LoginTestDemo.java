package Day44;

import org.testng.annotations.Test;

public class LoginTestDemo {

	@Test(priority = 1, groups = "Sanity")
	void loginbyemail() {
		System.out.println("Login by Email");
	}

	@Test(priority = 2, groups = "Sanity")
	void loginbyFacebook() {
		System.out.println("Login by Facebook");
	}

	@Test(priority = 3, groups = "Sanity")
	void loginbyWhatsapp() {
		System.out.println("Login by Whatsapp");
	}

	@Test(priority = 4, groups = "Sanity")
	void loginbyTwitter() {
		System.out.println("Login by Twitter");
	}

}
