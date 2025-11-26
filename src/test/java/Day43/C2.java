package Day43;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 
{
	@Test(priority=2)
	void abc() 
	{
		System.out.println("This is abc from C2");
	}
	
	@AfterTest
	void testafter() 
	{
		System.out.println("This is After Method");
	}
}
