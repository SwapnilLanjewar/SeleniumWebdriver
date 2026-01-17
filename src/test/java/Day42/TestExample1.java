package Day42;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample1 {

	@Test(priority = 4, groups = { "regression" })
	void testA() {
		System.out.println("Test one");
	}

	@Test(priority = 3, groups = { "sanity" })
	void testB() {
		System.out.println("Test two");
	}

	@Test(priority = 2, groups = { "regression" })
	void testC() {
		Assert.assertEquals("A", "B");
		System.out.println("Test three");
	}

	@Test(priority = 1, groups = { "regression", "sanity" })
	void testD() {
		System.out.println("Test four");
	}

	@Test(priority = 0, groups = { "regression" })
	void testE() {
		System.out.println("Test five");
	}

	/*
	 * @Test void testassertions() { String text1 = "APPLE"; String text2 = "apple";
	 * Assert.assertEquals(text1, text2); }
	 */
}
