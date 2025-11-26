package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssertDemo {
	
	@Test
	void test() 
	{
		//Assert.assertEquals(11, 22);   //Failed
		
		//Assert.assertEquals("John", 88);   //Failed
		
		
		//Assert.assertEquals(123, "123");
		
		//Assert.assertTrue(true);    //Passed
		
		//Assert.assertNotEquals("222", "555");   //passed
		
		
		//Assert.assertNotEquals("000", "111");   //Passed
		
		
		//Assert.assertFalse(true);      //failed
   		
		
		//Assert.assertTrue(1==2);   //Failed
		
		//Assert.assertFalse(3==4);   //passed
		
		
	}

}
