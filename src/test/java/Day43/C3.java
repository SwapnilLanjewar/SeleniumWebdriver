package Day43;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class C3 
{
	
	@BeforeSuite
	void testbeforesuite() 
	{
		System.out.println("This is Before suite");
	}
	
	@AfterSuite
	void testaftersuite() 
	{
		System.out.println("This is after suite");
	}
	
	
}
