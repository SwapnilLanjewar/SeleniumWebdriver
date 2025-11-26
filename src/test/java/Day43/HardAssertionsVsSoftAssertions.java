package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionsVsSoftAssertions {
	/*
	 * @Test void test_HardAssert() { System.out.println("Testing1");
	 * System.out.println("Testing2");
	 * 
	 * Assert.assertTrue(1 == 1);
	 * 
	 * System.out.println("Testing3"); System.out.println("Testing4");
	 * 
	 * }
	 */

	@Test
	void test_SoftAssert() {

		System.out.println("testing1");
		System.out.println("testing2");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(11, 22);

		System.out.println("testing3");
		System.out.println("testing4");
		
		sa.assertAll();

	}

}
