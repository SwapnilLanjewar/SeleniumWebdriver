package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyMethodsDemo {

	@Test(priority = 1)
	void openapp() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = { "openapp" })
	void login() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	void search() {
		Assert.assertTrue(true);
	}

	@Test(priority = 4, dependsOnMethods = { "search" })
	void advancesearch() {
		Assert.assertTrue(false);
	}

	@Test(priority = 5, dependsOnMethods = { "advancesearch", "search" })
	void logout() {
		Assert.assertTrue(true);

	}

}
