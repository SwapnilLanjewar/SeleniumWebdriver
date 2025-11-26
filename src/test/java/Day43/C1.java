package Day43;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 
{
	@Test(priority=1)
	void abc() 
	{
		System.out.println("This is abc from C1");
	}
	
	@BeforeTest
	void testbefore() 
	{
		System.out.println("This is Before Method");
	}
}
