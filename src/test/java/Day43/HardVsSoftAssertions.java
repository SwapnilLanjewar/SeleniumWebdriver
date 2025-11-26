package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions 
{
	//@Test
	void hard_assertions() 
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		Assert.assertEquals("ABC", "XYZ");
		
		System.out.println("TESTING");
		System.out.println("TESTING");
	}
	
	@Test
	void soft_assertions() 
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("ABC", "XYZ");
		
		System.out.println("TESTING");
		System.out.println("TESTING");
		
		sa.assertAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
