package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopAssertDemo {

	String openshop = "Openshop";
	String opencart = "Opencart";

	@Test
	void testopencart() {
		System.out.println("Test passed");
	}

	void testopenshop() {
		System.out.println("Test failed");

		Assert.assertEquals(openshop, opencart);
	}
}
