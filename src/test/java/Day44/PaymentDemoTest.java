package Day44;

import org.testng.annotations.Test;

public class PaymentDemoTest {

	@Test(priority = 1, groups = { "MajorRegression" })
	void paymentinrupees() {
		System.out.println("Payment in Rupees");
	}

	@Test(priority = 2, groups = { "MajorRegression" })
	void paymentindollar() {
		System.out.println("Payment in dollar");
	}

}
