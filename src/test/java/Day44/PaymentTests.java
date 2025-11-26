package Day44;

import org.testng.annotations.Test;

public class PaymentTests 
{
	@Test(priority=1, groups={"Regression","Sanity", "functional"})
	void PaymentinRupees() 
	{
		System.out.println("Payement in Rupees");
	}
	
	@Test(priority=2, groups={"Regression","Sanity", "functional"})
	void PaymentinDollars() 
	{
		System.out.println("Payement in Dollars");
	}
}
