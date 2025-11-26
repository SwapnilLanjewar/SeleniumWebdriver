package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	void test() 
	{
		//Assert.assertEquals("ABC", "ABC");
		//Assert.assertEquals("123", "111");
		
		//Assert.assertNotEquals("XYZ", "XYZ");
		//Assert.assertNotEquals(123, 222);
		
		//Assert.assertTrue(false);
		//Assert.assertFalse(false);
		//Assert.assertTrue(1==2);
		
		
		Assert.fail();
		
	}

	
}
